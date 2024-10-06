package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Student;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		Student s = new Student("vijay", 13);
		session.setAttribute("student",s);

		request.getRequestDispatcher("next.html").forward(request,response);
	}
}
