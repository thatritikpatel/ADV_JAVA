import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		

		System.out.println("AbcServlet->ServletConfig: "+getServletConfig());
		System.out.println("AbcServlet->: "+this);
		System.out.println("App Context: "+getServletContext());
	}
}