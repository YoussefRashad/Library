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
public final class SubSection implements IMethods,Serializable{
    private int SubSectionID=0;
    private String SubSectionName ="";
    private final String FilePath="SubSection.bin";
    private ArrayList<SubSection> subsections = new ArrayList<SubSection>();
    public Section sec = new Section();

    public SubSection() {
    }
    public SubSection(int SubSectionID, String SubSectionName) {
        this.SubSectionID=SubSectionID;
        this.SubSectionName=SubSectionName;
    }
    

    public int getSubSectionID() {
        return this.SubSectionID;
    }

    public void setSubSectionID(int SubSectionID) {
        this.SubSectionID = SubSectionID;
    }

    public String getSubSectionName() {
        return this.SubSectionName;
    }

    public void setSubSectionName(String SubSectionName) {
        this.SubSectionName = SubSectionName;
    }
    
    @Override
    public boolean Add() {
        LoadFromFile();
        subsections.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            subsections.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            subsections.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) {
        for(int i=0; i<subsections.size();i++)
            if(subsections.get(i).SubSectionID == ID)
                return i;
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for(SubSection s : subsections)
            if(s.SubSectionID == ID)
                return true;
        return false;
    }

    @Override
    public void LoadFromFile() {
        subsections = (ArrayList<SubSection>)FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, subsections);
    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for(SubSection s : subsections)
            if(s.SubSectionID==ID)
                return true;
        return false;
    }
    public int getIDFromNameSubsection(String Name)
    {
        LoadFromFile();
        for(SubSection s : subsections)
            if(s.SubSectionName.equals(Name))
                return s.getSubSectionID();
        return -1;
    }

    @Override
    public String getFile() {
        return this.SubSectionID+"`"+this.SubSectionName+"`"+this.sec.getSectionID()+"`";
    }
    public String getFileForCategory() {
        return new Category().searchForCategoryNameSubSectionPanel(new Category().getNameCategory())+"`"+this.searchForGetSubSectionName(this.SubSectionID)+"`"+this.sec.getSectionID()+"`";
    }

    public SubSection getSubSection(int ID) {
        LoadFromFile();
        for(SubSection s : subsections)
            if(s.SubSectionID==ID)
                return s;
        return null;
    }


    public ArrayList<SubSection> ListAllSubSections() {
        LoadFromFile();
        return subsections;
    }
    public String[] ListAllNameOfSubSections() // Report
     {
         LoadFromFile();
         String []SS = new String[this.subsections.size()];
         for(int i=0;i<SS.length;i++)
             SS[i]=this.subsections.get(i).getSubSectionName();
         return SS;
     }
    public String[] ListAllIDOfSubSections() // Report
     {
         LoadFromFile();
         String []SS = new String[this.subsections.size()];
         for(int i=0;i<SS.length;i++)
             SS[i]=String.valueOf(this.subsections.get(i).getSubSectionID());
         return SS;
     }
    public int NoOfSubSectionInSepecificSection(int ID)//Report
    {
        LoadFromFile();
        int count=0;
        for(SubSection s : subsections)
            if(s.sec.getSectionID()==ID)
                count++;
        return count;
    }
    public int SearchForSubSectionIDPanel(String SubSectionName)
    {
        LoadFromFile();
         for(SubSection ss : subsections)
             if(ss.SubSectionName.equals(SubSectionName))
                 return ss.SubSectionID;
         return -1;
    }
    public int searchForSubInSectionPanel(String SubSection)
     {
         LoadFromFile();
         for(SubSection ss : subsections)
             if(ss.getSubSectionName().equals(SubSection))
                 return ss.sec.getSectionID();
         return -1;
     }
    public int searchForSubInSectionIDPanel(int IDSubsection)
     {
         LoadFromFile();
         for(SubSection ss : subsections)
             if(ss.SubSectionID == (IDSubsection))
                 return ss.sec.getSectionID();
         return -1;
     }
    public String searchForGetSubSectionName(int ID)
     {
         LoadFromFile();
         for(SubSection c : subsections)
             if(c.SubSectionID==(ID))
                 return c.SubSectionName;
         return null;
     }
    public ArrayList<SubSection>ListSpecificSubSection(int SectionID) {
        LoadFromFile();
        ArrayList<SubSection> arr = new ArrayList<SubSection>();
        for(SubSection a : subsections )
            if(a.sec.getSectionID()==SectionID)  
                arr.add(a);
        return arr;
    }
    
}
