/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverone;

/**
 *
 * @author Nishan Gunawardena
 */
public class Salary {
    
    float basic = 20000;
    
    float calculateSalary(float otHours){
        float otValue = otHours * 110;
        return (otValue + basic);
    }
}
