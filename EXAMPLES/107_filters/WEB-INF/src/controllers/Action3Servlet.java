package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("############ Inside Action3Servlet ##########");
		
		request.getRequestDispatcher("act2.do").include(request,response);
		
		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}