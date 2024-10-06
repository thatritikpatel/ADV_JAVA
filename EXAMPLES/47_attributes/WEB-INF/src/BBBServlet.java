import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
		HttpSession session = request.getSession();

		System.out.println("~~~~~~~~~ inside BBBServlet");
		
		String name1 = (String)context.getAttribute("name");
		String name2 = (String)session.getAttribute("name");
		String name3 = (String)request.getAttribute("name");

		session.setMaxInactiveInterval(30);

		System.out.println("Attribute in application scope ~~~~~~~~~ ##### "+name1);
		System.out.println("Attribute in session scope ~~~~~~~~~ ##### "+name2);
		System.out.println("Attribute in request scope ~~~~~~~~~ ##### "+name3);
		
		request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}