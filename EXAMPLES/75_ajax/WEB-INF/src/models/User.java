package models;

import java.sql.*;

import java.util.ArrayList;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public User(){
	
	}

	public User(Integer userId,String userName,String email,String password){
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public User(String userName,String email,String password){
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public static ArrayList<User> collectUsers(){
		ArrayList<User> users = new ArrayList<User>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			
			String query = "select * from users";

			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				//User user = new User(rs.getInt("user_id"),rs.getString("user_name"),rs.getString("email"),rs.getString("password"));
				
				int uId = rs.getInt("user_id");
				String uNm = rs.getString("user_name");
				String em = rs.getString("email");
				String pw = rs.getString("password");
				User user = new User(uId,uNm,em,pw);

				users.add(user);
			}

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return users;
	}

	public boolean saveUser(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
			
			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);
			
			int res = pst.executeUpdate();
			if(res==1){
				flag = true;
			}


			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return flag;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}


}