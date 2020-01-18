package com.bcits.webservletapp.practice2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.webservletapp.bean.PrimaryEmployeeInfo;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// validating session
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		if (session != null) {

			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			resp.setContentType("text/html");

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();

			PrimaryEmployeeInfo info = manager.find(PrimaryEmployeeInfo.class, empId);

			if (info != null) {
				try {
					transaction.begin();
					manager.remove(info);
					transaction.commit();
					out.println("<html>");
					out.println("<body>");
					out.println("<h1 style='color:blue'> Employee ID " + empId + " Deleted<h1>");
					out.println("</body>");
					out.println("</html>");
				} catch (Exception e) {

					transaction.rollback();
				
				}

			} else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h1 style='color:red'> Employee ID " + empId + " Not Found<h1>");
				out.println("</body>");
				out.println("</html>");
			}

			manager.close();
			factory.close();
		} else {
			// Inactive session
			// back to login page
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'> Please Login First</h1>");
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./loginForm.html").include(req, resp);
		}
	}
}
