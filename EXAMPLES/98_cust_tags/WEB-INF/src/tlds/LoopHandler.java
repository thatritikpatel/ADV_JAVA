package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;

public class LoopHandler extends SimpleTagSupport{
	public void doTag() throws IOException, JspException{
		String[] x = {"mohan","rohan","sohan","gohjan","tohan"};
		
		JspContext jspContext = getJspContext();
		JspWriter jw = jspContext.getOut();

		JspFragment frag = getJspBody();
		
		jw.write("<ul>");
		for(String tmp : x){
			jspContext.setAttribute("attr",tmp);	
			jw.write("<li>");
			frag.invoke(null);
			jw.write("</li>");
		}
		jw.write("</ul>");
	}
}