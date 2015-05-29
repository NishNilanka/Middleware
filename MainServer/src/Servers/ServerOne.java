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
                System.out.println("4");
            }
            

        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public double calGPA(double a,double b,double c,double d,double e,double f) {
        double gpa=(a+b+c+d+e+f)/6;
        return gpa;
        
    }

    public void communicate(Socket accept) {
        try {
            InetAddress InetAddress = accept.getInetAddress();
            System.err.println(InetAddress + " get connected...\n");
            System.out.println("2");
            inStream = new ObjectInputStream(accept.getInputStream());
            System.out.println("2");
            Student student = (Student) inStream.readObject();
            System.out.println("2");
            System.out.println("Object received = " + student.getStdNam());
            System.out.println("2");

            System.out.println("Object received = " + student.getIndexNum());
            double subject1=(int) student.getScs_01();
            double subject2=(int) student.getScs_02();
            double subject3=(int) student.getScs_03();
            double subject4=(int) student.getScs_04();
            double subject5=(int) student.getScs_05();
            double subject6=(int) student.getScs_06();
            double gp1=calGPA(subject1, subject2, subject3, subject4, subject5, subject6);
            System.out.println("callllllllllllllgpaaaaaaa"+gp1);
            accept.close();
            System.out.println("3");
        } catch (IOException ex) {
            System.err.println(ex);
            System.out.println("12");
        } catch (ClassNotFoundException ex) {
            System.out.println("34");
            System.err.println(ex);
        }
    }
}
