package com.resonantia;
/**
 * This is basic web application
 * This servlet class Takes two values from user and performs addition of that
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i,j,k;
		i=Integer.parseInt(req.getParameter("num1"));		
	    j=Integer.parseInt(req.getParameter("num2")); 
		k=i+j;
		//System.out.println("result is : "+k);
		PrintWriter out=res.getWriter();
		out.println("Addition is : "+k);
	}
}
