/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import java.io.Serializable;


/**
 *
 * @author DELL
 */
public abstract class Staff extends Manage implements IMethods,Serializable{
    private int OfficeHour = 0;
    private double Salary = 0;
    private String JobTitle ="" , Qualification = "";

    public Staff() {
    }
    public Staff(int ID, int Age, String IDNational, String Name, String DOB, char Gender , String Email , String Pass ,String PhoneNo ,String Adress , String UserName,int OfficeHour , double Salary , String Qualification , String JobTitle , String ProfileImage) {
        super(ID, Age, IDNational, Name, DOB, Gender, Email, Pass, PhoneNo, Adress, UserName ,ProfileImage);
        this.OfficeHour = OfficeHour;
        this.Salary = Salary;
        this.JobTitle = JobTitle;
        this.Qualification = Qualification;
    }
    
    public int getOfficeHour() {
        return this.OfficeHour;
    }

    public void setOfficeHour(int OfficeHour) {
        this.OfficeHour = OfficeHour;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getJobTitle() {
        return this.JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    public String getQualification() {
        return this.Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    @Override
    public abstract boolean Add();

    @Override
    public abstract boolean Remove(int ID) ;

    @Override
    public abstract boolean Edit(int ID) ;

    @Override
    public abstract int getIndexof(int ID);

    @Override
    public abstract boolean SearchFor(int ID) ;

    @Override
    public abstract void LoadFromFile() ;

    @Override
    public abstract boolean  commitToFile() ;

    @Override
    public abstract boolean Dublicate(int ID);

    @Override
    public abstract String getFile() ;
    
}
