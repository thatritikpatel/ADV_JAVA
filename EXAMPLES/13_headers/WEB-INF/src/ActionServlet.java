import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String host = request.getHeader("host");
		String userAgent = request.getHeader("user-agent");
		String accept = request.getHeader("accept");
		String acceptLang = request.getHeader("accept-language");
		String acceptEnc = request.getHeader("accept-encoding");
		String acceptCSet = request.getHeader("accept-charset");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Host: "+host+"</h1>");
		pw.write("<h1>User Agent: "+userAgent+"</h1>");
		pw.write("<h1>Accept: "+accept+"</h1>");
		pw.write("<h1>Accept Language: "+acceptLang+"</h1>");
		pw.write("<h1>Accept Encoding: "+acceptEnc+"</h1>");
		pw.write("<h1>Accept Charset: "+acceptCSet+"</h1>");

		pw.flush();
		pw.close();
	}
}