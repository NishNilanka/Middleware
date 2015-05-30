/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nishan Gunawardena
 */
public class MainServer extends Thread {
    public static void main(String arg[])
    {
        MainServer b = new MainServer();
        ServerOne sOne= new ServerOne();
        ServerTwo sTwo = new ServerTwo();
        
        b.start();
        sOne.start();
        sTwo.start();
        
        sOne.calGPA(null, null, null, null, null, null);
        sTwo.getRank();
        //System.out.println(sOne.calGPA(MIN_PRIORITY, MIN_PRIORITY, MIN_PRIORITY, MIN_PRIORITY, MIN_PRIORITY, MIN_PRIORITY)+2);
    }
    @Override
    public void run()
    {
         try {
            ServerSocket server = new ServerSocket(3080);
            System.err.println("Broker is listening to port :  3080");
            Socket accept = server.accept();
            
            accept.close();

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
