/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middleware;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Nishan Gunawardena
 */
public class Middleware extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Middleware m = new Middleware();
        m.start();
    }
    
    @Override
    public void run()
    {
        try {
            ServerSocket server = new ServerSocket(100);
            
            while (true) {
                Socket accept = server.accept();
                System.out.println(accept.getPort());
                //communicate(accept);
                accept.close();
                break;
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
    void serverSkeleton(Socket client,int type)
    {
        //type = calculate the GPA call to the ServerOne
        
        
    }
    
    void clientStub(Socket server,int type)
    {
        
    }
}
