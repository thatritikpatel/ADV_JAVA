package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class OuterHandler extends SimpleTagSupport{
	private String degree;

	public void setDegree(String degree){
		this.degree = degree;
	}

	public String getDegree(){
		return degree;
	}

	public void doTag() throws IOException,JspException{
		JspFragment frag = getJspBody();

		frag.invoke(null);
	}
}