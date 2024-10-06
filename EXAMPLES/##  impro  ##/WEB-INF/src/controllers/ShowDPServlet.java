package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Institute;

public class ShowDPServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		HttpSession session = request.getSession();
		
		Institute institute = (Institute)session.getAttribute("institute");

		InputStream is = getServletContext().getResourceAsStream("/WEB-INF/uploads/"+institute.getEmail()+"/"+institute.getInstDp());
		
		OutputStream os = response.getOutputStream();
		
		byte[] arr = new byte[1024];
		
		int x = 0;
		while((x=is.read(arr))!=-1){
			os.write(arr);
		}

		os.flush();
		os.close();	
	}
}