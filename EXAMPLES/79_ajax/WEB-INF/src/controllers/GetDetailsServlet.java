package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.City;
import java.util.ArrayList;

import com.google.gson.Gson;

public class GetDetailsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		
		String cityId = request.getParameter("ct_id");

		int ctId = Integer.parseInt(cityId);
		String cityDetails = City.getDetails(ctId);

		response.getWriter().write(cityDetails);
	}
}