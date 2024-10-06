package listeners;

import javax.servlet.ServletRequestListener;
import javax.servlet.ServletRequestEvent;

public class AppRequestListener implements ServletRequestListener{
	public void requestInitialized(ServletRequestEvent event){
		System.out.println("~~~~~~~~~~~ #### ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ #### ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ Request Initialized ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ #### ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ #### ~~~~~~~~~~~");
	}

	public void requestDestroyed(ServletRequestEvent event){
		System.out.println("~~~~~~~~~~~ ???? ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ ???? ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ Request Destroyed ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ ???? ~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ ???? ~~~~~~~~~~~");
	}
}