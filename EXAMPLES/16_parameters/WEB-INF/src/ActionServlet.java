import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("nm");
				
		//String food1 = request.getParameter("food");
		//String food2 = request.getParameter("food");
		//String food3 = request.getParameter("food");

		String[] food = request.getParameterValues("food");

		String[] cities = request.getParameterValues("ct");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>Name: "+name+"</h1>");
		//pw.write("<h1>Food 1: "+food1+"</h1>");
		//pw.write("<h1>Food 2: "+food2+"</h1>");
		//pw.write("<h1>Food 3: "+food3+"</h1>");
		int i = 1;
		for(String str : food){
			pw.write("<h1>Food "+i+":"+str+"</h1>");
			i++;
		}
		
		i = 1;
		for(String city : cities){
			pw.write("<h1>City "+i+": "+city+"</h1>");
			i++;
		}
		
		pw.flush();
		pw.close();
	}
}