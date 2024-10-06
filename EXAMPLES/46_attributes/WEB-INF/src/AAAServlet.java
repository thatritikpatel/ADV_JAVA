import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
 		
		System.out.println("~~~~~~~~~ inside AAAServlet");
		System.out.println("~~~~~~~~~ ServletContext: "+context);
		
		context.setAttribute("name","mohan");

		request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}