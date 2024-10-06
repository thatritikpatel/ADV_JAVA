package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.JspException;
import java.io.IOException;


public class InnerHandler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		//Case 2:
		JspTag outerOuter = findAncestorWithClass(this,OuterOuterHandler.class);
		OuterOuterHandler parentParent = (OuterOuterHandler)outerOuter;

		//Case 1:
		//JspTag parent = getParent();		
		//OuterHandler outer = (OuterHandler)parent;
		//JspTag parentParent = outer.getParent();
		
		getJspContext().getOut().print(parentParent);
	}
}