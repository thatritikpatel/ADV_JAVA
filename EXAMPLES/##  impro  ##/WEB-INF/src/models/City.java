package models;

import java.util.*;
import java.sql.*;

public class City{
	
    private Integer cityId;
    private String cityName;
    private State state;

	public City(Integer cityId,String cityName){
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public City(Integer cityId){
		this.cityId = cityId;
	}

	public static ArrayList<City> searchCities(String city){
		ArrayList<City> cities = new ArrayList<City>();

		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select city_id,city from cities where city like '%"+city+"%'";
			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rst = pst.executeQuery();
			
			while(rst.next()){
				cities.add(new City(rst.getInt(1),rst.getString(2)));
			}	

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return cities;
	}

	public static ArrayList<City> collectCities(){
		ArrayList<City> cities = new ArrayList<City>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/impro?user=root&password=1234");

			String query = "select * from cities";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				cities.add(new City(rs.getInt(1),rs.getString(2)));
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return cities;
	}

   
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

   

}