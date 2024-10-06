package filters;

import javax.servlet.*;
import java.io.*;

public class AFilter implements Filter{
	public void init(FilterConfig conf) throws ServletException{
	
	}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		System.out.println("%%%%%%%%%% INSIDE AFILTER $$$$$$$$$");
		
		chain.doFilter(request,response);
	}

	public void destroy(){
	
	}
}