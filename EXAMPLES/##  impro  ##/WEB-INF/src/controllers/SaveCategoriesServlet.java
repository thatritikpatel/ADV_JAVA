package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.*;

public class SaveCategoriesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		String nextPage = "login.jsp";

		if(!session.isNew()){
			Institute institute = (Institute)session.getAttribute("institute");
			
			String[] categoryIds = request.getParameterValues("li_id");
			
			InstituteCategory.saveCategories(institute.getInstituteId(),categoryIds);

			response.getWriter().write("true");
		}else{
			response.getWriter().write("false");
		}		
	}
}