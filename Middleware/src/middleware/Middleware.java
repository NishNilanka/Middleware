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

    public Student serverSkeletonGet(Student student) {
        //unmarshalling
        String subject1 = student.getScs_01();
        String subject2 = student.getScs_02();
        String subject3 = student.getScs_03();
        String subject4 = student.getScs_04();
        String subject5 = student.getScs_05();
        String subject6 = student.getScs_06();
        
        
       
        return student;

    }

    public void clientStubAdd(Student std) throws IOException {
        try {
            socket = new Socket("localHost", 3074);//Middleware decides the port
            System.out.println("Connected");
            isConnected = true;
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Object to be written = " + std);
            outputStream.writeObject(std);

            inStream = new ObjectInputStream(socket.getInputStream());
            System.err.println("Fuck123");
            Student student = (Student) inStream.readObject();
            System.err.println("hukapan");
            JOptionPane.showMessageDialog(null, "Student GPA is " + student.getGpa(), "Reply from Server - GPA", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Object received(with GPA) = " + student);
            isConnected = false;
            
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Error ! unkonow Host");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error ! IOException");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error !");
        }
        finally
        {
            outputStream.close();
            inStream.close();
            socket.close();
            
        }
    }
}
