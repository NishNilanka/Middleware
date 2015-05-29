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
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/*import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.google.gson.Gson;*/

/**
 *
 * @author Nishan Gunawardena
 */
public class ClientOne {

    private ObjectInputStream inputStream = null;
    private ObjectOutputStream outputStream = null;
    private Student newStudent;
    private boolean isConnected;
    private Socket socket;
    
    public void  client(Student std ) {
        
            
       
        try {
            Socket clientSocket = new Socket("127.0.0.1", 3074);
            System.err.println("Clien was connected to the server ");
            
            outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            // Creating input and putput stream to read and write
            //Scanner to read the data from keyboard
            
            System.err.println("Terminating the client connection.");

            clientSocket.close();
        } catch (UnknownHostException ex) {
             System.err.println("Server Not Reachable");
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Server Not Reachable");
        }
    }
       /**
     * @return the newStudent
     */
    public Student getNewStudent() {
        return newStudent;
    }

    /**
     * @param newStudent the newStudent to set
     */
    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
        AddStudent(newStudent);
    }
    
    public void AddStudent(Student std)
    {
         while (!isConnected) {
            try {
                socket = new Socket("localHost", 3074);
                System.out.println("Connected");
                isConnected = true;
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                System.out.println("Object to be written = " + std);
                outputStream.writeObject(std);


            } catch (SocketException se) {
                JOptionPane.showMessageDialog(null, "Erro !");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ! IOException");
            }
        }
    }
}
