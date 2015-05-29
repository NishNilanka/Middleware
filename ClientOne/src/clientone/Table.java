/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GWSC GINTOTA
 */
public class Table extends AbstractTableModel {
    private final static String[] COLUMN_NAME = {"NAME","GPA", "RANK"};
     private static ArrayList<Student> list;
     
      public Table(ArrayList<Student> list) {
        this.list = list;
        
        //System.err.println(list);
    }
    
    
    

    @Override
    public int getRowCount() {
        return list.size();
         //To change body of generated methods, choose Tools | Templates.
    }

     public String  getColumnCount(int ColumnIndex) {
       return COLUMN_NAME[ColumnIndex];//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getColumnCount() {
        return COLUMN_NAME.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case(0):
                return list.get(rowIndex).getStdNam();
            case(1):
                return list.get(rowIndex).getGpa();
            case(2):
                return list.get(rowIndex).getRank();
           
            default:
                return "Error";
        }
    }
    
}
