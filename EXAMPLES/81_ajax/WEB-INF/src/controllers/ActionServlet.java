package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("##########");

		String userName = request.getParameter("user");
		String age = request.getParameter("age");
		
		response.getWriter().write("Hello :: "+userName+"~"+age);
	}
}