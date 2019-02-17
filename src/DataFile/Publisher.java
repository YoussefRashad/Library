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
public final class Publisher implements Serializable{

//    private final String FilePath = "Publisher.txt";
//    private ArrayList<Publisher> publishers = new ArrayList<Publisher>(5);
    private String DOPublisher ="##",NamePublisher="";
    public Publisher() {
    }

    public Publisher(String DOPublisher,String NamePublisher){
        this.NamePublisher=NamePublisher;
        this.DOPublisher=DOPublisher;
    }

    public String getNamePublisher() {
        return NamePublisher;
    }

    public void setNamePublisher(String NamePublisher) {
        this.NamePublisher = NamePublisher;
    }
    public String getDOPublisher() {
        return this.DOPublisher;
    }

    public void setDOPublisher(String DOPublisher) {
        String Sepreted[] = DOPublisher.split("#");
        this.DOPublisher=Sepreted[0] +"#"+ Sepreted[1] + "#"+Sepreted[2];
    }
    
    
}
