/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import DataFile.Admin;
import DataFile.Book;
import DataFile.Category;
import DataFile.Client;
import DataFile.Employee;
import DataFile.Inventory;
import DataFile.Mail;
import DataFile.Section;
import DataFile.Seller;
import DataFile.SubSection;
import DataFile.Transaction;
import GUI.Login;
import Network.ClientNetwork;
import Safety.Validation;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        // TODO code application logic here
        
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); 				
	checkDirectoryContents(currentDir);
        boolean b = new ClientNetwork().commuincationClientp();
        if(b){
            JOptionPane.showMessageDialog(null, "Welcome In System :) ");
            new Login().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Server is closed , Try in another time :)");
        
    }
    public static void checkDirectoryContents(File dir)
    {
        File files []= dir.listFiles();
        boolean AdminFile = true;
        boolean CategoryFile = true;
        boolean ClientFile = true;
        boolean BookFile = true;
        boolean EmployeeFile = true;
        boolean InventoryFile = true;
        boolean MailFile = true;
        boolean SectionFile = true;
        boolean SellerFile = true;
        boolean SubSectionFile = true;
        boolean Transaction = true;
        
        for(File file : files){
            if(file.getName().equals("Admin.bin"))
                AdminFile = false;
            if(file.getName().equals("Category.bin"))
                CategoryFile = false;
            if(file.getName().equals("Client.bin"))
                ClientFile = false;
            if(file.getName().equals("Book.bin"))
                BookFile = false;
            if(file.getName().equals("Employee.bin"))
                EmployeeFile = false;
            if(file.getName().equals("Inventory.bin"))
                InventoryFile = false;
            if(file.getName().equals("Email.bin"))
                MailFile = false;
            if(file.getName().equals("Section.bin"))
                SectionFile = false;
            if(file.getName().equals("Seller.bin"))
                SellerFile = false;
            if(file.getName().equals("SubSection.bin"))
                SubSectionFile = false;
            if(file.getName().equals("Transaction.bin"))
                Transaction = false;
        }
        if(AdminFile)
            new Admin().commitToFile();
        if(CategoryFile)
            new Category().commitToFile();
        if(ClientFile)
            new Client().commitToFile();
        if(BookFile)
            new Book().commitToFile();
        if(EmployeeFile)
            new Employee().commitToFile();
        if(InventoryFile)
            new Inventory().commitToFile();
        if(MailFile)
            new Mail().commitToFile();
        if(SectionFile)
            new Section().commitToFile();
        if(SellerFile)
            new Seller().commitToFile();
        if(SubSectionFile)
            new SubSection().commitToFile();
        if(Transaction)
            new Transaction().commitToFile();
        
    }
}
