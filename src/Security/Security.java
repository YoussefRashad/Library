/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security;



/**
 *
 * @author DELL
 */
public class Security {
    public Security(){
    }
    
    public final String Encryption(String word,int Key)
    {
        String Result="" ;
        for(int i=0;i<word.length();i++){
            Result+= ((char)((word.charAt(i))+ Key +i+8-i-i*Math.pow(i, 2)));
        }
        return Result;
    }
    public final String Decryption(String word,int Key)
    {
        String Result="" ;
        for(int i=0;i<word.length();i++){
            Result+= (char)((word.charAt(i))- Key -i-8+i+i*Math.pow(i, 2));
        }
        return Result;
    }
}
