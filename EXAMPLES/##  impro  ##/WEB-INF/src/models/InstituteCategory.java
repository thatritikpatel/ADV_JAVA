package models;

import java.sql.*;
import java.util.*;

public class InstituteCategory{
	//#######################################################
	private Integer instituteCategoryId;
	private Institute institute;
	private Category category;

	//#######################################################




	//#######################################################
	public static ArrayList<Category> collectInstituteCategories(Integer instituteId){
		ArrayList<Category> categories = new ArrayList<Category>();
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select c.category_id,category from institute_categories as ic inner join categories as c where institute_id=? and ic.category_id=c.category_id";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,instituteId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				categories.add(new Category(rs.getInt(1),rs.getString(2)));
			}
			
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return categories;
	}
	
	
	public static void saveCategories(Integer instituteId,String[] categoryIds){
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "insert into institute_categories (institute_id,category_id) value (?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,instituteId);
			for(String catId : categoryIds){
				ps.setInt(2,Integer.parseInt(catId));
				ps.executeUpdate();
			}		
			
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}


	//########################################################
    public Integer getInstituteCategoryId() {
        return instituteCategoryId;
    }

    public void setInstituteCategoryId(Integer instituteCategoryId) {
        this.instituteCategoryId = instituteCategoryId;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}