package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			session.invalidate();
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color:red'>Successfully Loggedout</h2>");
			out.println("</body>");
			out.println("</html>");
			
		}
		req.getRequestDispatcher("./loginForm.html").include(req, resp);
	}//End of doGet()
	
}