package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("###########~~~~Inside Servlet~~~~###########");
		request.getRequestDispatcher("next.jsp").forward(request,response);
	} 
}