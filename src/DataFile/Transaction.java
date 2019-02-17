/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import static DataFile.IMethods.FManager;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public final class Transaction implements IMethods,Serializable {

    private String FilePath = "Transaction.bin";
    private String UserNameATM = "", PassAtm = "";
    private double Cash = 0.0;

    public ArrayList<String> BooksName = new ArrayList<String>();
    public ArrayList<Integer> Books_No = new ArrayList<Integer>();
    public ArrayList<Double> Books_Salary = new ArrayList<Double>();
    public ArrayList<Integer> Books_ID = new ArrayList<Integer>();

    public Client client = new Client();
    private ArrayList<Transaction> trans = new ArrayList<Transaction>();

    public Transaction() {
    }

    public Transaction(String UserNameATM, String PassAtm, double Cash, Client c) {
        this.Cash = Cash;
        this.PassAtm = PassAtm;
        this.UserNameATM = UserNameATM;
        this.client = c;
    }

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

    /*

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void setBook(Book book) {
        this.books.add(book);
    }
     */

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getUserNameATM() {
        return this.UserNameATM;
    }

    public void setUserNameATM(String UserNameATM) {
        this.UserNameATM = UserNameATM;
    }

    public String getPassAtm() {
        return this.PassAtm;
    }

    public void setPassAtm(String PassAtm) {
        this.PassAtm = PassAtm;
    }

    public double getCash() {
        return this.Cash;
    }

    public double collectAllTransaction() {
        LoadFromFile();
        double d = 0.0;
        for (Transaction t : trans) {
            d += t.Cash;
        }
        return d;
    }

    public double totalAmount(int Quantity) {
        Book book = new Book();
        this.Cash = book.getSalary() * Quantity;
        return this.Cash;
    }

    public double Calc_Total(int Books[], int Count_Quantity[]) {
        Book book = new Book();
        double S = 0;
        for (int i = 0; i < Books.length; i++) {
            for (Book b : book.ListAllBooks()) {
                if (Books[i] == b.getIDBook()) {
                    S += b.getSalary() * Count_Quantity[i];
                    break;
                }
            }
        }
        return S;
    }

    public double Calc_Total(ArrayList<Integer> Books, ArrayList<Integer> Count_Quantity) {
        Book book = new Book();
        double S = 0;
        for (int i = 0; i < Books.size(); i++) {
            for (Book b : book.ListAllBooks()) {
                if (Books.get(i) == b.getIDBook()) {
                    S += b.getSalary() * Count_Quantity.get(i);
                    break;
                }
            }
        }
        return S;
    }

    public double Calc_Item(int ID, int Count_Quantity) {
        Book book = new Book();
        ArrayList<Book> list = book.ListAllBooks();
        for (Book a : list) {
            if (a.getIDBook() == ID) {
                return a.getSalary() * Count_Quantity;
            }
        }
        return 0;
    }

    public Transaction getTransaction(int ID) {
        LoadFromFile();
        for (Transaction t : trans) {
            if (t.client.getID() == ID) {
                return t;
            }
        }
        return null;
    }
    public Transaction getTransaction(String Email , String Pass) {
        LoadFromFile();
        for (Transaction t : trans) {
            if (t.client.getEmail().equals(Email)&&t.client.getPass().equals(Pass)) {
                return t;
            }
        }
        return null;
    }

    public void setCash(double cash) {
        this.Cash = cash;
    }
//    public int getSizeSpecificClient(Transaction t)// ListAllMyBook
//    {
//        int Size=0;
//        
//        for(int i=0;i<t.CountOfTransaction;i++)
//        return Size;
//    }

    @Override
    public boolean Add() {
        LoadFromFile();
        trans.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            trans.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        System.out.println("CCCASH" + this.Cash);
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            trans.set(index, this);
            return commitToFile();
        }
        Client x = (Client) new Client().get(ID);
        if (x != null) {
            this.client = x;
            Add();
        }
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            trans.set(index, this);
            return commitToFile();
        }
        return false;
    }

    @Override
    public int getIndexof(int ID) {
        for (int i = 0; i < trans.size(); i++) {
            if (trans.get(i).client.getID() == ID) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for (int i = 0; i < trans.size(); i++) {
            if (trans.get(i).client.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void LoadFromFile() {
        trans = (ArrayList<Transaction>)  FManager.readBinary(FilePath);

    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, trans);

    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for (Transaction a : trans) {
            if (a.client.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    public boolean removeAllBooksAndNo() // use in Class ReturnItem
    {
        LoadFromFile();
        int index = this.getIndexof(this.client.getID());
        this.trans.get(index).BooksName = new ArrayList<String>();
        this.trans.get(index).Books_ID = new ArrayList<Integer>();
        this.trans.get(index).Books_No = new ArrayList<Integer>();
        this.trans.get(index).Books_Salary = new ArrayList<Double>();
        return commitToFile();
    }

    public boolean specificQuantityDec(int[] arrID, int[] arrCount) {
        LoadFromFile();
        for (int i = 0; i < arrID.length; i++) {
            for (int j = 0; j < trans.size(); j++) {
                for (int k = 0; j < trans.get(j).Books_ID.size(); k++) {
                    if (trans.get(j).Books_ID.get(k) == arrID[i]) {
                        trans.get(j).setBooks_No((trans.get(j).Books_No.get(k))-arrCount[i]);
                        break;
                    }
                }
            }
        }
        return commitToFile();
    }

    public Transaction returnInfoItem(int id) {
        LoadFromFile();
        for (int i = 0; i < trans.size(); i++) {
            for (int j = 0; j < trans.get(i).Books_ID.size(); j++) {
                if (trans.get(i).Books_ID.get(j) == id) {
                    return trans.get(i);
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
        return this.client.getFile() + this.Cash + "`" + ItemsAndCount/*+this.UserNameATM+"`"+this.PassAtm+"`"*/;
    }
}
