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
public final class Admin extends Manage implements IMethods,Serializable{
    
    private final String FilePath = "Admin.bin";
    private ArrayList<Admin> admins = new ArrayList<Admin>();

    public Admin() {
    }

    public Admin(int ID, int Age, String IDNational, String Name, String DOB, char Gender, String Email, String Pass, String PhoneNo, String Adress, String UserName , String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName, ProfileImage);
    }

    @Override
    public Manage get(int ID) {
        LoadFromFile();
        for(Admin a : admins)
            if(a.getID()==ID)
                return a;
        return null;
    }
    public Manage get(String Email, String Pass) {
        LoadFromFile();
        for(Admin a : admins)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return a;
        return null;
    }

    
    public ArrayList<Admin> ListAllAdmin() {
        LoadFromFile();
        return admins;
    }

    @Override
    public boolean LogIn(String Email, String Pass) {
        if(Email.equals("Admin@yahoo.com")&&Pass.equals("12345678"))
            return true;
        LoadFromFile();
        for(Admin a : admins)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return true;
        return false;
    }

    @Override
    public boolean Add() {
        LoadFromFile();
        admins.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            admins.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            admins.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) {
        for(int i=0;i<admins.size();i++)
            if(admins.get(i).getID()==ID)
                return i;
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for(Admin a : admins)
            if(a.getID()==ID)
                return true;
        return false;
    }

    @Override
    public void LoadFromFile() {
            admins = (ArrayList<Admin>) FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, admins);
    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for(Admin a : admins)
            if(a.getID()==ID)
                return true;
        return false;
    }
    //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
    @Override
    public String getFile() {
        return this.getID()+"`"+this.getAge()+"`"+this.getIDNational()+"`"+this.getName()+"`"+this.getDOB()+"`"+this.getGender()+"`"+this.getEmail()+
                "`"+this.getPass()+"`"+this.getPhoneNo()+"`"+this.getAddress()+"`"+this.getUserName()+"`";
    }
}
