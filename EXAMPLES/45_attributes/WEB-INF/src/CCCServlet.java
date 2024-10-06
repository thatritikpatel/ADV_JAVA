import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CCCServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("~~~~~~~~~ inside CCCServlet");
		System.out.println("~~~~~~~~~ Session iD: "+session.getId());
		
		String name = (String)session.getAttribute("name");

		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("ccc.html").forward(request,response);
	}
}