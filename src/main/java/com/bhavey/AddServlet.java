package com.bhavey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException//belongs to service lifecycle
	{
		//req object will have your data 
		int i = Integer.parseInt(req.getParameter("num1"));
		// get parameter will give you a string 
		// we are expecting a integer 
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("result is "+k);
	}
}
