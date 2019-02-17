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
public final class Inventory implements IMethods ,Serializable{

    private String NameInventory = "";
    private int IDInventory = 0;
    private final String FilePath = "Inventory.bin";
    private ArrayList<Inventory> inventories = new ArrayList<Inventory>();
    //private ArrayList<Book> books = new ArrayList<Book>() ;
    public ArrayList<String> BooksName = new ArrayList<String>();
    public ArrayList<Integer> Books_No = new ArrayList<Integer>();
    public ArrayList<Double> Books_Salary = new ArrayList<Double>();
    public ArrayList<Integer> Books_ID = new ArrayList<Integer>();

    //public Book b ;
    //public Category cat ;
    public Inventory() {
        // b =new Book();
        /*cat = new Category();
        books = new ArrayList<Book>();*/
    }

    public Inventory(String Name, int ID) {
        this();
        this.IDInventory = ID;
        this.NameInventory = Name;

    }

    /*
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void setBook(Book b) {
        this.books.add(b);
    }
     */
    public ArrayList<String> getBooksName() {
        return BooksName;
    }

    public void setBooksName(String BooksName) {
        this.BooksName.add(BooksName);
    }

    public ArrayList<Integer> getBooks_No() {
        return Books_No;
    }

    public void setBooks_No(int Books_No) {
        this.Books_No.add(Books_No);
    }

    public ArrayList<Double> getBooks_Salary() {
        return Books_Salary;
    }

    public void setBooks_Salary(double Salary) {
        this.Books_Salary.add(Salary);
    }

    public ArrayList<Integer> getBooks_ID() {
        return Books_ID;
    }

    public void setBooks_ID(int Books_ID) {
        this.Books_ID.add(Books_ID);
    }

    public void setBook(int Books_ID, double Salary, int Books_No, String BooksName) {
        this.BooksName.add(BooksName);
        this.Books_ID.add(Books_ID);
        this.Books_Salary.add(Salary);
        this.Books_No.add(Books_No);
    }

    public String getNameInventory() {
        return this.NameInventory;
    }

    public void setNameInventory(String NameInventory) {
        this.NameInventory = NameInventory;
    }

    public int getIDInventory() {
        return this.IDInventory;
    }

    public void setIDInventory(int IDInventory) {
        this.IDInventory = IDInventory;
    }

    public Inventory getInventory(int ID) {
        LoadFromFile();
        for (Inventory a : inventories) {
            if (a.getIDInventory() == ID) {
                return a;
            }
        }
        return null;
    }

    public Inventory getInventoryByBookID(int IDBook) {
        LoadFromFile();
        for (int i = 0; i < inventories.size(); i++) {
            for (int j = 0; j < inventories.get(i).Books_ID.size(); j++) {
                if (inventories.get(i).Books_ID.get(j) == IDBook) {
                    return inventories.get(i);
                }
            }
        }
        return null;
    }

    public int getIndexOfInventoryByBookID(int IDBook) {
        LoadFromFile();
        for (int i = 0; i < inventories.size(); i++) {
            for (int j = 0; j < inventories.get(i).Books_ID.size(); j++) {
                if (inventories.get(i).Books_ID.get(j) == IDBook) {
                    return j;
                }
            }
        }
        return -1;
    }

    public ArrayList<Book> listSpecificBookInInventory(String Inventory) {
        LoadFromFile();
        ArrayList<Book> arr = new ArrayList<Book>();
        Book b = new Book();
        for (int i = 0; i < inventories.size(); i++) {
            if (inventories.get(i).NameInventory.equals(Inventory)) {
                for (int j = 0; j < inventories.get(i).Books_ID.size(); j++) {
                    b.setIDBook(inventories.get(i).Books_ID.get(j));
                    b.setNameBook(inventories.get(i).BooksName.get(j));
                    b.setNoOfBooks(inventories.get(i).Books_No.get(j));
                    b.setSalary(inventories.get(i).Books_Salary.get(j));
                    arr.add(b);
                }
                break;
            }
        }
        return arr;
    }
    public boolean removeAllBooksAndNo() // use in Class ReturnItem
    {
        LoadFromFile();
        int index=this.getIndexof(this.IDInventory);
        this.inventories.get(index).BooksName = new ArrayList<String>();
        this.inventories.get(index).Books_ID = new ArrayList<Integer>();
        this.inventories.get(index).Books_No = new ArrayList<Integer>();
        this.inventories.get(index).Books_Salary = new ArrayList<Double>();
        return commitToFile();
    }  

