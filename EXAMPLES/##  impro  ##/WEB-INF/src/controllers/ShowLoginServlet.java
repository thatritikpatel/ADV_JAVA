package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "login.jsp";		

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}