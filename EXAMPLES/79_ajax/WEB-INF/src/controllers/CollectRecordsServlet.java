package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;


import java.util.ArrayList;

import com.google.gson.Gson;

public class CollectRecordsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		int start = Integer.parseInt(request.getParameter("start"));
		ArrayList<String> records = new ArrayList<String>();
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc?user=root&password=1234");
			
			String query = "select record from  records limit ?,5";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,start);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				flag = true;
				records.add(rs.getString(1));
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}		
		
		if(flag){
			Gson gson = new Gson();
			String jsonString = gson.toJson(records);
			response.getWriter().write(jsonString);
		}else{
			response.getWriter().write("no");
		}
	}
}



