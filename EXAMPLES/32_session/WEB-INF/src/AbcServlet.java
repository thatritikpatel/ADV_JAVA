import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("Inside AbcServlet ------- start");
		System.out.println(session.isNew());
		System.out.println(session.getId());
		System.out.println("Inside AbcServlet ------- end");

		request.getRequestDispatcher("mno.html").forward(request,response);
	}
}