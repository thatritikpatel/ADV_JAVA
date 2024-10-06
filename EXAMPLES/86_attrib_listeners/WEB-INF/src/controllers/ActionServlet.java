package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		request.setAttribute("abc",123);
		request.setAttribute("abc",456);
		request.removeAttribute("abc");

		request.getRequestDispatcher("next.html").forward(request,response);
	}
}
