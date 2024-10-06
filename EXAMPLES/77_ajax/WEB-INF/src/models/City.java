package models;

import java.sql.*;
import java.util.*;

public class City{
	private Integer cityId;
	private String city;

	public City(){
	
	}

	public City(Integer cityId,String city){
		this.cityId = cityId;
		this.city = city;
	}


	public static ArrayList<City> collectCities(String ct){
		ArrayList<City> cities = new ArrayList<City>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
			
			String query = "select city_id,city from cities where city like '"+ct+"%'";

			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rst = pst.executeQuery();

			while(rst.next()){
				City city = new City();
				city.cityId = rst.getInt(1);
				city.city = rst.getString(2);

				cities.add(city);
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return cities;
	}


	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setCityId(Integer cityId){
		this.cityId = cityId;
	}

	public Integer getCityId(){
		return cityId;
	}
}