package models;

import java.sql.*;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public User(){
	
	}

	public User(String userName,String email,String password){
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public User(String email,String password){
		this.email = email;
		this.password = password;
	}


	public boolean loginUser(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=1234");
			
			String query = "select password,user_id,user_name from users where email=?";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,email);			

			ResultSet rst = pst.executeQuery();
			
			StrongPasswordEncryptor spe = new StrongPasswordEncryptor();

			if(rst.next()){
				if(spe.checkPassword(password,rst.getString(1))){
					userId = rst.getInt(2);
					userName = rst.getString(3);

					flag = true;
				}
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return flag;
	}





	public boolean registerUser(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=1234");
			
			String query = "insert into users (user_name,email,password) value (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1,userName);
			pst.setString(2,email);

			StrongPasswordEncryptor spe = new StrongPasswordEncryptor();
			String encPass = spe.encryptPassword(password);
			pst.setString(3,encPass);

			int res = pst.executeUpdate();

			if(res==1){
				flag = true;
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
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