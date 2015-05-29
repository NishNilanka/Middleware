/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers;

import clientone.Student;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nishan Gunawardena
 */
public class ServerOne extends Thread {

    int port = 3074;
    private ObjectInputStream inStream;

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

    public double calGPA() {
        return 1.00;
    }

    public void communicate(Socket accept) {
        try {
            InetAddress InetAddress = accept.getInetAddress();
            System.err.println(InetAddress + " get connected...\n");
            inStream = new ObjectInputStream(accept.getInputStream());
            Student student = (Student) inStream.readObject();
            System.out.println("Object received = " + student.getIndexNum());
            accept.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}
