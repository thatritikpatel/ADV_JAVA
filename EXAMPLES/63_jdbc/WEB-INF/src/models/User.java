package models;

import java.sql.*;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public void saveUser(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
			
			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);

			pst.executeUpdate();


			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
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