/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;


import Servers.*;

/**
 *
 * @author Nishan Gunawardena
 */
public class Broker {
    
    
    public static void main(String arg[])
    {
        
        ServerOne sOne= new ServerOne();
        ServerTwo sTwo = new ServerTwo();
        
        sOne.start();
        sTwo.start();
        
        sOne.calGPA();
        sTwo.getRank();
        
    }
    
}
