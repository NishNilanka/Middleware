/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nishan Gunawardena
 */
public class ServerTwo extends Thread {
    private ObjectInputStream inStream = null;
    int port = 3075;
    @Override
    public void run()
    {
         try {
            ServerSocket server = new ServerSocket(port);
            System.err.println("Server Two is listening to port : "+ port);
            Socket accept = server.accept();
            inStream = new ObjectInputStream(accept.getInputStream());
            InetAddress InetAddress = accept.getInetAddress();
            System.err.println(InetAddress + " get connected...");
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

    public void getRank() {
        System.out.print("Hi");
    }
}
