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
public final class Seller extends Staff implements Serializable {
    
    
    private final String FilePath = "Seller.bin";
    private ArrayList<Seller> sellers = new ArrayList<Seller>();
    

    public Seller() {
    }
    

    public Seller(int ID, int Age, String IDNational, String Name, String DOB, char Gender, String Email, String Pass, String PhoneNo, String Adress, String UserName , int OfficeHour , double Salary , String Qualification, String JobTitle, String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName, OfficeHour, Salary, Qualification, JobTitle, ProfileImage);
        
    }
    public int NoOfSellerReport()
    {
        LoadFromFile();
        return sellers.size();
    }

    @Override
    public boolean Add() 
    {
        LoadFromFile();
        sellers.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) 
    {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            sellers.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) 
    {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            sellers.set(index, this);
            return commitToFile();
        }
        return false;   
    }

    @Override
    public int getIndexof(int ID) 
    {
        for(int i=0;i<sellers.size();i++)
            if(sellers.get(i).getID()== ID)
                return i;
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) 
    {
        LoadFromFile();
        for(Seller a : sellers)
            if(a.getID()==ID)
                return true;
        return false;
    }

    @Override
    public void LoadFromFile() 
    {
        sellers = (ArrayList<Seller>) FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() 
    {
        return FManager.writeBinary(FilePath, sellers);
    }

    @Override
    public boolean Dublicate(int ID) 
    {
        LoadFromFile();
        for(Seller a : sellers)
            if(a.getID()==ID)
                return true;
        return false;
    }

    @Override
    public String getFile() { 
        return this.getID()+"`"+this.getAge()+"`"+this.getIDNational()+"`"+this.getName()+"`"+this.getDOB()+"`"+this.getGender()+"`"+this.getEmail()+"`"+this.getPass()+"`"+
                this.getPhoneNo()+"`"+this.getAddress()+"`"+this.getUserName()+"`"+this.getOfficeHour()+"`"+this.getSalary()+/*"`"+this.getProfileImage()+*/"`"
                +this.getQualification()+"`"+this.getJobTitle()+"`";
    }

    @Override
    public Manage get(int ID) 
    {
        LoadFromFile();
        for(Seller a : sellers)
            if(a.getID()== ID)
                return a;
        return null;
    }

    @Override
    public boolean LogIn(String Email, String Pass) 
    {
         LoadFromFile();
        for(Seller a : sellers)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return true;
        return false;
    }


    public ArrayList<Seller> ListAllSeller() 
    {
        LoadFromFile();
        return sellers;
    }

    
    
    
    
}
