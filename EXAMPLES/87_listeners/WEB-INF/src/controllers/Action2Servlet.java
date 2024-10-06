package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		
		session.removeAttribute("student");

		request.getRequestDispatcher("next2.html").forward(request,response);
	}
}
