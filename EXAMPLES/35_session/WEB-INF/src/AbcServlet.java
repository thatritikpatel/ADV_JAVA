import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		System.out.println("Inside AbcServlet ------- start");
		System.out.println("Is New: "+session.isNew());
		System.out.println("Creation Time: "+new Date(session.getCreationTime()));
		System.out.println("Last Accessed Time: "+new Date(session.getLastAccessedTime()));
		System.out.println("ID: "+session.getId());
		System.out.println("MaxInactiveInterval: "+session.getMaxInactiveInterval());
		System.out.println("Inside AbcServlet ------- end");

		//request.getRequestDispatcher("mno.html").forward(request,response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.write("<!doctype html>");
		pw.write("<html lang='en'>");
		pw.write("<head>");
		pw.write("<meta charset='UTF-8'>");
  
		pw.write("<title>Document</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>One Page</h1>");
		
		String url = response.encodeURL("xyz.do");
		pw.write("<a href='"+url+"'>The Link</a>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}