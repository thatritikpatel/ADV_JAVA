import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class MnoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("MnoServlet->ServletConfig: "+getServletConfig());
		System.out.println("MnoServlet->: "+this);
		System.out.println("App Context: "+getServletContext());
	}
}