package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.City;
import java.util.ArrayList;

import com.google.gson.Gson;

public class CollectRecordsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String city = request.getParameter("city");
		
		response.getWriter().write(new Gson().toJson(City.collectCities(city)));
	}
}