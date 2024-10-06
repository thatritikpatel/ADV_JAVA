package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("############ Inside Action1Servlet ##########");
		request.getRequestDispatcher("act2.do").forward(request,response);
	}
}