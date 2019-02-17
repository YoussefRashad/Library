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
public final class Book implements IMethods,Serializable{
    private int IDBook =0 , NoOfBooks =0;
    private String NameBook ="";
    //private double rentPerDay = 0.0;
    private double Salary =0;
    public Publisher Author;
    public Employee Reciever;
    public Comment comment ;//htb2 arrayList
    public Category cat;
    //public Inventory inventories;
    private final String FilePath = "Book.bin";
    private ArrayList<Book> books = new ArrayList<Book>();

    public Book() {
        //inventories=new Inventory();
        cat = new Category();
        comment = new Comment();
        Reciever = new Employee();
        Author = new Publisher();
    }
    public Book(int IDBook , int NoOfBook , String NameBook  , String Reciever , double Salary) {
        this();
        this.IDBook = IDBook;
        this.NameBook = NameBook;
        this.NoOfBooks = NoOfBook;
        this.Reciever.setName(Reciever);
        this.Salary = Salary;
        //this.rentPerDay = rentPerDay;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Book books) {
        this.books.add(books);
    }
    
    public int getIDBook() {
        return this.IDBook;
    }

    public void setIDBook(int IDBook) {
        this.IDBook = IDBook;
    }

    public int getNoOfBooks() {
        return this.NoOfBooks;
    }

    public void setNoOfBooks(int NoOfBooks) {
        this.NoOfBooks = NoOfBooks;
    }

    public String getNameBook() {
        return this.NameBook;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }
    
//    public void setRentPerDay(double rentPerDay)
//    {
//        this.rentPerDay = rentPerDay;
//    }
//    
//    public double getRentPerDay()
//    {
//        return this.rentPerDay;
//    }
    
    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    public String [] ListNameAllBookReport()
    {
        LoadFromFile();
        String []arr = new String[books.size()];
        for(int i=0;i<books.size();i++)
            arr[i]=books.get(i).NameBook;
        return arr;
    }
    public int [] ListNoAllBookReport()
    {
        LoadFromFile();
        int []arr = new int[books.size()];
        for(int i=0;i<books.size();i++)
            arr[i]=books.get(i).NoOfBooks;
        return arr;
    }
    
    public int NoBookInSpecificCategoryReport(String NameCategory) // in Category
    {
        LoadFromFile();
        int count=0;
        for(Book b : books)
            if(b.cat.getNameCategory().equals(NameCategory))
                count++;
        return count;
    }
     /*public int NoBookInSpecificInventory(int InventoryID) // in Category
    {
        LoadFromFile();
        int count=0;
        for(Book b : books)
            /*if(b.inventories.getIDInventory()==InventoryID)
                count++;*/
            /*if(b.cat.inventory.getIDInventory()==InventoryID)
                count++;
        return count;
    }
     */
    public String[] ListAllNameOfPublisher()
     {
         LoadFromFile();
         String []publisher = new String[this.books.size()];
         for(int i=0;i<books.size();i++)
             publisher[i]=this.books.get(i).Author.getNamePublisher();
         return publisher;
     }
    public int NoBookInSpecificPublisher(String PublisherName) 
    {
        LoadFromFile();
        int count=0;
        for(Book b : books)
            if(b.Author.getNamePublisher().equals(PublisherName ))
                count++;
        return count;
    }
    public ArrayList<Book>ListSpecificPublisher(String PublisherName) {
        LoadFromFile();
        ArrayList<Book> arr = new ArrayList<Book>();
        for(Book a : books)
            if(a.Author.getNamePublisher().equals(PublisherName))  
                arr.add(a);
        return arr;
    }
    public boolean UpdateAllNameOfPublisher(String lastName , String NewName)
    {
        LoadFromFile();
        for(int i=0;i<this.books.size();i++)
            if(books.get(i).Author.getNamePublisher().equals(lastName))
                books.get(i).Author.setNamePublisher(NewName);
        return commitToFile();
    }
    public Book getBook(int ID) 
    {
        LoadFromFile();
        for(Book a : books)
            if(a.getIDBook()==ID)
                return a;
        return null;
    }
    public Book getBook(String Book)
      {
        LoadFromFile();
        for(Book a : books)
            if(a.getNameBook().equals(Book))
                return a;
        return null;
    }
    public void LoadFromFile() 
    {
        books = (ArrayList<Book>) FManager.readBinary(FilePath);
    }

