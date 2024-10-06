package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BaseServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "";

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}