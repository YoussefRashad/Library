/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class Manage extends Person implements Serializable{
    String  Email ="" , Pass ="" , PhoneNo ="" , Address ="" , UserName ="" ;

    public Manage() {
    }

    public Manage(int ID, int Age, String IDNational, String Name, String DOB, char Gender , String Email , String Pass ,String PhoneNo ,String Adress , String UserName , String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender,ProfileImage);
        this.Address = Adress;
        this.Email = Email;
        this.Pass = Pass;
        this.PhoneNo = PhoneNo;
        this.UserName = UserName;
        
    }
    
    
    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return this.Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getPhoneNo() {
        return this.PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public abstract Manage get(int ID);// Admin htt4al w yt7d bdlha 2sm el Class , aw Casting lma trg3
    public abstract boolean LogIn(String Email, String Pass);
    
    
    
}
