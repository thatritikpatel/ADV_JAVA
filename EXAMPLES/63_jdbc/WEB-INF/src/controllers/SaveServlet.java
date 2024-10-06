package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.User;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");

		User user = new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		
		user.saveUser();
		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}