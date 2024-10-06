package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.User;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage = "index.jsp";
		
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repassw");

		User user = new User(userName,email,password);

		if(user.registerUser()){
			nextPage = "login.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}