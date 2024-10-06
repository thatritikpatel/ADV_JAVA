package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Institute;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "login.jsp";

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int iam = Integer.parseInt(request.getParameter("iam"));

		Institute institute = new Institute();
		institute.setEmail(email);
		institute.setPassword(password);

		if(institute.loginInstitute()){
			nextPage = "institute_profile.jsp";

			session.setAttribute("institute",institute);
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}