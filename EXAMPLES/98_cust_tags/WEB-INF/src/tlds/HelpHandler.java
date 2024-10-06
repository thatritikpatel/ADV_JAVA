package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;

public class HelpHandler extends SimpleTagSupport{
	private String value;

	public void setValue(String value){
		this.value = value;
	}
	
	public void doTag() throws IOException, JspException{
		JspContext jspContext = getJspContext();

		JspWriter jspWriter = jspContext.getOut();

		jspWriter.write("~~~~ "+value+" ^^^^^");
	}
}