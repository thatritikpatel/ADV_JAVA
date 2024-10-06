package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Institute;

public class CheckDuplicateEmailServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String email = request.getParameter("email");
		
		String resp = "false";

		if(Institute.checkDuplicateEmail(email)){
			resp = "true";	
		}	
		
		response.getWriter().write(resp);
	}
}