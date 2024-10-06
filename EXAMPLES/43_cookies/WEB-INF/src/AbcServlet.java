import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
import java.util.Enumeration;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		Cookie ck1 = new Cookie("aaa","111");		
		Cookie ck2 = new Cookie("bbb","222");		
		Cookie ck3 = new Cookie("ccc","333");
		
		ck2.setMaxAge(0);
		ck3.setMaxAge(20);

		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);

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

		
		pw.write("<a href='xyz.do'>The Link</a>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}