package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.SkipPageException;

public class HelpHandler extends SimpleTagSupport{	
	public void doTag() throws IOException, JspException{
		JspContext jspContext = getJspContext();

		JspWriter jspWriter = jspContext.getOut();

		jspWriter.write("~~~~  ~~~~");

		throw new SkipPageException();

		//jspWriter.write("####  ####");
	}
}