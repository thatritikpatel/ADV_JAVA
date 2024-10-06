package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class OuterHandler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		getJspContext().getOut().print("inside Outer Handler");
	}
}