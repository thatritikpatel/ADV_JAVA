import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class MnoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		System.out.println("MnoServlet->ServletConfig: "+conf);
		System.out.println("MnoServlet->: "+this);
	}
}