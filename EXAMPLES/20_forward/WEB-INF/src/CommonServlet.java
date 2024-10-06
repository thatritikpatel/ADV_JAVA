import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class CommonServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		//System.out.println("CommonServlet----- 1 ---");
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>CommonServlet -----</h1>");

		pw.flush();
		pw.close();		
	}
}