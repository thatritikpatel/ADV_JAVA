import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("AbcServelt ------- start");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.write("<h1>AbcServlet ###### ----start</h1>");
		
		RequestDispatcher view = request.getRequestDispatcher("cmn.do");
		view.include(request,response);

		pw.write("<h1>AbcServlet ###### ----end</h1>");

		System.out.println("AbcServelt ------- end");

		pw.flush();
		pw.close();
	}
}