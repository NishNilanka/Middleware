/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;


import Servers.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nishan Gunawardena
 */
public class Broker extends Thread{
    
    
    public static void main(String arg[])
    {
        Broker b = new Broker();
        ServerOne sOne= new ServerOne();
        ServerTwo sTwo = new ServerTwo();
        
        b.start();
        sOne.start();
        sTwo.start();
        
        sOne.calGPA();
        sTwo.getRank();
        
    }
    @Override
    public void run()
    {
         try {
            ServerSocket server = new ServerSocket(3080);
            System.err.println("Broker is listening to port :  3080");
            Socket accept = server.accept();
            InetAddress InetAddress = accept.getInetAddress();
            BufferedReader bf = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            PrintWriter print = new PrintWriter(accept.getOutputStream(), true);
            String Str;
            while (true) {

                Str = bf.readLine();
                System.out.println("Client - " + InetAddress + " : " + Str);

                if (Str.equals("Bye")) {
                    break;
                }


                print.println(Str);
            }
            System.err.println("Connection terminated");
            print.close();
            bf.close();
            accept.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }
        
    }
    
}
