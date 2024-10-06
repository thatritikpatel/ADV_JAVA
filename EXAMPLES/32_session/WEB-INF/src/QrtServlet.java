import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class QrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("Inside QrtServlet ------- start");
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println("Inside QrtServlet ------- end");

		request.getRequestDispatcher("mohan.html").forward(request,response);
	}
}