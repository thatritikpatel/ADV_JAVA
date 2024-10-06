import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CCCServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
		
		System.out.println("~~~~~~~~~ inside CCCServlet");
		System.out.println("~~~~~~~~~ ServletContext: "+context);
		
		String name = (String)context.getAttribute("name");

		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("ccc.html").forward(request,response);
	}
}