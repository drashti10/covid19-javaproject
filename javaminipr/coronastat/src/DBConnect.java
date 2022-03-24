/*
 * To change this license header, choose License Headers in Project Properties.
 To*  change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrs
 */

import java.sql.*;
public class DBConnect {
    
Connection Connect()
{        
    Connection con=null;
    try
       {
           
       String URL="jdbc:mysql://localhost:3306/";
       String DATABASE="corona_statistics";
       String USER="root";
       String PASSWORD="";
       con = (Connection) DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);        
       System.out.println("Database connection successful");
           
       }
       catch(Exception e) {System.out.println("MySQL Server is not RUNNING:"+e);}
return con;
}

}