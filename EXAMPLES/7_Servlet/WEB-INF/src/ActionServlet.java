import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		Date date = new Date();

		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>Hello</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>"+date+"</h1>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}
}