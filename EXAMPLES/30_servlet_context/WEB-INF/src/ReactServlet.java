import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;

public class ReactServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>"+getServletContext().getInitParameter("manager")+"</h1>");
				

		pw.flush();
		pw.close();
	}
}