    @Override
    public boolean Add() 
    {
        LoadFromFile();
        books.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) 
    {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            books.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) 
    {
        if(SearchFor(ID)){
            int index = getIndexof(ID);
            books.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) 
    {
        for(int i=0;i<books.size();i++)
            if(books.get(i).getIDBook() == ID)
                return i;
        return -1;
    }

    public int getIndexof(String name) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getNameBook().equals(name)) {
                return i;
            }
        }
        return -1;
    }
     
    
    @Override
    public boolean SearchFor(int ID) 
    {
        LoadFromFile();
        for(Book a : books)
            if(a.getIDBook()==ID)
                return true;
        return false;   
    }
	
	public boolean SearchFor(String name)
	{
	LoadFromFile();
        for(Book a : books)
            if(a.NameBook.equals(name))
                return true;
        return false;
	
        }
      

    @Override
    public boolean commitToFile() 
    {
        return FManager.writeBinary(FilePath, books);
    }

    @Override
    public boolean Dublicate(int ID) 
    {
        LoadFromFile();
        for(Book a : books)
            if(a.getIDBook()==ID)
                return true;
        return false;
    }

    public ArrayList<Book> ListAllBooks() 
    {
        LoadFromFile();
        return books;
    }
    
    public ArrayList<Book>listSpecificCategory(String Category) {
        LoadFromFile();
         ArrayList<Book> arr = new ArrayList<Book>();
        for(Book a : books)
            if(a.cat.getNameCategory().equals(Category))  
                arr.add(a);
        return arr;
    }
    public ArrayList<Book>listSpecificBookToInventory(String Inventory) {
        LoadFromFile();
        ArrayList<Book> arr = new ArrayList<Book>();
        for(Book a : books)
            if(a.cat.getNameCategory().equals(Inventory))  
                arr.add(a);
                  
        return arr;
    }
    public boolean specificQuantityDec(int []arrID , int []arrCount)
    {
        LoadFromFile();
        for(int i=0;i<arrID.length;i++){
            for(int j=0;j<books.size();j++){
                if(books.get(j).IDBook==arrID[i]){
                    books.get(j).NoOfBooks-=arrCount[i];
                    break;
                }
            }
        }
        //return commitToFile();
        return commitToFile();
    }
    public boolean specificQuantityInc(int []arrID , int []arrCount)
    {
        LoadFromFile();
        for(int i=0;i<arrID.length;i++){
            for(int j=0;j<books.size();j++){
                if(books.get(j).IDBook==arrID[i]){
                    books.get(j).NoOfBooks+=arrCount[i];
                    break;
                }
            }
        }
        //return commitToFile();
        return commitToFile();
    }
    public boolean transportationFromInventoryToBook(ArrayList<Book> BooksFromInven)
    {
        LoadFromFile();
        boolean act = true;
        for(int i=0;i<BooksFromInven.size();i++){
            act = true;
            for(int j=0;j<books.size();j++){
                if(BooksFromInven.get(i).getIDBook()==books.get(j).getIDBook()){
                    books.get(j).setNoOfBooks(BooksFromInven.get(i).getNoOfBooks()+books.get(j).getNoOfBooks());
                    act = false;
                    break;
                }
            }
            if(act)
                books.add(BooksFromInven.get(i));
        }
        return commitToFile();
    }
    @Override
    public String getFile() 
    {
        return this.cat.getFileForBook()+"`"+this.comment.getComment()+"`"+this.IDBook+"`"+this.NameBook+"`"+this.NoOfBooks+
                "`"+this.Author.getDOPublisher()+"`"+this.Reciever.getName()+"`"+this.Salary+
                /*"`"+this.rentPerDay+*/"`"+this.Author.getNamePublisher()+"`";
    }
    public String toString() 
    {
        return this.comment.getComment()+"@"+this.IDBook+"@"+this.NameBook+"@"+this.NoOfBooks+
                "@"+this.Author.getDOPublisher()+"@"+this.Reciever.getName()+"@"+this.Salary+
                "@"+this.Author.getNamePublisher()+"@";
    }
    
}