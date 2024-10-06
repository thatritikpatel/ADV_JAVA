import java.sql.*;

import java.io.Console;

class F{
	public static void main(String[] args){
		Console c = System.console();
		System.out.print("Enter User Id: ");
		int userId = Integer.parseInt(c.readLine());
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			
			String query = "select * from users where user_id=?";

			PreparedStatement pst = con.prepareStatement(query);
			
			//System.out.println(pst);
			pst.setInt(1,userId);
			//System.out.println(pst);

			ResultSet rs = pst.executeQuery();

			if(rs.next()){
				//System.out.print(rs.getInt("user_id")+"\t"+rs.getString("user_name")+"\t"+rs.getString("email")+"\t"+rs.getString("password")+"\n");
				System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\n");
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}