package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.User;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "login.jsp";
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		

		User user = new User(email,password);

		if(user.loginUser()){
			nextPage = "profile.jsp";

			session.setAttribute("user",user);
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}