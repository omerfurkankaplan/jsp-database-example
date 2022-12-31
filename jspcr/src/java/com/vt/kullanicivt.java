/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vt;

import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.users.Kullanici;
/**
 *
 * @author ömer
 */
public class kullanicivt {
 public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ct","root","");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
    
}  
public static int save(Kullanici k){  
    int status=0;  
    try{  
        Connection con=getConnection();  
       PreparedStatement preStmt;
preStmt = con.prepareStatement("INSERT INTO register(name,password,email,cins) VALUES (?,?,?,?)");
  preStmt.setString(1,k.getName());  
        preStmt.setString(2,k.getPassword());  
        preStmt.setString(3,k.getEmail());  
        preStmt.setString(4,k.getcins());  

preStmt.executeUpdate();
preStmt.close();
con.close();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Kullanici k){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update register set name=?,password=?,email=?,cins=? where id=?");  
        ps.setString(1,k.getName());  
        ps.setString(2,k.getPassword());  
        ps.setString(3,k.getEmail());
        ps.setString(4,k.getcins());


       
        ps.setInt(5,k.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Kullanici k){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from register where id=?");  
        ps.setInt(1,k.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Kullanici> getAllRecords(){  
    List<Kullanici> list=new ArrayList<Kullanici>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from register");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Kullanici k=new Kullanici();  
            k.setId(rs.getInt("id"));  
            k.setName(rs.getString("name"));  
            k.setPassword(rs.getString("password"));  
            k.setEmail(rs.getString("email"));  
            k.setcins(rs.getString("cins"));  
 
             
            list.add(k);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Kullanici getRecordById(int id){  
    Kullanici k=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from register where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            k=new Kullanici();  
            k.setId(rs.getInt("id"));  
            k.setName(rs.getString("name"));  
            k.setPassword(rs.getString("password"));  
            k.setEmail(rs.getString("email"));  
            k.setcins(rs.getString("cins"));  
        }  
    }catch(Exception e){System.out.println(e);}  
    return k;  
}  
}
