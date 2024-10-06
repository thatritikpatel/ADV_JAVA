import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BBBServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("~~~~~~~~~ inside BBBServlet");
		System.out.println("~~~~~~~~~ Session iD: "+session.getId());

		String name = (String)session.getAttribute("name");
		
		System.out.println("~~~~~~~~~ ##### "+name);
		
		request.getRequestDispatcher("bbb.html").forward(request,response);
	}
}