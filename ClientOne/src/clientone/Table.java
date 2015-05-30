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
    private final static String[] COLUMN_NAME = {"NAME","SCS 1101","SCS 1102","SCS 1103","SCS 1104","SCS 1105","SCS 1106","GPA", };
     private static ArrayList<Student> list;
     
      public Table(ArrayList<Student> list) {
        this.list = list;
        
        //System.err.println(list);
    }
      @Override
    public String getColumnName(int ColumnIndex)
    {
        return COLUMN_NAME[ColumnIndex];
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
                return list.get(rowIndex).getScs_01();
            case(2):
                return list.get(rowIndex).getScs_02();
            case(3):
                return list.get(rowIndex).getScs_03();
            case(4):
                return list.get(rowIndex).getScs_04();
            case(5):
                return list.get(rowIndex).getScs_05();
            case(6):
                return list.get(rowIndex).getScs_06();
            case(7):
                return list.get(rowIndex).getGpa();
           
           
           
            default:
                return "Error";
        }
    }
    
}
