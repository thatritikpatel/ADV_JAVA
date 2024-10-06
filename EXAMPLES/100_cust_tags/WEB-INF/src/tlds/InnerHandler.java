package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.JspException;
import java.io.IOException;


public class InnerHandler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		
		getJspContext().getOut().print("inside Inner Handler");
	}
}