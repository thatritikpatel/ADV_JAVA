package filters;

import javax.servlet.*;
import java.io.*;

public class DFilter implements Filter{
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
		System.out.println("###########~~~~Inside DFilter~~~~###########");

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