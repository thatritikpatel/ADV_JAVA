package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

import models.*;
import com.google.gson.Gson;

public class CollectInstituteCategoriesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		if(!session.isNew()){
			Institute institute = (Institute)session.getAttribute("institute");
			ArrayList<Category> categories = InstituteCategory.collectInstituteCategories(institute.getInstituteId());
			Gson gson = new Gson();
			response.getWriter().write(gson.toJson(categories));
		}else{
		
		}
	}
}