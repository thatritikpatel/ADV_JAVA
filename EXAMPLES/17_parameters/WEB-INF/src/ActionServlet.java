import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("nm");

		String food = request.getParameter("food");
		String city = request.getParameter("ct");
		

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>Name: "+name+"</h1>");
		pw.write("<h1>Food: "+food+"</h1>");
		pw.write("<h1>City: "+city+"</h1>");

		
		
		pw.flush();
		pw.close();
	}
}