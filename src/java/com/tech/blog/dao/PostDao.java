
package com.tech.blog.dao;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PostDao {
   Connection con;// Taking variable con 
   
   // creating constructor

    public PostDao(Connection con) {
        this.con = con;
    }
   
//    Here arrayList containing category is the return type getCategories()
    public ArrayList<Category> getAllCategories(){ 
    
//        array list containing category is the variable
    ArrayList<Category> list=new ArrayList<>();
    
   
    
    
        try {
            String q="select * from categories";
            Statement st=this.con.createStatement();
            ResultSet set=st.executeQuery(q);
            while(set.next()){
            
                int  cid=set.getInt("cid");
                String name=set.getString("name");
                String description=set.getString("description");
                Category c=new Category(cid,name,description);
                list.add(c);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        
        
     return list;
    }
    
    public boolean savePost(Post p){
    boolean f=false;
    
    
        try {
            //Here posts is the name of the table
            String q="insert into posts(pTitle,pContent,pCode,pPic,catId,userId) values(?,?,?,?,?,?) ";
            
            //To store value of question marks we will use help of prepared statement
            
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, p.getpTitle());
            pstmt.setString(2, p.getpContent());
            pstmt.setString(3, p.getpCode());
            pstmt.setString(4, p.getpPic());
            pstmt.setInt(5, p.getCatId());
            pstmt.setInt(6, p.getUserId());
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    
    //get all the post
    public List<Post >getAllPosts(){
    //return type list containing post from post.java
    
    //since List is interface we cannot make object of it therefore we will use its childclass ArrayList<>
    List<Post> list=new ArrayList<>();
    
    
    //fetch all the post
    
        try {
            PreparedStatement p=con.prepareStatement("select * from posts order by pid desc");
            
            ResultSet set=p.executeQuery();
            
            //traversing every post using while loop;
            
            while(set.next())
            {
            int pid=set.getInt("pid");
            String pTitle=set.getString("pTitle");
            String pContent=set.getString("pContent");
            String pCode=set.getString("pCode");
            String pPic=set.getString("pPic");
            Timestamp date=set.getTimestamp("pDate");
            int catId=set.getInt("catId");
            int userId=set.getInt("userId");
            
            Post post=new Post(pid, pTitle, pContent, pCode, pPic, date,catId, userId);
            
            list.add(post);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return list;
    }
   
    public List<Post> getPostByCatId(int catId){
    //This method will give us the post when we enter category id
    List<Post> list=new ArrayList<>();
    //get all posts by id;
    
    try {
            PreparedStatement p=con.prepareStatement("select * from posts where catId=?");
            p.setInt(1,catId);
            ResultSet set=p.executeQuery();
            
            //traversing every post using while loop;
            
            while(set.next())
            {
            int pid=set.getInt("pid");
            String pTitle=set.getString("pTitle");
            String pContent=set.getString("pContent");
            String pCode=set.getString("pCode");
            String pPic=set.getString("pPic");
            Timestamp date=set.getTimestamp("pDate");
            
            int userId=set.getInt("userId");
            
            Post post=new Post(pid, pTitle, pContent, pCode, pPic, date,catId, userId);
            
            list.add(post);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    return list;
    }
    
    public Post getPostByPostId(int postId){
        Post post = null;
        String q = "select * from posts where pid=?";
        try {
            PreparedStatement p = this.con.prepareStatement(q);
            p.setInt(1, postId);

            ResultSet set = p.executeQuery();

            if (set.next()) {

                int pid = set.getInt("pid");
                String pTitle = set.getString("pTitle");
                String pContent = set.getString("pContent");
                String pCode = set.getString("pCode");
                String pPic = set.getString("pPic");
                Timestamp date = set.getTimestamp("pDate");
                int cid=set.getInt("catId");
                int userId = set.getInt("userId");
                post = new Post(pid, pTitle, pContent, pCode, pPic, date, cid, userId);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return post;
    }
    
}
