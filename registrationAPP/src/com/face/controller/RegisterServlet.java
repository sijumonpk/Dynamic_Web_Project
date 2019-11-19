package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;

/**
 * @author sijumon
 * Action Servlet implementation class to perform user registration
 * Date 14-11-19
 * @category controller class
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
	 * @im1Spec->action method to register custom with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//content to client
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String college=request.getParameter("college");
		
		//encapsulation part
		RegisterBO rgbo = new RegisterBO();
		rgbo.setEmail(email);
		rgbo.setPassword(password);
		rgbo.setName(name);
		rgbo.setCollege(college);
		
	}
}