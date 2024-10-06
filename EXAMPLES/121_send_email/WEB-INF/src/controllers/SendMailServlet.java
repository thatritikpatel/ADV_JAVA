package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import utils.EmailSender;

public class SendMailServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String toEmail = request.getParameter("email");
		String message = request.getParameter("message");

		EmailSender.sendEmail(toEmail,message);
	}
}