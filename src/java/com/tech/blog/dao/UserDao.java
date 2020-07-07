
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;
public class UserDao {
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    
    //method to insert user to database
    
    public boolean saveUser(User user){
    
        boolean f=false;
        try {
            
            
//            user-->database

         
        String query="insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
        PreparedStatement pstmt=this.con.prepareStatement(query);
        pstmt.setString(1, user.getName());
        pstmt.setString(2, user.getEmail());
        pstmt.setString(3, user.getPassword());
        pstmt.setString(4, user.getGender());
        pstmt.setString(5, user.getAbout());
        
        pstmt.executeUpdate();
        f=true;
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    
    }
    
    
    //get user by user email and password;
    
    public User getUserByEmailAndPassword(String email,String password){
    User user=null;
    
        try {
            String query="select * from user where email=? and password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,email);
            pstmt.setString(2,password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next())
            {
            user=new User();
            
            // here we have extracted data from db with below command
            String name=set.getString("name");
            // and we have set this data to user with below command
            user.setName(name);
            
            // doing it together
            user.setId(set.getInt("id"));
            user.setEmail(set.getString("email"));
            user.setPassword(set.getString("password"));
            user.setGender(set.getString("gender"));
            user.setAbout(set.getString("about"));
            user.setDateTime(set.getTimestamp("rdate"));
            user.setProfile(set.getString("profile"));
            
            
            
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // it will return above command
    return user;
    }
    
    public boolean updateUser(User user){
       
//        By default query is not working therefore setting it to false
                 boolean f=false;
    
        try {

            String query = "update user set name=? , email=? , password=? , gender=? ,about=? , profile=? where  id =?";
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, user.getName());
            p.setString(2, user.getEmail());
            p.setString(3, user.getPassword());
            p.setString(4, user.getGender());
            p.setString(5, user.getAbout());
            p.setString(6, user.getProfile());
            p.setInt(7, user.getId());

            p.executeUpdate();
            f = true;
                
//            After the query works make f as true
            
       } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    
    public User getUserByUserId(int userId)
    {
    
    User user=null;
        try {
             String q="select * from user where id=?";
    PreparedStatement ps=this.con.prepareStatement(q);
    //now we need to insert data in ? with the help of ps
    ps.setInt(1,userId);
    // 1 is the location of question mark and userId is the value;
    ResultSet set=ps.executeQuery();
    if(set.next())
        //it will check if there is any next row
    {
     user=new User();
            
            // here we have extracted data from db with below command
            String name=set.getString("name");
            // and we have set this data to user with below command
            user.setName(name);
            
            // doing it together
            user.setId(set.getInt("id"));
            user.setEmail(set.getString("email"));
            user.setPassword(set.getString("password"));
            user.setGender(set.getString("gender"));
            user.setAbout(set.getString("about"));
            user.setDateTime(set.getTimestamp("rdate"));
            user.setProfile(set.getString("profile"));
    
    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    return user;
    }
}
