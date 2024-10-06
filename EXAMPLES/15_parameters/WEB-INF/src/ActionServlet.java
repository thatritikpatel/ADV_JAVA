import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("nm");
		String food1 = request.getParameter("food");
		String food2 = request.getParameter("food");
		String food3 = request.getParameter("food");

		String city1 = request.getParameter("ct");
		String city2 = request.getParameter("ct");
		String city3 = request.getParameter("ct");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>Name: "+name+"</h1>");
		pw.write("<h1>Food 1: "+food1+"</h1>");
		pw.write("<h1>Food 2: "+food2+"</h1>");
		pw.write("<h1>Food 3: "+food3+"</h1>");

		pw.write("<h1>City 1: "+city1+"</h1>");
		pw.write("<h1>City 2: "+city2+"</h1>");
		pw.write("<h1>City 3: "+city3+"</h1>");
		
		pw.flush();
		pw.close();
	}
}