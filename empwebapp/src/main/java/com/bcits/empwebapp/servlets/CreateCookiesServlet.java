package com.bcits.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie myCookie = new Cookie("enpName", "Sonu");
		myCookie.setMaxAge(7*24*60*60); // making cookie persistent for 7 days in seconds
		resp.addCookie(myCookie);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
      
		out.println("<h1 style='color:green'>Cookie Created Successfully</h1>");

		out.println("</body>");
		out.println("</html>");

		RequestDispatcher dispatcher = req.getRequestDispatcher("./cookiePage.html");
		dispatcher.include(req, resp);

	}// End of doGet()

}// End of class
