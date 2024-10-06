import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
import java.util.Enumeration;

public class AbcServlet extends HttpServlet{
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
		pw.write("<h1>Done....</h1>");

		Enumeration<String> enm = request.getParameterNames();
		
		try{
			while(enm.hasMoreElements()){
				String paramName = enm.nextElement();
				Cookie ck = new Cookie(paramName,request.getParameter(paramName));
				response.addCookie(ck);
			}
		}catch(Exception e){
			e.printStackTrace();	
		}
		
		pw.write("<a href='xyz.do'>The Link</a>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}