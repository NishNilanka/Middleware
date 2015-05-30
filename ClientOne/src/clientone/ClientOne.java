/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import javax.swing.JOptionPane;
import middleware.Middleware;
import middleware.Student;
/*import org.json.simple.JSONArray;
 import org.json.simple.JSONObject;
 import com.google.gson.Gson;*/

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
    public void setNewStudent(Student newStudent) throws ClassNotFoundException {
        this.newStudent = newStudent;
        AddStudent(newStudent);
    }

    public void AddStudent(Student std) throws ClassNotFoundException {

        Middleware b = new Middleware();
        b.clientStubAdd(std);


    }
}
