package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.User;

public class ShowServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ArrayList<User> users = User.collectUsers();
		
		request.setAttribute("users",users);
		
		request.getRequestDispatcher("records.jsp").forward(request,response);
	}
}