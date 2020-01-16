package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/myGenericServlet")
public class MyGenericServlet  extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//Get the query string
		
		String eNameVal = req.getParameter("eName");
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1 style='color:navy'>Hello Welcome to MyGeneric Class </h1>");
		out.println("<h1>Employee Name "+ eNameVal +"</h1>");
				
		out.println("</body>");
		out.println("</html>");
				
	}

}
