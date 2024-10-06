package models;

import java.sql.*;
import java.util.*;

public class Category{
	private Integer categoryId;
	private String category;

	public Category(Integer categoryId,String category){
		this.categoryId = categoryId;
		this.category = category;
	}


	public static ArrayList<Category> collectCategories(){
		ArrayList<Category> categories = new ArrayList<Category>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select * from categories";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				categories.add(new Category(rs.getInt(1),rs.getString(2)));
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return categories;
	}




    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}