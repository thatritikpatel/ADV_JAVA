package filters;

import javax.servlet.*;
import java.io.*;

public class AFilter implements Filter{
	FilterConfig fc;
	
	public void init(FilterConfig conf) throws ServletException{
		fc = conf;
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		System.out.println("%%%%%%% Inside AFilter %%%%%%%%%%%%%%%%%%%");
				
		chain.doFilter(request,response);
	}

	public void destroy(){
	
	}
}