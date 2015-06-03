/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.io.IOException;
import javax.swing.JOptionPane;
import middleware.Middleware;
import middleware.Student;


/**
 *
 * @author Nishan Gunawardena
 */
public class ClientOne {

    private Student newStudent;

    /**
     * @return the newStudent
     */
    public Student getNewStudent() {
        return newStudent;
    }

    /**
     * @param newStudent the newStudent to set
     */
    public void setNewStudent(Student newStudent) throws ClassNotFoundException, IOException {
        this.newStudent = newStudent;
        AddStudent(newStudent);
    }

    public void AddStudent(Student std) throws ClassNotFoundException, IOException {

        Middleware b = new Middleware();
        b.clientStubAdd(std);


    }
    
    public void showGPA(Student std)
    {
        JOptionPane.showMessageDialog(null, "Student GPA is " + std.getGpa(), "Reply from Server - GPA", JOptionPane.INFORMATION_MESSAGE);
    }
}
