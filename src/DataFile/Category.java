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
public final class Category implements IMethods,Serializable{
    private int IDCategory =0;
    private String NameCategory ="";
    public SubSection ss ;
    private final String FilePath = "Category.bin";
    private ArrayList<Category> categories = new ArrayList<Category>();
    //public Inventory inventory;

    public Category() {
        //inventory=new Inventory();
        ss = new SubSection();
    }
    public Category(int IDCategory, String NameCategory) {
        this();
        this.IDCategory = IDCategory;
        this.NameCategory = NameCategory;
    }

    public int getIDCategory() {
        return this.IDCategory;
    }

    public void setIDCategory(int IDCategory) {
        this.IDCategory = IDCategory;
    }

    public String getNameCategory() {
        return this.NameCategory;
    }

    public void setNameCategory(String NameCategory) {
        this.NameCategory = NameCategory;
    }
    public String [] ListNameAllCategoryReport()
    {
        LoadFromFile();
        String []arr = new String[categories.size()];
        for(int i=0;i<categories.size();i++)
            arr[i]=categories.get(i).NameCategory;
        return arr;
    }
    
    public int [] ListNoAllBookInSpecificCategory()
    {
        LoadFromFile();
        int []arr = new int[categories.size()];
        for(int i=0;i<categories.size();i++){
            arr[i]= new Book().NoBookInSpecificCategoryReport(categories.get(i).NameCategory);
        }
        return arr;
    }
    public int ListNoAllCategoryInSpecificSubSection(String NameOfSubSection) // Report
    {
        LoadFromFile();
        int count =0;
        for(Category c : categories)
            if(c.ss.getSubSectionName().equals(NameOfSubSection))
                count++;
        return count;
    }
    
    public int searchForGetCategoryID(String CategoryName)
     {
         LoadFromFile();
         for(Category c : categories)
             if(c.getNameCategory().equals(CategoryName))
                 return c.getIDCategory();
         return 0;
         
     }
    public ArrayList<Category> ListSpecificSubSection(String NameOfSubSection) // Report
    {
        LoadFromFile();
        ArrayList<Category> cat = new ArrayList<Category>();
        for(Category c : categories)
            if(c.ss.getSubSectionName().equals(NameOfSubSection))
                cat.add(c);
        return cat;
    }
    @Override
   public boolean commitToFile() {
        return FManager.writeBinary(FilePath, categories);
   }

    @Override
    public void LoadFromFile() {
         categories  = (ArrayList<Category>)  FManager.readBinary(FilePath);
    }
    
    
    @Override
      public boolean Add() {
        LoadFromFile();
        categories.add(this);
        return commitToFile();
    }

   
      
    private int getIndexof(String name) {
        for (int i = 0; i <  categories .size(); i++) {
            if ( categories .get(i).getNameCategory().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public boolean SearchFor(String name) {
        LoadFromFile();
        for(Category a :  categories )
            if(a.getNameCategory().equals(name))
                return true;
        return false;
    
    }
    
     public Category getCategory(String name) { 
        LoadFromFile();
        for(Category a :  categories )
            if(a.getNameCategory().equals(name))
                return a;
        return null;
    }
   
    @Override
    public int getIndexof(int ID) {
        for (int i = 0; i <  categories .size(); i++) {
            if ( categories .get(i).getIDCategory() == ID) {
                return i;
            }
        }

        return -1;
    }
    
    @Override
   public boolean SearchFor(int ID) {
        LoadFromFile();
        for(Category a :  categories )
            if(a.getIDCategory()==ID)
                return true;
        return false;
    }
   
    public Category getCategory(int ID) {
        LoadFromFile();
        for(Category a :  categories )
            if(a.getIDCategory()==ID)
                return a;
        return null;
    }
     
  


    public ArrayList<Category> ListAllCategories() {
        LoadFromFile();
        return  categories ;
    }

    @Override
    public boolean Edit(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            categories.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Remove(int ID) {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            categories.remove(index);
            return commitToFile();
        }
        return false;
    }
    
    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for(Category a :  categories )
            if(a.getIDCategory()==ID)
                return true;
        return false;
    }
    
    @Override
     public String getFile() {
         return this.getNameCategory()+"`"+this.getIDCategory()+"`"+this.ss.getFile();
    }
     public String getFileForBook() {
         return this.getNameCategory()+"`"+this.searchForGetCategoryID(this.getNameCategory())+"`"+
                 this.searchForCategoryNameSubSectionPanel(this.getNameCategory())+"`"+this.searchForCategoryIDSubSectionPanel(this.getNameCategory())+
                 "`"+this.ss.searchForSubInSectionPanel(this.searchForCategoryNameSubSectionPanel(this.getNameCategory()));
                 //+this.ss.getFileForCategory()+"`";
    }
     public String[] ListAllNameOfCatergory()
     {
         LoadFromFile();
         String []cat = new String[this.categories.size()];
         for(int i=0;i<cat.length;i++)
             cat[i]=this.categories.get(i).NameCategory;
         return cat;
     }
     public String searchForCategoryNameSubSectionPanel(String CategoryName)
     {
         LoadFromFile();
         for(Category c : categories)
             if(c.getNameCategory().equals(CategoryName))
                 return c.ss.getSubSectionName();
         return null;
     }
     public int searchForCategoryIDSubSectionPanel(String CategoryName)
     {
         LoadFromFile();
         for(Category c : categories)
             if(c.getNameCategory().equals(CategoryName))
                 return c.ss.SearchForSubSectionIDPanel(c.ss.getSubSectionName());
         return 0;
     }
}
