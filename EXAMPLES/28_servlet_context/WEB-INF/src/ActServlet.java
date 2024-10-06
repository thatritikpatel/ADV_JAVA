import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;

public class ActServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>"+getInitParameter("manager")+"</h1>");
		
		ServletContext context = request.getServletContext();
		pw.write("<h1>"+context.getInitParameter("manager")+"</h1>");
				

		pw.flush();
		pw.close();
	}
}