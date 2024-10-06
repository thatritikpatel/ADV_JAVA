package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import javax.servlet.jsp.tagext.JspFragment;


public class HelpHandler extends SimpleTagSupport{
	public void doTag() throws IOException, JspException{
		JspFragment frag = getJspBody();
		frag.invoke(null);
	}
}