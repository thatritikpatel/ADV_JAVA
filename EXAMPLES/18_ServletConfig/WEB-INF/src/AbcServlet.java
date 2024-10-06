import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		System.out.println("AbcServlet->ServletConfig: "+conf);
		System.out.println("AbcServlet->: "+this);
	}
}