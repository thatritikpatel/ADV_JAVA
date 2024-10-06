import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
		
		System.out.println("~~~~~~~~~ inside BBBServlet");
		System.out.println("~~~~~~~~~ ServletContext: "+context);
		
		String name = (String)context.getAttribute("name");

		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}