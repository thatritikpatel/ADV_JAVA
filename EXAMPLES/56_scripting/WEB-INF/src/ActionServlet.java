import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		request.setAttribute("name","mohan");
		request.setAttribute("age",23);
		
		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}