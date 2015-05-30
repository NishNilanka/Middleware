/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.util.ArrayList;
import middleware.Student;

/**
 *
 * @author GWSC GINTOTA
 */
public class GetData {
     
  public  ArrayList<Student> getDetalis(){
      Student s1=new Student();
      s1.setStdNam("ddadsa");
      s1.setGpa(23);
    ArrayList<Student>  Array1=new  ArrayList<Student> ();
    Array1.add(s1);
      return Array1;
    
    
}
    
    
}
