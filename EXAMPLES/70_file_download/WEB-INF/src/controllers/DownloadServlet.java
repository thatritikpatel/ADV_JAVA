package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DownloadServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("application/pdf");

		ServletOutputStream sos = response.getOutputStream();

		InputStream is = getServletContext().getResourceAsStream("/WEB-INF/upload/a3.pdf");		

		byte[] arr = new byte[1024];

		//int count = 0;
		while(is.read(arr)!=-1){
			sos.write(arr);
		}

		sos.flush();
		sos.close();
	}
}