    public ArrayList<Book> listSpecificBookInInventory(int StockID[], int Count_Quantity[]) {
        LoadFromFile();
        ArrayList<Book> arr = new ArrayList<Book>();
        Book b = null;
        for (int i = 0; i < StockID.length; i++) {
            b = new Book();
            b = b.getBook(StockID[i]);
            if(b!=null){
                b.setIDBook(StockID[i]);
                b.setNoOfBooks(Count_Quantity[i]);
                arr.add(b);
            }else{
                b.setIDBook(StockID[i]);
                b.setNoOfBooks(Count_Quantity[i]);
                b.setNameBook(getInventoryByBookID(StockID[i]).BooksName.get(i));
                b.setSalary(getInventoryByBookID(StockID[i]).Books_Salary.get(i));
                arr.add(b);
            }
        }
        return arr;
    }

    public Inventory getInventory(String name) {
        LoadFromFile();
        for (Inventory a : inventories) {
            if (a.getNameInventory().equals(name)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean Add() {
        LoadFromFile();
        inventories.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            inventories.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            inventories.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) {
        for (int i = 0; i < inventories.size(); i++) {
            if (inventories.get(i).getIDInventory() == ID) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for (Inventory a : inventories) {
            if (a.getIDInventory() == ID) {
                return true;
            }
        }
        return false;
    }

    public int SearchFor(String name) {
        LoadFromFile();
        for (Inventory a : inventories) {
            if (a.getNameInventory().equals(name)) {
                return a.IDInventory;
            }
        }
        return -1;
    }
    public int SearchForQuantityOFBook(int ID) {
        LoadFromFile();
        for(int i=0;i<inventories.size();i++)
            for(int j=0;j<Books_ID.size();j++)
                if(inventories.get(i).Books_ID.get(j) == ID)
                    return inventories.get(i).Books_No.get(j);
        return -1;
    }

    public boolean specificQuantityDec(int[] arrID, int[] arrCount)//Transportation
    {
        LoadFromFile();
        for (int i = 0; i < arrID.length; i++) {
            for (int j = 0; j < inventories.size(); j++) {
                for (int k = 0; k < inventories.get(j).Books_ID.size(); k++) {
                    if (inventories.get(j).Books_ID.get(k) == arrID[i]) {
                        inventories.get(j).Books_No.set(k, inventories.get(j).Books_No.get(k) - arrCount[i]);
                        break;
                    }
                }
            }
        }
        return commitToFile();
    }

    @Override
    public void LoadFromFile() {
        inventories = (ArrayList<Inventory>)  FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, inventories);
    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for (Inventory a : inventories) 
            if (a.getIDInventory() == ID) 
                return true;
        return false;
    }
    public boolean DublicateBooksInInventory(int ID) {
        LoadFromFile();
        for(int i=0;i<inventories.size();i++){
            for(int j=0;j<Books_ID.size();j++){
                if(inventories.get(i).Books_ID.get(j) == ID)
                    return true;
            }
        }
        return false;
    }

    public ArrayList<Inventory> ListAllInventories() {
        LoadFromFile();
        return inventories;
    }

    public String[] ListAllInevenName() {
        LoadFromFile();
        String[] Name = new String[inventories.size()];
        for (int i = 0; i < inventories.size(); i++) {
            Name[i] = inventories.get(i).getNameInventory();
        }
        System.out.println(Name);
        return Name;
    }

    public int getIDInventory(String name) //Combo
    {
        LoadFromFile();
        for (Inventory a : inventories) {
            if (a.getNameInventory().equals(name)) {
                return a.getIDInventory();
            }
        }
        return -1;
    }

    public int NoBookInSpecificInventory(int InventoryID) // in Category
    {
        LoadFromFile();
        int count = 0;
        for (int i = 0; i < inventories.size(); i++) {
            if (inventories.get(i).getIDInventory() == InventoryID) {
                for (int j = 0; j < inventories.get(i).Books_ID.size(); j++) {
                    count += inventories.get(i).Books_No.get(j);
                }
                break;
            }
        }
        return count;
    }

    public Inventory returnInfoItem(int id) {
        LoadFromFile();
        for (int i = 0; i < inventories.size(); i++) {
            for (int j = 0; j < inventories.get(i).Books_ID.size(); j++) {
                if (inventories.get(i).Books_ID.get(j) == id) {
                    return inventories.get(i);
                }
            }
        }
        return null;
    }

    @Override
    public String getFile() {
        String ItemsAndCount = "";
        for (int i = 0; i < this.Books_ID.size(); i++) {
            ItemsAndCount += this.Books_ID.get(i) + "`" + this.BooksName.get(i) + "`" + this.Books_No.get(i) + "`" + this.Books_Salary.get(i) + "`";
        }
        return this.IDInventory + "`" + this.NameInventory + "`" + ItemsAndCount;
    }
    /*public String toString() 
    {
        Object s ="";
        for(int i=0;i<books.size();i++)
            s=books.get(i);
        return this.IDInventory+"\t" +   this.NameInventory+"\t"+ s +"`";
    }*/

}
