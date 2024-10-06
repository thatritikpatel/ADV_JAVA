package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("############ Inside Action2Servlet ##########");
		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}