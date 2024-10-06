import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CommonServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("CommonServlet ------- start");
		
		PrintWriter pw = response.getWriter();

		pw.write("<h1>CommonServlet ###### ----start</h1>");
		pw.write("<h1>CommonServlet ###### ----end</h1>");
		
		System.out.println("CommonServlet ------- end");
	}
}