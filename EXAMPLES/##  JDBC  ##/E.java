import java.sql.*;

class E{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			
			String query = "select * from users";

			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rs = pst.executeQuery();

			while(rs.next()){
				//System.out.print(rs.getInt("user_id")+"\t"+rs.getString("user_name")+"\t"+rs.getString("email")+"\t"+rs.getString("password")+"\n");
				//System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\n");
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}