import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class XyzServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		Cookie[] cookies = request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.write("<!doctype html>");
		pw.write("<html lang='en'>");
		pw.write("<head>");
		pw.write("<meta charset='UTF-8'>");
  
		pw.write("<title>Document</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Two Page</h1>");
		
		for(Cookie cookie : cookies){
			pw.write("<h1>"+cookie.getName()+"~"+cookie.getValue()+"</h1>");
		}		
		
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}