import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CCCServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
		HttpSession session = request.getSession();
		
		System.out.println("~~~~~~~~~ inside CCCServlet");
		
		String name1 = (String)context.getAttribute("name");
		String name2 = (String)session.getAttribute("name");
		String name3 = (String)request.getAttribute("name");

		System.out.println("Attribute in application scope ~~~~~~~~~ ##### "+name1);
		System.out.println("Attribute in session scope ~~~~~~~~~ ##### "+name2);
		System.out.println("Attribute in request scope ~~~~~~~~~ ##### "+name3);
		
		request.getRequestDispatcher("ccc.html").forward(request,response);
	}
}