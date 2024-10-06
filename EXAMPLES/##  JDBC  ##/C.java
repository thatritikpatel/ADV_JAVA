import java.sql.*;
import java.io.Console;

class C{
	public static void main(String[] args){
		Console c = System.console();

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");

			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);
			
			System.out.print("Enter your Name: ");
			String userName = c.readLine();
			pst.setString(1,userName);

			System.out.print("Enter your Email: ");
			String email = c.readLine();
			pst.setString(2,email);

			System.out.print("Enter your Password: ");
			char[] password = c.readPassword();
			pst.setString(3,new String(password));

			pst.executeUpdate();

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}