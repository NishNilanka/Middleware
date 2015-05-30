/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middleware;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nishan Gunawardena
 */
public class Middleware extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Middleware m = new Middleware();
        m.start();
    }
    private Socket socket;
    private boolean isConnected;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inStream;
    private Double gpa;

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(100);

            while (true) {
                Socket accept = server.accept();
                System.out.println(accept.getPort());
                //communicate(accept);
                accept.close();
                break;
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    void serverSkeleton(Socket client, int type) {
        
    }

    public void clientStubAdd(Student std) {
        try {
            socket = new Socket("localHost", 3074);//Middleware decides the port
            System.out.println("Connected");
            isConnected = true;
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Object to be written = " + std);
            outputStream.writeObject(std);

            inStream = new ObjectInputStream(socket.getInputStream());
            gpa = (Double) inStream.readObject();
            JOptionPane.showMessageDialog(null, "Student GPA is " + gpa, "Reply from Server - GPA", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Object received(GPA) = " + gpa);
            isConnected = false;
            outputStream.close();
            inStream.close();
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Error ! unkonow Host");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error ! IOException");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error !");
        }
    }
}
