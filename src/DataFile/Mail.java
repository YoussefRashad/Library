/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

/**
 *
 * @author DELL
 */
import static DataFile.IMethods.FManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public final class Mail implements Serializable{
    FileManagerBinary FManger = new FileManagerBinary();
    
    private final String FilePath = "Email.bin";
    private static ArrayList<Mail> E = new ArrayList<Mail>();
    
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;
    
    private int IDMail=0;
    private String ToEmail = "";
    private String CcEmail = "";
    private String Subject = "";
    private String Emailbody = "";
    
    public Mail(){
        
    }
    public Mail(String To , String Cc , String subject , String body)
    {
        this.CcEmail=Cc;
        this.Emailbody=body;
        this.Subject=subject;
        this.ToEmail = To;
        this.setIDMail();
    }
    
    public boolean generateAndSentMessage()throws AddressException, MessagingException
    {
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        
        getMailSession = Session.getDefaultInstance(mailServerProperties);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
        if(!CcEmail.equals(""))
            generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(CcEmail));
        
        generateMailMessage.setSubject(Subject);
        String emailBody = Emailbody +"<br><br>Regards,<br>Manager Youssef Rasahd ..";
        generateMailMessage.setContent(emailBody , "text/html");
        
        Transport transport = getMailSession.getTransport("smtp");
        transport.connect("smtp.yahoo.com", "mohamedakram939@gmail.com", "godofwar1234");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
        
        
        loadFromFile();
        E.add(this);
        return commitToFile();
        
        
        
    }
//    private void loadFromFile()
//    {
//        E = (ArrayList<Mail>)FManger.readBinary(FilePath);
//    }

    public  int getIDMail() {
        return IDMail;
    }

    public void setIDMail() {
        //loadFromFile();
        this.IDMail++;
    }
    
    public void setToEmail(String to)
    {
        this.ToEmail=to;
    }
    public void setCcEmail(String cc)
    {
        this.CcEmail=cc;
    }
    public void setSubject(String s)
    {
        this.Subject=s;
    }
    public void setEmailbody(String b)
    {
        this.Emailbody=b;
    }
    public String getToEmail()
    {
        return this.ToEmail;
    }
    public String getCcEmail()
    {
       return this.CcEmail;
    }
    public String getSubject()
    {
       return this.Subject;
    }
    public String getEmailbody()
    {
       return this.Emailbody;
    }
    public boolean commitToFile()
    {
        return FManger.writeBinary(FilePath, E);
    }
    public String getEmailFile()
    {
    return this.IDMail+"`"+this.ToEmail+"`"+this.CcEmail+"`"+this.Subject+"`"+this.Emailbody+"`";
    }
    
    public ArrayList<Mail> ListMails()
    {
        loadFromFile();
        return E;
    }
    
    public boolean RemoveEmail(String ToMail) {
        if(SearchForEmail(ToMail)){
            E.remove(this);
            return commitToFile();
        }
        return false;
    }

    public boolean EditEmail(String ToMail) {
        if(SearchForEmail(ToMail)){
            int index = getIndexofEmail(ToMail);
            E.set(index, this);
            return commitToFile();
        }
        return false;
    }

    public int getIndexofEmail(String ToEmail) {
        for(int i=0;i<E.size();i++)
            if(E.get(i).ToEmail.equals(ToEmail))
                return i;
        return -1;
    }

    public boolean SearchForEmail(String ToEmail) {
        loadFromFile();
        for(Mail a : E)
            if(a.ToEmail.equals(ToEmail))
                return true;
        return false;
    }

    public void loadFromFile() {
        E = (ArrayList<Mail>)(Object) FManager.readBinary(FilePath);
    }

//    public void commitToFile() {
//        FManager.Write(E.get(0).getEmailFile(), FilePath, false);
//        for(int i=1;i<E.size();i++)
//            FManager.Write(E.get(i).getEmailFile(), FilePath, true);
//    }
    
}