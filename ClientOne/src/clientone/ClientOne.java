/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Nishan Gunawardena
 */
public class ClientOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.1", 3074);
            System.err.println("Clien was connected to the server ");
            // Creating input and putput stream to read and write
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            //Scanner to read the data from keyboard
            Scanner x = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Your Message :");
                String s = x.nextLine();
                //Send the message
                out.println(s);
                if (s.equals("bye")) {
                    break;
                }
                //Read the echo from the server
                s = in.readLine();
                //Print it on the terminal
                System.out.println("Sever: " + s);
            }
            // Now terminate the client connection.
            System.err.println("Terminating the client connection.");
            out.close();
            in.close();
            clientSocket.close();
        } catch (UnknownHostException ex) {
             System.err.println("fuck");
        } catch (IOException ex) {
             System.err.println("Server Not Reachable");
        }
    }
}
