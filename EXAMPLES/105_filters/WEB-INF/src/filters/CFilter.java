package filters;

import javax.servlet.*;
import java.io.*;

public class CFilter implements Filter{
	FilterConfig  fc;

	public void init(FilterConfig conf) throws ServletException{
		fc = conf;
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		System.out.println("###########~~~~Inside CFilter~~~~###########");

		chain.doFilter(request,response);
	}

	public void destroy(){
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");
	}
}