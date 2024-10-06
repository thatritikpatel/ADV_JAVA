package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowCategoryPageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "login.jsp";

		if(!session.isNew()){
			nextPage = "categories.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}