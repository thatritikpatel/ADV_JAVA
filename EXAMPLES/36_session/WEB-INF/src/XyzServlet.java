import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;

public class XyzServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		
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
		
		String url = response.encodeURL("qrt.do");
		pw.write("<a href='"+url+"'>The Link</a>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}