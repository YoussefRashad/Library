/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IMethods {
    FileManagerBinary FManager = new FileManagerBinary();
    
    public boolean Add();
    public boolean Remove(int ID);
    public boolean Edit(int ID);
    public int getIndexof(int ID);
    public boolean SearchFor(int ID);
    public void LoadFromFile();
    public boolean commitToFile(); // el phase el 2 htb2y b boolean
    public boolean Dublicate(int ID);
    //public abstract ArrayList<Object> ListAll();// Admin htt4al w yt7d bdlha 2sm el Class , aw Casting lma trg3
    public String getFile(); //Equal toString >> return this.ID+"~"+this.Name+"~"; 
    
}
