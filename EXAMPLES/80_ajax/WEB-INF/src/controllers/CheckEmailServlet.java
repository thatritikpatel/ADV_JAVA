package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class CheckEmailServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		boolean flag = User.exists(request.getParameter("email"));
		
		
		response.getWriter().write(Boolean.toString(flag));
	}
}