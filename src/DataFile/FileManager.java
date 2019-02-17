/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import Security.Security;
/**
 *
 * @author DELL
 */
public final class FileManager {

    public boolean Write(String Query, String FilePath, boolean append) {
        PrintWriter Writter = null;
        try {
            System.out.print("\nwritting in ! " + FilePath);
            Writter = new PrintWriter(new FileWriter(new File(FilePath), append));
            Writter.println(Query);
            System.out.println(" ... Done ! ");
            return true;
        } catch (IOException em) {
            System.out.println("Error in Writting : " + em);
        } finally {
            Writter.close();
        }
        return false;
    }

    public ArrayList<Object> Read(String FilePath) {
        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + FilePath);
            Reader = new Scanner(new File(FilePath));
        } catch (FileNotFoundException e) {
            System.out.println("Error in Reading by Youssef : " + e);
        }

        if (FilePath.equals("Client.txt")) {
            ArrayList<Client> clients = new ArrayList<Client>();
            Client client;
            while (Reader.hasNext()) {
                client = new Client();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
                // ID ` getIDNational` getName`getDOB`getGender`getEmail`getPass`getPhoneNo`getAge`getAddress`getUserName`getOfficeHour`getProfileImage`getQualification
                client.setID(Integer.parseInt(separated[0]));
                client.setAge(Integer.parseInt(separated[1]));
                client.setIDNational((separated[2]));
                client.setName(separated[3]);
                client.setDOB(separated[4]);
                client.setGender(separated[5].charAt(0));
                client.setEmail(separated[6]);
                client.setPass(separated[7]);
                client.setPhoneNo(separated[8]);
                client.setAddress(separated[9]);
                client.setUserName(separated[10]);
//                client.setProfileImage(separated[11]);
                clients.add(client);
            }
            return (ArrayList<Object>) (Object) clients;

        }
        if (FilePath.equals("Transaction.txt")) {
            ArrayList<Transaction> trans = new ArrayList<Transaction>();
            Client client;
            Book book;
            Transaction tran;
            while (Reader.hasNext()) {
                client = new Client();
                book = new Book();
                tran = new Transaction();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");

                //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
                
                client.setID(Integer.parseInt(separated[0]));
                client.setAge(Integer.parseInt(separated[1]));
                client.setIDNational((separated[2]));
                client.setName(separated[3]);
                client.setDOB(separated[4]);
                client.setGender(separated[5].charAt(0));
                client.setEmail(separated[6]);
                client.setPass(separated[7]);
                client.setPhoneNo(separated[8]);
                client.setAddress(separated[9]);
                client.setUserName(separated[10]);
                tran.setCash(Double.parseDouble(separated[11]));
                
                //Books_ID.get(i)+"`"+this.BooksName+"`"+this.Books_No.get(i)+"`"+this.Books_Salary.get(i)+"`";
                for(int i=12,j=i+1,k=j+1,m=k+1;i<separated.length;i+=4,j+=4,k+=4,m+=4){ // lazm tb9y 25r wa7dh
                    tran.setBooks_ID(Integer.parseInt(separated[i]));
                    tran.setBooksName(separated[j]);
                    tran.setBooks_No(Integer.parseInt(separated[k]));
                    tran.setBooks_Salary(Double.parseDouble(separated[m]));
                }
                tran.setClient(client);
                
                trans.add(tran);
            }
            return (ArrayList<Object>) (Object) trans;
        }
        if (FilePath.equals("Admin.txt")) {
            ArrayList<Admin> admins = new ArrayList<Admin>();
            Admin admin;
            while (Reader.hasNext()) {
                admin = new Admin();
                String Line = Reader.nextLine();
                //
                System.out.println(Line);
                String separated[] = Line.split("`");
                //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
                admin.setID(Integer.parseInt(separated[0]));
                admin.setAge(Integer.parseInt(separated[1]));
                admin.setIDNational((separated[2]));
                admin.setName(separated[3]);
                admin.setDOB(separated[4]);
                admin.setGender(separated[5].charAt(0));
                admin.setEmail(separated[6]);
                admin.setPass(separated[7]);
                admin.setPhoneNo(separated[8]);
                admin.setAddress(separated[9]);
                admin.setUserName(separated[10]);
                //admin.setProfileImage(separated[11]);

                admins.add(admin);
            }
            return (ArrayList<Object>) (Object) admins;
        }
        if (FilePath.equals("Book.txt")) {
            ArrayList<Book> books = new ArrayList<Book>();
            Book book;
            while (Reader.hasNext()) {
                book = new Book();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                //(int IDBook , int NoOfBook , String NameBook  , double Salary, double rentPerDay)
                /*
                cat.getNameCategory()+"`"+this.comment.getComment()+"`"+this.IDBook+"`"+this.NameBook+"`"+this.NoOfBooks+
                "`"+this.Author.getDOPublisher()+"`"+this.Reciever.getName()+"`"+this.Salary+
                "`"+this.Author.getNamePublisher()+"`";
                 */
                //book.cat.setNameCategory(separated[0]);

                book.cat.setNameCategory(separated[0]);
                book.cat.setIDCategory(Integer.parseInt(separated[1]));

                book.cat.ss.setSubSectionName(separated[2]);
                book.cat.ss.setSubSectionID(Integer.parseInt(separated[3]));

                book.cat.ss.sec.setSectionID(Integer.parseInt(separated[4]));

                book.comment.setComment(separated[5]);
                book.setIDBook(Integer.parseInt(separated[6]));
                book.setNameBook(separated[7]);
                book.setNoOfBooks(Integer.parseInt(separated[8]));
                book.Author.setDOPublisher(separated[9]);
                book.Reciever.setName(separated[10]);
                book.setSalary(Double.parseDouble(separated[11]));
                book.Author.setNamePublisher(separated[12]);
                books.add(book);
            }
            return (ArrayList<Object>) (Object) books;
        }
        if (FilePath.equals("Category.txt")) {
            ArrayList<Category> categories = new ArrayList<Category>();
            Category category;
            while (Reader.hasNext()) {
                category = new Category();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                category.setNameCategory(separated[0]);
                category.setIDCategory(Integer.parseInt(separated[1]));
                category.ss.setSubSectionName(separated[2]);

                categories.add(category);
            }
            return (ArrayList<Object>) (Object) categories;
        }
        if (FilePath.equals("Employee.txt")) {
            ArrayList<Employee> employees = new ArrayList<Employee>();
            Employee employee;
            while (Reader.hasNext()) {
                employee = new Employee();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
                // ID `getAge`getIDNational` getName`getDOB`getGender`getEmail`getPass`getPhoneNo`getAddress`
                //getUserName`getOfficeHour`Salary`getProfileImage`getQualification`jobTitle
                employee.setID(Integer.parseInt(separated[0]));
                employee.setAge(Integer.parseInt(separated[1]));
                employee.setIDNational((separated[2]));
                employee.setName(separated[3]);
                employee.setDOB(separated[4]);
                employee.setGender(separated[5].charAt(0));
                employee.setEmail(separated[6]);
                employee.setPass(separated[7]);
                employee.setPhoneNo(separated[8]);
                employee.setAddress(separated[9]);
                employee.setUserName(separated[10]);
                employee.setOfficeHour(Integer.parseInt(separated[11]));
                employee.setSalary(Double.parseDouble(separated[12]));
                //employee.setProfileImage(separated[13]);
                employee.setQualification(separated[13]);
                employee.setJobTitle(separated[14]);

                employees.add(employee);
            }
            return (ArrayList<Object>) (Object) employees;
        }
        if (FilePath.equals("Inventory.txt")) {
            ArrayList<Inventory> invens = new ArrayList<Inventory>();
            Inventory inven = null;
            while (Reader.hasNext()) {
                inven = new Inventory();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                
                inven.setIDInventory(Integer.parseInt(separated[0]));
                inven.setNameInventory(separated[1]);
                //Books_ID.get(i)+"`"+this.BooksName+"`"+this.Books_No.get(i)+"`"+this.Books_Salary.get(i)+"`";
                for(int i=2,j=i+1,k=j+1,m=k+1;i<separated.length;i+=4,j+=4,k+=4,m+=4){ // lazm tb9y 25r wa7dh
                    inven.setBooks_ID(Integer.parseInt(separated[i]));
                    inven.setBooksName(separated[j]);
                    inven.setBooks_No(Integer.parseInt(separated[k]));
                    inven.setBooks_Salary(Double.parseDouble(separated[m]));
                }
                invens.add(inven);
            }
            return (ArrayList<Object>) (Object) invens;
        }
        if (FilePath.equals("Section.txt")) {
            ArrayList<Section> sections = new ArrayList<Section>();
            Section section;
            while (Reader.hasNext()) {
                section = new Section();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");

                section.setSectionID(Integer.parseInt(separated[0]));

                sections.add(section);
            }
            return (ArrayList<Object>) (Object) sections;
        }
        if (FilePath.equals("Seller.txt")) {
            ArrayList<Seller> sellers = new ArrayList<Seller>();
            Seller seller;
            while (Reader.hasNext()) {
                seller = new Seller();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");
                //(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName);
                // ID `getAge`getIDNational` getName`getDOB`getGender`getEmail`getPass`getPhoneNo`getAddress`
                //getUserName`getOfficeHour`Salary`getProfileImage`getQualification`jobTitle

                seller.setID(Integer.parseInt(separated[0]));
                seller.setAge(Integer.parseInt(separated[1]));
                seller.setIDNational((separated[2]));
                seller.setName(separated[3]);
                seller.setDOB(separated[4]);
                seller.setGender(separated[5].charAt(0));
                seller.setEmail(separated[6]);
                seller.setPass(separated[7]);
                seller.setPhoneNo(separated[8]);
                seller.setAddress(separated[9]);
                seller.setUserName(separated[10]);
                seller.setOfficeHour(Integer.parseInt(separated[11]));
                seller.setSalary(Double.parseDouble(separated[12]));
                //employee.setProfileImage(separated[13]);
                seller.setQualification(separated[13]);
                seller.setJobTitle(separated[14]);

                sellers.add(seller);
            }
            return (ArrayList<Object>) (Object) sellers;
        }
        if (FilePath.equals("SubSection.txt")) {
            ArrayList<SubSection> subs = new ArrayList<SubSection>();
            SubSection sub;
            while (Reader.hasNext()) {
                sub = new SubSection();
                String Line = Reader.nextLine();
                //
                String separated[] = Line.split("`");

                sub.setSubSectionID(Integer.parseInt(separated[0]));
                sub.setSubSectionName(separated[1]);
                sub.sec.setSectionID(Integer.parseInt(separated[2]));
                subs.add(sub);
            }
            return (ArrayList<Object>) (Object) subs;
        }
        if (FilePath.equals("Email.txt")) {
            ArrayList<Mail> es = new ArrayList<Mail>();
            Mail e = null;
            while (Reader.hasNext()) {
                e = new Mail();
                String Line = Reader.nextLine();
                //
                String[] separated = Line.split("`");
                e.setToEmail(separated[0]);
                e.setCcEmail(separated[1]);
                e.setSubject(separated[2]);
                e.setEmailbody(separated[3]);
                e.setIDMail();
                es.add(e);
            }
            return (ArrayList<Object>) (Object) es;
        }
        return null;

    }

}
