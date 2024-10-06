import java.sql.*;

import java.io.Console;

class I{
	public static void main(String[] args){
		Console c = System.console();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
			
			String query = "delete from users where email=?";

			PreparedStatement pst = con.prepareStatement(query);
			
			System.out.print("Enter your email: ");
			String email = c.readLine();
			pst.setString(1,email);

			pst.executeUpdate();

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}