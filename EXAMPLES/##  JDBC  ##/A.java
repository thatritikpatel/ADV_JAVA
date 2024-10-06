import java.sql.*;

class A{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			
			String query = "insert into users (user_name,email,password) value ('Ganesh Kumar','ganesh@gmail.com','123456')";
			PreparedStatement pst = con.prepareStatement(query);

			int rows = pst.executeUpdate();

			System.out.println(rows);
			
			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}