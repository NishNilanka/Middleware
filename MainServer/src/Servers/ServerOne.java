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
import java.util.logging.Logger;

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
            }


        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public double calGPA(String a, String b, String c, String d, String e, String f) {
        //credits for subjects;
        
        double point_aplus =4;
        double point_a =4;
        double point_aminus=3.75;
        double point_bplus =3.25;
        double point_b =3;
        double point_bminus =2.75;
        double point_cplus =2.25;
        double point_c =2;
        double point_cminus =1.75;
        double point_dplus =1.25;
        double point_d =1;
        double point_dminus=0.75;
        double point_e=0;
        
        double sub1=0;
        double sub2=0;
        double sub3=0;
        double sub4=0;
        double sub5=0;
        double sub6=0;
       
        if("A+".equals(a)){
            sub1=4;
        }
        else if("A-".equals(a)){
            sub1=4;
        }
        else if("A".equals(a)){
            sub1=3.75;
        }
        else if("B+".equals(a)){
            sub1=3.25;
        }
        else if("B".equals(a)){
            sub1=3;
        }
        else if("B-".equals(a)){
            sub1=2.75;
        }
        else if("C+".equals(a)){
            sub1=2.25;
        }
        else if("C".equals(a)){
            sub1=2;
        }
        else if("C-".equals(a)){
            sub1=1.75;
        }
        else if("D+".equals(a)){
            sub1=1.25;
        }
        else if("D".equals(a)){
            sub1=1;
        }
        else if("D-".equals(a)){
            sub1=0.75;
        }
        else if("E".equals(a)){
            sub1=0;
        }
        double class1=sub1*2;
 //==============================================================       
        if("A+".equals(b)){
            sub2=4;
        }
        else if("A-".equals(b)){
            sub2=4;
        }
        else if("A".equals(b)){
            sub2=3.75;
        }
        else if("B+".equals(b)){
            sub2=3.25;
        }
        else if("B".equals(b)){
            sub2=3;
        }
        else if("B-".equals(b)){
            sub2=2.75;
        }
        else if("C+".equals(b)){
            sub2=2.25;
        }
        else if("C".equals(b)){
            sub2=2;
        }
        else if("C-".equals(b)){
            sub2=1.75;
        }
        else if("D+".equals(b)){
            sub2=1.25;
        }
        else if("D".equals(b)){
            sub2=1;
        }
        else if("D-".equals(b)){
            sub2=0.75;
        }
        else if("E".equals(b)){
            sub2=0;
        }
        double class2=sub2*2;
        //===================================================================
        
        
        if("A+".equals(c)){
            sub3=4;
        }
        else if("A-".equals(c)){
            sub3=4;
        }
        else if("A".equals(c)){
            sub3=3.75;
        }
        else if("B+".equals(c)){
            sub3=3.25;
        }
        else if("B".equals(c)){
            sub3=3;
        }
        else if("B-".equals(c)){
            sub3=2.75;
        }
        else if("C+".equals(c)){
            sub3=2.25;
        }
        else if("C".equals(c)){
            sub3=2;
        }
        else if("C-".equals(c)){
            sub3=1.75;
        }
        else if("D+".equals(c)){
            sub3=1.25;
        }
        else if("D".equals(c)){
            sub3=1;
        }
        else if("D-".equals(c)){
            sub3=0.75;
        }
        else if("E".equals(c)){
            sub3=0;
        }
        double class3=sub3*2;
     //=====================================================================================   
        if("A+".equals(d)){
            sub4=4;
        }
        else if("A-".equals(d)){
            sub4=4;
        }
        else if("A".equals(d)){
            sub4=3.75;
        }
        else if("B+".equals(d)){
            sub4=3.25;
        }
        else if("B".equals(d)){
            sub4=3;
        }
        else if("B-".equals(d)){
            sub4=2.75;
        }
        else if("C+".equals(d)){
            sub4=2.25;
        }
        else if("C".equals(d)){
            sub4=2;
        }
        else if("C-".equals(d)){
            sub4=1.75;
        }
        else if("D+".equals(d)){
            sub4=1.25;
        }
        else if("D".equals(d)){
            sub4=1;
        }
        else if("D-".equals(d)){
            sub4=0.75;
        }
        else if("E".equals(d)){
            sub4=0;
        }
        double class4=sub4*2;
        //================================================================
        if("A+".equals(e)){
            sub5=4;
        }
        else if("A-".equals(e)){
            sub5=4;
        }
        else if("A".equals(e)){
            sub5=3.75;
        }
        else if("B+".equals(e)){
            sub5=3.25;
        }
        else if("B".equals(e)){
            sub5=3;
        }
        else if("B-".equals(e)){
            sub5=2.75;
        }
        else if("C+".equals(e)){
            sub5=2.25;
        }
        else if("C".equals(e)){
            sub5=2;
        }
        else if("C-".equals(e)){
            sub5=1.75;
        }
        else if("D+".equals(e)){
            sub5=1.25;
        }
        else if("D".equals(e)){
            sub5=1;
        }
        else if("D-".equals(e)){
            sub5=0.75;
        }
        else if("E".equals(e)){
            sub5=0;
        }
        double class5=sub5*2;
        //============================================================================
        
        if("A+".equals(f)){
            sub6=4;
        }
        else if("A-".equals(f)){
            sub6=4;
        }
        else if("A".equals(f)){
            sub6=3.75;
        }
        else if("B+".equals(f)){
            sub6=3.25;
        }
        else if("B".equals(f)){
            sub6=3;
        }
        else if("B-".equals(f)){
            sub6=2.75;
        }
        else if("C+".equals(f)){
            sub6=2.25;
        }
        else if("C".equals(f)){
            sub6=2;
        }
        else if("C-".equals(f)){
            sub6=1.75;
        }
        else if("D+".equals(f)){
            sub6=1.25;
        }
        else if("D".equals(f)){
            sub6=1;
        }
        else if("D-".equals(f)){
            sub6=0.75;
        }
        else if("E".equals(f)){
            sub6=0;
        }
        double class6=sub6*2;
    
        
        System.out.println("Class111111===="+class1);
        System.out.println("Class111111===="+class2);
        System.out.println("Class111111===="+class3);
        System.out.println("Class111111===="+class4);
        System.out.println("Class111111===="+class5);
        System.out.println("Class111111===="+class6);
        double gpa = (class1+class2+class3+class4+class5+class6) / 12;
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
            String subject1 =  student.getScs_01();
            String subject2 =  student.getScs_02();
            String subject3 = student.getScs_03();
            String subject4 = student.getScs_04();
            String subject5 =  student.getScs_05();
            String subject6 =  student.getScs_06();
            double gp1 = calGPA(subject1, subject2, subject3, subject4, subject5, subject6);
            System.out.println("GPA " + gp1);

            outputStream = new ObjectOutputStream(accept.getOutputStream());
            outputStream.writeObject(gp1);

            accept.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}
