package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.google.gson.Gson;

import models.City;

public class SearchCitiesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String city = request.getParameter("city");

		ArrayList<City> cities = City.searchCities(city);
		
		System.out.println("######################## --- 1");
		Gson gson = new Gson();
		String citiesJSON = gson.toJson(cities);
		System.out.println("######################## --- 2");

		response.getWriter().write(citiesJSON);
	}
}