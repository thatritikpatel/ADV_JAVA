package listeners;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

public class AppSessionListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent ev){
		System.out.println(" ############  ");
		System.out.println(" ############  ");
		System.out.println(" Session Created  ");
		System.out.println(" ############  ");
		System.out.println(" ############  ");
	}

	public void sessionDestroyed(HttpSessionEvent ev){
		System.out.println(" ^^^^^^^^^^^^  ");
		System.out.println(" ^^^^^^^^^^^^  ");
		System.out.println(" Session Destroyed  ");
		System.out.println(" ^^^^^^^^^^^^  ");
		System.out.println(" ^^^^^^^^^^^^  ");
		System.out.println(" ^^^^^^^^^^^^  ");
	}
}