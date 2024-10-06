import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CCCServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("~~~~~~~~~ inside CCCServlet");
		
		String name = (String)request.getAttribute("name");

		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("ccc.html").forward(request,response);
	}
}