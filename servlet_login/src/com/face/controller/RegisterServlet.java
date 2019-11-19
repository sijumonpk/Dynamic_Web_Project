package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.Registerbo;
import com.face.dao.RegisterDAO;
import com.face.utill.ConnectionManager;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome");
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String college=request.getParameter("college");
		String department=request.getParameter("department");
		
		Registerbo rebo = new Registerbo();
		ConnectionManager cm=new ConnectionManager();
		rebo.setName(name);
		rebo.setEmail(email);
		rebo.setPassword(password);
		rebo.setCollege(college);
		rebo.setDepartment(department);
		
		try {
			RegisterDAO.Save(cm.conection(), rebo);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();	
			}
		catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
