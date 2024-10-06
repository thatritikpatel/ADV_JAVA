import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class MyFirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
								throws IOException,ServletException{
		
		response.setContentType("text/html");		

		PrintWriter pw = response.getWriter();
		pw.print("<h1>Hello..World</h1>");
		
		Connection con = DBBoard.getConnection();

		try
		{
			String q = "select city from cities where state_id=1";
			PreparedStatement p = con.prepareStatement(q);
			ResultSet rs = p.executeQuery();
			while(rs.next()){
				pw.print(rs.getString(1)+"<br />");
			}

			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		java.util.Date dt = new java.util.Date();
		String dtTime = dt.toString();

		pw.print("<br />"+dtTime);
		
		pw.flush();
		pw.close();
	}
}