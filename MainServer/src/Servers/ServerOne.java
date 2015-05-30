/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers;

import clientone.Student;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nishan Gunawardena
 */
public class ServerOne extends Thread {

    int port = 3074;
    private ObjectInputStream inStream;
    private ObjectOutputStream outputStream;

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(port);
            System.err.println("Server One is listening to port : " + port);
            while (true) {
                Socket accept = server.accept();
                communicate(accept);
                accept.close();
                break;
            }


        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public double calGPA(double a, double b, double c, double d, double e, double f) {
        double gpa = (a + b + c + d + e + f) / 6;
        return gpa;

    }

    public void communicate(Socket accept) {
        try {
            InetAddress InetAddress = accept.getInetAddress();
            System.err.println(InetAddress + " get connected...\n");
            inStream = new ObjectInputStream(accept.getInputStream());
            Student student = (Student) inStream.readObject();
            System.out.println("Object received = " + student.getStdNam());

            System.out.println("Object received = " + student.getIndexNum());
            double subject1 = (int) student.getScs_01();
            double subject2 = (int) student.getScs_02();
            double subject3 = (int) student.getScs_03();
            double subject4 = (int) student.getScs_04();
            double subject5 = (int) student.getScs_05();
            double subject6 = (int) student.getScs_06();
            double gp1 = calGPA(subject1, subject2, subject3, subject4, subject5, subject6);
            System.out.println("GPA " + gp1);

            outputStream = new ObjectOutputStream(accept.getOutputStream());
            outputStream.writeObject(gp1);

            
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}
