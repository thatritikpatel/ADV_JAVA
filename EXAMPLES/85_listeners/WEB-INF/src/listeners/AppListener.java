package listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class AppListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent ev){
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ Context Initialized ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
	}

	public void contextDestroyed(ServletContextEvent ev){
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ Context Destroyed ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
		System.out.println("~~~~~~ $ ~~~~~~~~");
	}
}