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
				users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return users;
	}

	public static boolean exists(String email){
		boolean flag = false;	
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");

			String query = "select user_id from users where email=?";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,email);
			ResultSet rst =  pst.executeQuery();

			if(rst.next()){
				flag = true;
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return flag;
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