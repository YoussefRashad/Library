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
public final class Client extends Manage implements IMethods ,Serializable{

    private final String FilePath = "Client.bin";
    private ArrayList<Client> clients = new ArrayList<Client>();
    
    public Client() {
    }

    public Client(int ID, int Age, String IDNational, String Name, String DOB, char Gender, String Email, String Pass, String PhoneNo, String Adress, String UserName, String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName,ProfileImage);
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public void setClients(Client clients) {
        this.clients.add(clients) ;
    }
    
    public ArrayList<Client> ListAllClients() {
        LoadFromFile();
        return  clients ;
    }

    @Override
    public Manage get(int ID) {
        LoadFromFile();
        for(Client a : clients)
            if(a.getID()==ID)
                return a;
        return null;
    }
    public Manage get(String Email, String Pass) {
        LoadFromFile();
        for(Client a : clients)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return a;
        return null;
    }
    
    @Override
    public boolean LogIn(String Email, String Pass) {
        if(Email.equals("Client@yahoo.com")&&Pass.equals("12345678"))
            return true;
        LoadFromFile();
        for(Client a : clients)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return true;
        return false;
    }

    @Override
    public boolean Add() {
        LoadFromFile();
        clients.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            clients.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            clients.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) {
        for(int i=0;i<clients.size();i++)
            if(clients.get(i).getID()==ID)
                return i;
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for(Client a : clients)
            if(a.getID()==ID)
                return true;
        return false;
    }

    @Override
    public void LoadFromFile() {
        clients = (ArrayList<Client>) FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, clients);
    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for(Client a : clients)
            if(a.getID()==ID)
                return true;
        return false;
    }
    public Client openMyProfile(String Email , String Pass)
    {
        LoadFromFile();
        for(Client ad:clients)
            if(ad.Email.equals(Email)&&ad.Pass.equals(Pass))
                return ad;
        return null;
    }

    @Override
    public String getFile() {
        return this.getID()+"`"+this.getAge()+"`"+this.getIDNational()+"`"+this.getName()+"`"+this.getDOB()+"`"+this.getGender()+"`"+this.getEmail()+"`"+this.getPass()+"`"+
                this.getPhoneNo()+"`"+this.getAddress()+"`"+this.getUserName()+"`"/*+this.getProfileImage()+"`"*/;
    }    
    
    
}
