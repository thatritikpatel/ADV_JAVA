import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MohanServlet extends HttpServlet{
	public void init() throws ServletException{
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("##########inside init()###########");
		System.out.println("##############################");
		System.out.println("##############################");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		Date date = new Date();

		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>Hello Mohan</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>"+date+"</h1>");
		pw.write("</body>");
		pw.write("</html>");

		pw.flush();
		pw.close();
	}

	public void destroy(){
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("##########inside destroy()###########");
		System.out.println("##############################");
		System.out.println("##############################");
	}
}