package listeners;

import javax.servlet.*;
import java.util.ArrayList;
import models.*;

public class AppListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent ev){
		ServletContext appContext = ev.getServletContext();
		
		ArrayList<City> cities = City.collectCities();		
		appContext.setAttribute("cities",cities);

		ArrayList<Category> categories = Category.collectCategories();
		appContext.setAttribute("categories",categories);
	}

	public void contextDestroyed(ServletContextEvent ev){
	
	}
}