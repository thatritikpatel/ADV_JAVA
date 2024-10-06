package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Student;
import java.util.ArrayList;

public class ShowStudentsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		ArrayList<Student> students =  Student.collectStudents();

		request.setAttribute("students",students);
		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}