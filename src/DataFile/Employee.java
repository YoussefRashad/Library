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
public final class Employee extends Staff implements Serializable{
    
    private final String FilePath = "Employee.bin";
    private ArrayList<Employee> Emp = new ArrayList<Employee>();
    

    public Employee() {
    }
    

    public Employee(int ID, int Age, String IDNational, String Name, String DOB, char Gender, String Email, String Pass, String PhoneNo, String Adress, String UserName , int OfficeHour , double Salary , String Qualification, String JobTitle, String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName, OfficeHour, Salary, Qualification, JobTitle,ProfileImage);
        
    }
    public int NoOfEmployeeReport()
    {
        LoadFromFile();
        return Emp.size();
    }
    @Override
   public boolean commitToFile() {
        return FManager.writeBinary(FilePath, Emp);
   }

    @Override
    public void LoadFromFile() {
        Emp = (ArrayList<Employee>) (Object) FManager.readBinary(FilePath);
    }
     
    @Override
    public boolean LogIn(String Email, String Pass) {
       
        if(Email.equals("Empolyee@yahoo.com")&&Pass.equals("12345678"))
            return true;
        LoadFromFile();
        for(Employee a : Emp)
            if(a.getEmail().equals(Email)&&a.getPass().equals(Pass))
                return true;
        return false;
    }
    
    @Override
      public boolean Add() {
        LoadFromFile();
        Emp.add(this);
        return commitToFile();
        
    }

   
      
//    private int getIndexof(String name) {
//        for (int i = 0; i < Emp.size(); i++) {
//            if (Emp.get(i).getName().equals(name)) {
//                return i;
//            }
//        }
//
//        return -1;
//    }

//    public boolean SearchFor(String name) {
//        LoadFromFile();
//        for(Employee a : Emp)
//            if(a.getName().equals(name))
//                return true;
//        return false;
//    
//    }
//    
//    public Manage get(String name) {
//        LoadFromFile();
//        for(Employee a : Emp)
//            if(a.getName().equals(name))
//                return a;
//        return null;
//    }
//   
    @Override
    public int getIndexof(int ID) {
        for (int i = 0; i < Emp.size(); i++) {
            if (Emp.get(i).getID() == ID) {
                return i;
            }
        }

        return -1;
    }
    
    @Override
   public boolean SearchFor(int ID) {
        LoadFromFile();
        for(Employee a : Emp)
            if(a.getID()==ID)
                return true;
        return false;
    }
   
     @Override
    public Manage get(int ID) {
        LoadFromFile();
        for(Employee a : Emp)
            if(a.getID()==ID)
                return a;
        return null;
    }
    
//    public Employee searchEmpById(int ID) {
//        
//        LoadFromFile();
//        int index = getIndexof(ID);
//        if (index != -1) {
//            return Emp.get(index);
//        } else {
//            return null;
//        }
//    }


    public ArrayList<Employee> ListAllEmployee() {
        LoadFromFile();
        return Emp;
    }

    @Override
    public boolean Edit(int ID) {
        LoadFromFile();
        int index = getIndexof(ID);
        if (index != -1) {
            Emp.set(index, this);
            commitToFile();
           
            return true;
        }

        return false;
    }

    @Override
    public boolean Remove(int ID) {
        LoadFromFile();
        int index = getIndexof(ID);
        if (index != -1) {
            Emp.remove(index);
            commitToFile();
            return true;
        }

        return false;
    }
    
    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for(Employee a : Emp)
            if(a.getID()==ID)
                return true;
        return false;
    }
    
    @Override
     public String getFile() { // ID ` getIDNational` getName`getDOB`getGender`getEmail`getPass`getPhoneNo`getAge`getAddress`getUserName`getOfficeHour`getProfileImage`getQualification
        return this.getID()+"`"+this.getAge()+"`"+this.getIDNational()+"`"+this.getName()+"`"+this.getDOB()+"`"+this.getGender()+"`"+this.getEmail()+"`"+this.getPass()+"`"+
                this.getPhoneNo()+"`"+this.getAddress()+"`"+this.getUserName()+"`"+this.getOfficeHour()+"`"+this.getSalary()+/*"`"+this.getProfileImage()+*/"`"
                +this.getQualification()+"`"+this.getJobTitle()+"`";
    }
     public String[] ListAllNameOfEmployee()
     {
         LoadFromFile();
         String []Empl = new String[this.Emp.size()];
         for(int i=0;i<Emp.size();i++)
             Empl[i]=this.Emp.get(i).getName();
         return Empl;
     }
}
