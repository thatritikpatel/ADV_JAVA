package listeners;

import javax.servlet.*;

public class AppReqAttribListener implements ServletRequestAttributeListener{
	public void attributeAdded(ServletRequestAttributeEvent ev){
		System.out.println("#################################");
		System.out.println(ev.getName()+" ~ "+ev.getValue());
		System.out.println("#################################");		
	}

	public void attributeRemoved(ServletRequestAttributeEvent ev){
		System.out.println("###############@@@@##############");
		System.out.println(ev.getName()+" ~ "+ev.getValue());
		System.out.println("###############@@@@##############");		
	}

	public void attributeReplaced(ServletRequestAttributeEvent ev){
		System.out.println("##############%%%%%###############");
		System.out.println(ev.getName()+" ~ "+ev.getValue());
		System.out.println("##############%%%%%##############");		
	}
}