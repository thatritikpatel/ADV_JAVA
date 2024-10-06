package abc;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		Student s = new Student("mohan",20,"GGITS");

		request.setAttribute("student",s);
		
		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}