package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String count = getInitParameter("count");

		System.out.println(count+" ##############");

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}