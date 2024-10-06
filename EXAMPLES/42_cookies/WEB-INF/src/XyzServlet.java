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
		
		pw.write("<form>");
		for(Cookie cookie : cookies){
			String ckNm = cookie.getName();
			
			if(ckNm.equals("uname")){
				pw.write("-User Name: <input type='text' name='uname' value='"+cookie.getValue()+"' /><br />");
			}else if(ckNm.equals("email")){
				pw.write("-Email: <input type='text' name='email' value='"+cookie.getValue()+"' /><br />");
			}else if(ckNm.equals("passw")){
				pw.write("-Password: <input type='password' name='passw' value='"+cookie.getValue()+"' /><br />");
			}else if(ckNm.equals("phone")){
				pw.write("-Phone No: <input type='text' name='phone' value='"+cookie.getValue()+"' /><br />");
			}		
		}	
		
		pw.write("<input type='submit' value='Register' />");
		pw.write("</form>");
		
		
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}