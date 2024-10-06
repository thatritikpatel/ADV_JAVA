import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("~~~~~~~~~ inside BBBServlet");
		
		String name = (String)request.getAttribute("name");

		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}