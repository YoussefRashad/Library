/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import java.io.Serializable;


/**
 *
 * @author DELL
 */
public abstract class Person implements Serializable{
    private int ID =0 , Age =0;
    private String IDNational = "";
    private String Name ="" , DOB="##" , ProfileImage="";
    private char Gender ;
    //FileManager FManager = new FileManager();

    public Person() {
    }

    public Person(int ID, int Age, String IDNational , String Name ,String DOB, char Gender, String ProfileImage) {
        this.Age = Age;
        this.ID = ID;
        this.IDNational = IDNational;
        this.Name = Name;
        this.setDOB(DOB);
        this.Gender = Gender;
        this.ProfileImage = ProfileImage;
    }
    public void setProfileImage(String ProfileImage){
        this.ProfileImage=ProfileImage;
    }
    public String getProfileImage(){
        return this.ProfileImage;
    }
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getIDNational() {
        return this.IDNational;
    }

    public void setIDNational(String IDNational) {
        this.IDNational = IDNational;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        String Sepreted[] = DOB.split("#");
        this.DOB=Sepreted[0] +"#"+ Sepreted[1] + "#"+Sepreted[2];
    }

    public char getGender() {
        return this.Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
    
    
    
    
    
    
}
