package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage = "index.jsp";
		
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repass");
		String botTest = request.getParameter("bottest");

		boolean flag = true;
		String errorMessage = "";

		if(userName.length()<3){
			flag = false;
			errorMessage = errorMessage + "Name must be at least 3 characters length<br />";
		}

		Pattern p = Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
		Matcher m = p.matcher(email);
		if(!m.matches()){
			flag = false;	
			errorMessage = errorMessage + "An inavalid Email...<br />";
		}

		int passwordLength = password.length(); 
		if(passwordLength<6||passwordLength>12){
			flag = false;
			errorMessage = errorMessage + "Password must be at least 6 charcters and at max 12 charcters<br />";
		}

		if(!password.equals(rePassword)){
			flag = false;
			errorMessage = errorMessage + "Password and Retype Password must match<br />";
		}

		if(botTest.length()>0){
			flag = false;
			errorMessage = errorMessage + "You are a Robot...";
		}

		
		if(flag){
			//----
			nextPage = "success.jsp";
		}else{
			request.setAttribute("err_msg",errorMessage);
		}

		System.out.println(flag+" ~~~~~~ "+nextPage);

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}