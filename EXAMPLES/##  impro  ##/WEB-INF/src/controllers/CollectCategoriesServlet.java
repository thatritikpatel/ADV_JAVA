package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.ArrayList;
import models.Category;

import com.google.gson.Gson;

public class CollectCategoriesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ServletContext context = getServletContext();

		ArrayList<Category> categories = (ArrayList<Category>)context.getAttribute("categories");		

		String res = new Gson().toJson(categories);

		response.getWriter().write(res);
	}
}