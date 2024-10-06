package tlds;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;

public class ProHandler extends SimpleTagSupport{
	public void doTag() throws IOException, JspException{
		System.out.println("Hello Cust Tag...");
		JspFragment jFrag = getJspBody();
		jFrag.invoke(null);
	}
}
