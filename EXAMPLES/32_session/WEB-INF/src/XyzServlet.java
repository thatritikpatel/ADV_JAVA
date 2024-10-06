import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class XyzServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("Inside XyzServlet ------- start");
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println("Inside XyzServlet ------- end");

		request.getRequestDispatcher("pqr.html").forward(request,response);
	}
}