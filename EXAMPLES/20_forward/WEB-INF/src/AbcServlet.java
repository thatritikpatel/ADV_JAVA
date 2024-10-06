import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		//System.out.println("ABCServlet----- 1 ---");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>ABCServlet ----</h1>");

		RequestDispatcher view = request.getRequestDispatcher("cmn.do");
		view.forward(request,response);
	}
}