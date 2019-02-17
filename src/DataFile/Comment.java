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
public final class Comment implements Serializable{
    private String Comment="";
//    private String FilePath="Comment.txt";
//    private ArrayList<Comment> comments = new ArrayList<Comment>(5);
    public Comment() {
    }
    public Comment(String Comment) {
        this.Comment = Comment;
    }

    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
//    public Comment getComment(int ID) {
//        
//    }
    
    
}
