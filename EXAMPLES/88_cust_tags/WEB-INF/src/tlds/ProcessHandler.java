package tlds;

import java.io.IOException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;

public class ProcessHandler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		System.out.println("inside proces handler ###########");
	}
}