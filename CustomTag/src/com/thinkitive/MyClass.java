package com.thinkitive;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyClass extends TagSupport {
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public int doStartTag() throws JspException {
		 JspWriter out = pageContext.getOut();
		 int ans = 1;
		
		 
		 try {
			 for(int i=Integer.parseInt(message);i>0;i--) {
				 ans=ans*i;
			 }
			 out.print("The factorial is " + ans+".");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		 
		 return super.doStartTag();
	}

}
