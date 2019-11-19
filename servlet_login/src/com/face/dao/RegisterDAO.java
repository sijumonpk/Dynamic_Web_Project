package com.face.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.face.bo.Registerbo;

public class RegisterDAO 
{
	public static final RegisterDAO regdao = new RegisterDAO();
	public static void Save(Connection Connection,Registerbo rg) {
		try {
			Statement stmt = Connection.createStatement();
			String query="INSERT INTO credentials VALUES('"+rg.getName()+"','"+rg.getPassword()+"','"+rg.getEmail() +"','"+rg.getCollege()+"')";
		   int result = stmt.executeUpdate(query);
		   if(result==1)
		   {
			   System.out.println("success");
		   }
		}
		catch(Exception e) {
			
		}
	}

}
