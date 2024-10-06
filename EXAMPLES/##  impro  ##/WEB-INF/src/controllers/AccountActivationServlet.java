package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Institute;

public class AccountActivationServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "activation_failed.jsp";

		String email = request.getParameter("email");
		String vfCode = request.getParameter("vcode");
		int iam = Integer.parseInt(request.getParameter("iam"));

		if(iam==0){
			if(Institute.activateAccount(email,vfCode)){
				nextPage = "login.jsp";
			}
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}