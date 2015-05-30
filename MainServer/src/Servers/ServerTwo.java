/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import middleware.Student;

/**
 *
 * @author Nishan Gunawardena
 */
public class ServerTwo extends Thread {
    private ObjectInputStream inStream = null;
    int port = 3075;
    private ObjectOutputStream outputStream;

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(port);
            System.err.println("Server One is listening to port : " + port);
            while (true) {
                Socket accept = server.accept();
                communicate(accept);
            }


        } catch (IOException ex) {
            System.err.println(ex);
        }

    }



    public void communicate(Socket accept) {
        try {
            InetAddress InetAddress = accept.getInetAddress();
            System.err.println(InetAddress + " get connected...\n");
            inStream = new ObjectInputStream(accept.getInputStream());
            Student student = (Student) inStream.readObject();
            

            accept.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public void getRank() {
        
    }
}
