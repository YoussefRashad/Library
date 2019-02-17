/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;



/**
 *
 * @author DELL
 */
public class ClientNetwork {
    public static final int PORT=3000;
    public static final String SERVER_IP ="127.0.0.1"; // local Host
    
    public boolean commuincationClientp()
    {
        try {
            Socket s=new Socket(SERVER_IP,PORT);
            InputStream sip = s.getInputStream();
            ObjectInputStream scan = new ObjectInputStream(sip);
//            System.out.println(scan.readObject());
            s.close(); // lma 29flha h t29fl tl2ay el Scan
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
      /*
    public static final int PORT=3000;
    public boolean communication()
    {
        try {
            ServerSocket ss = new ServerSocket(PORT);
            Socket s = ss.accept(); // return Socket
            ObjectOutputStream pw = new ObjectOutputStream(s.getOutputStream());
            System.out.println("Welcome in Server");
            //pw.writeObject(new Student(23470, "Youssef :)"));
            pw.close(); // aw pw.flush();
            s.close();
            ss.close();
            return true;
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    */
}
