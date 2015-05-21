/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverone;

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
public class ServerOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3074);
            System.err.println("Server is listening to port : 3074");
            Socket accept = server.accept();
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
}
