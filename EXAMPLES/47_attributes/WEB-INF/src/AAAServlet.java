import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();
		HttpSession session = request.getSession();
 		
		System.out.println("~~~~~~~~~ inside AAAServlet");
		
		request.setAttribute("name","mohan");
		session.setAttribute("name","sohan");
		context.setAttribute("name","rohan");

		request.getRequestDispatcher("aaa.html").forward(request,response);
	}
}