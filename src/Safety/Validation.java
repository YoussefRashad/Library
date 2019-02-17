/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Safety;



/**
 *
 * @author DELL
 */
public class Validation {
    public boolean checkImage(String img)
    {
        if(img.contains(".png")||img.contains(".jpg"))
            return true;
        return false;
    }
    public boolean checkUserName(String username)
    {
        if(checkAlpNo(username)&&!username.startsWith(" ")&&!username.endsWith(" ")&&!checkDeplicateSpaces(username))
            return true;
        return false;
    }
    public boolean checkAddress(String Address)
    {
        if(checkAlpNo(Address)&&!Address.startsWith(" ")&&!Address.endsWith(" ")&&!checkDeplicateSpaces(Address))
            return true;
        return false;
    }
    public boolean checkName(String name) // user , name , username , qualification
    {
        if(checkAllph(name) && !name.startsWith(" ") && !name.endsWith(" ") && !checkDeplicateSpaces(name))
            return true;
        return false;
    }
    public boolean checkPass(String pass)
    {
        if(pass.length()>=6 && checkAlpNoChar(pass))
            return true;
        return false;
    }public boolean checkEmail(String email) // fadl lsa lma a handle el if el last 34an t2bl el . - _
    {
        boolean act = true;
        int count = 0;
        for(int i =0 ; i<email.length();i++){
            if(email.charAt(i)=='@')
                count++;
            if(count>1){
                act = false;
                break;
            }
        }
        if(( act&&  email.endsWith("@yahoo.com")|| email.endsWith("@gmail.com") ||email.endsWith("@hotmail.com"))&& !email.contains(" ")){
            int index = email.indexOf("@");
            String str = email.substring(0, index);
            if(str.length()>=4 && (checkAlpNo(str)) || checkUnderScoll(str))
                return true;
        }
            
        return false;
    }
    public boolean checkSalary(String Salary)
    {
        try{
        if(checkNo(Salary) && Double.parseDouble(Salary)>=1000.0 && !Salary.contains("-"))
            return true;
        }
        catch(Exception e){
                ;
                }
        return false;
    }
    public boolean checkSalaryOfBook(String SalaryOfBook)
    {
        try{
            double m = Double.parseDouble(SalaryOfBook);
            if(checkNo(SalaryOfBook)  && !SalaryOfBook.contains("-"))
            return true;
        }
        catch(Exception e){
                ;
                }
        return false;
    }
    public boolean checkID(String ID)
    {
        try{
        if(checkNo(ID)&&ID.length()>=5 &&Integer.parseInt(ID)>0&&!ID.contains("."))
            return true;
        }
        catch(Exception e){
                ;
                }
        return false;
    }
    public boolean checkNumber(String No)
    {
            boolean act=false;
            for(int i=0;i<No.length();i++){
                if(No.charAt(i)>='0'&&No.charAt(i)<='9')
                    ;
                else{
                    act = true;
                    break;
                }
            }
            if(!act)
                return true;
            else
                return false;
    }
    public boolean checkIDNational(String IDNational)
    {
        try{
        if(checkNo(IDNational)&&(IDNational.length()==14) &&Long.parseLong(IDNational)>0/*&&!IDNational.contains(".")*/)
            return true;
        }
        catch(Exception e){
                ;
                }
        return false;
    }
    public boolean checkAge(String age)
    {
        try{
        if(checkNo(age) && Integer.parseInt(age)>=19&&Integer.parseInt(age)<=100)
             return true;
        }
        catch(Exception e){
                ;
                }
        return false;
    }
    public boolean checkPhoneNo(String PN)
    {
        if(checkNo(PN) && PN.length()==11 && (PN.startsWith("011")|| PN.startsWith("012")||PN.startsWith("015")||PN.startsWith("010")))
            return true;
        return false;
    }
    
    // *****************************************************
    // *****************************************************
    // *****************************************************
    // *****************************************************
    
    private boolean checkDeplicateSpaces(String str)
    {
        for(int i=0;i<str.length();i++){
            if(i<str.length()-2&&(str.charAt(i)==str.charAt(i+1))&&str.charAt(i)==' ')
                return true;

        }
        return false;
    }
    private boolean checkAllph(String str)
    {
        boolean check=true;
        int spaces=0;
        String sepreted[] = str.split(" ");
        int countSpaces = sepreted.length;
        
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
                ;
            else if(str.charAt(i)==' '){
                spaces++;
                if(spaces<countSpaces)
                    ;
                else{
                    check=false;
                    break;
                }
            }
            else{
                check=false;
                break;
            }
        }
        return check;
    }
    private boolean checkAlpNoChar(String str)
    {
        boolean check=true;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='0'&&str.charAt(i)<='9') ||(str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')||( str.charAt(i)>=33 && str.charAt(i)<=47 )||str.charAt(i)=='@') 
                ;
            
            else{
                check=false;
                break;
            }
        }
        return check;
    }
    private boolean checkAlpNo(String str)
    {
        boolean check=true;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='0'&&str.charAt(i)<='9') ||(str.charAt(i)>='A'&&str.charAt(i)<='z')||str.charAt(i)==' ') 
                ;
            else{
                check=false;
                break;
            }
        }
        return check;
    }
    private boolean checkNo(String str)
    {
        boolean check=true;
        int c=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='0'&&str.charAt(i)<='9'))
                ;
            else if(str.charAt(i)=='.'){
                c++;
                if(c>1){
                check=false;
                break;
            }
            }
            else{
                check=false;
                break;
            }
        }
        
        return check;
    }
    private boolean checkUnderScoll(String str)
   {
        boolean check=true;
        int c=0;///sdfsdf8dfg^^-*`
        for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='.'||str.charAt(i)=='-'||str.charAt(i)=='_'){
                c++;
                if(c>1){
                check=false;
                break;
                }
            }
             else if((str.charAt(i)>='0'&&str.charAt(i)<='9') ||(str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
                 ;
             else
                 break;
        }
        if(c==0)
            check=false;
        return check;
    }
    
}