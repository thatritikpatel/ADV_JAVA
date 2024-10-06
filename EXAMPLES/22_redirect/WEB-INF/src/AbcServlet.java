import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("AbcServelt ------- start");
		
		//response.sendRedirect("cmn.do");
		//response.sendRedirect("http://localhost:8080/xyz");
		//response.sendRedirect("http://localhost/golu");
		response.sendRedirect("http://www.google.com");
		

		System.out.println("AbcServelt ------- end");	
	}
}