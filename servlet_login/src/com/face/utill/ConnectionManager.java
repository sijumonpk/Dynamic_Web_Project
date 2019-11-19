package com.face.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager 
{
	public Connection conection() throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/servletlogin","root","");
    if (con != null)
    {
        System.out.println("Connected");
    }
    else
    {
        System.out.println("not Connected");
    }
	return con;
    
	}
	

}
