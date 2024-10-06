package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;

import java.sql.Date;

public class HelpHandler extends SimpleTagSupport{
	private Double value;
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public void setValue(Double value){
		this.value = value;
	}
	
	public void doTag() throws IOException, JspException{
		JspContext jspContext = getJspContext();

		JspWriter jspWriter = jspContext.getOut();

		jspWriter.write("~~~~ "+value+" ^^^^^");
		jspWriter.write("~~~~ "+name+" ^^^^^");
	}
}