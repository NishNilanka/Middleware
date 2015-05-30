/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientone;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author GWSC GINTOTA
 */
public class Student implements Serializable {
    private String stdNam;
    private int indexNum;
    private String scs_01;
    private String scs_02;
    private String scs_03;
    private String scs_04;
    private String scs_05;
    private String scs_06;
    private float gpa;
    private float rank;

    /**
     * @return the stdNam
     */
    public String getStdNam() {
        return stdNam;
    }

    /**
     * @param stdNam the stdNam to set
     */
    public void setStdNam(String stdNam) {
        this.stdNam = stdNam;
              
    }

    /**
     * @return the indexNum
     */
    public int getIndexNum() {
        return indexNum;
    }
    public void setIndexNum(int indexNum ){
        this.indexNum=indexNum;
    }

    /**
     * @return the scs_01
     */
    public String getScs_01() {
        return scs_01;
    }

    /**
     * @param scs_01 the scs_01 to set
     */
    public void setScs_01(String scs_01) {
        this.scs_01 = scs_01;
    }

    /**
     * @return the scs_02
     */
    public String getScs_02() {
        return scs_02;
    }

    /**
     * @param scs_02 the scs_02 to set
     */
    public void setScs_02(String scs_02) {
        this.scs_02 = scs_02;
    }

    /**
     * @return the scs_03
     */
    public String getScs_03() {
        return scs_03;
    }

    /**
     * @param scs_03 the scs_03 to set
     */
    public void setScs_03(String scs_03) {
        this.scs_03 = scs_03;
    }

    /**
     * @return the scs_04
     */
    public String getScs_04() {
        return scs_04;
    }

    /**
     * @param scs_04 the scs_04 to set
     */
    public void setScs_04(String scs_04) {
        this.scs_04 = scs_04;
    }

    /**
     * @return the scs_05
     */
    public String getScs_05() {
        return scs_05;
    }

    /**
     * @param scs_05 the scs_05 to set
     */
    public void setScs_05(String scs_05) {
        this.scs_05 = scs_05;
    }

    /**
     * @return the scs_06
     */
    public String getScs_06() {
        return scs_06;
    }

    /**
     * @param scs_06 the scs_06 to set
     */
    public void setScs_06(String scs_06) {
        this.scs_06 = scs_06;
    }

 
    public static void writetofile(Student obj)throws IOException{
        ObjectOutputStream objectoutputstream=new ObjectOutputStream(new FileOutputStream("details.bin"));
        objectoutputstream.writeObject(obj);
    }

    /**
     * @return the gpa
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the rank
     */
    public float getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(float rank) {
        this.rank = rank;
    }
}
