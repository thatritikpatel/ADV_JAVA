import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("Inside AbcServlet ------- start");
		System.out.println("Is New: "+session.isNew());
		System.out.println("Creation Time: "+new Date(session.getCreationTime()));
		System.out.println("Last Accessed Time: "+new Date(session.getLastAccessedTime()));
		System.out.println("ID: "+session.getId());
		System.out.println("MaxInactiveInterval: "+session.getMaxInactiveInterval());
		System.out.println("Inside AbcServlet ------- end");

		request.getRequestDispatcher("mno.html").forward(request,response);
	}
}