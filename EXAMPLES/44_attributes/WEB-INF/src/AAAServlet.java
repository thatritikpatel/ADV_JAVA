import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AAAServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("~~~~~~~~~ inside AAAServlet");
		
		request.setAttribute("name","mohan");

		request.getRequestDispatcher("bbb.do").forward(request,response);
	}
}