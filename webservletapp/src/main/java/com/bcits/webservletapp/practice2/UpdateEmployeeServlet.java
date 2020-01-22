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

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// validating session
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		if (session != null) {

			String empIdVal = req.getParameter("empId");
			String nameVal = req.getParameter("empName");
			String mobileVal = req.getParameter("empMobileNo");
			String salaryVal = req.getParameter("salary");

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			boolean isUpdated = false;

			try {
				transaction.begin();
				PrimaryEmployeeInfo info = manager.find(PrimaryEmployeeInfo.class, Integer.parseInt(empIdVal));
				info.setEmpName(nameVal);
				info.setEmpMobileNo(Long.parseLong(mobileVal));
				info.setSalary(Double.parseDouble(salaryVal));
				transaction.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			manager.close();
			factory.close();

			out.println("<html>");
			out.println("<body>");
			if (isUpdated) {
				out.println("<h1> Employee with " + empIdVal + " Updated Succesfully</h1>");
			} else {
				out.println("<h1 style='color:red'> Employee with " + empIdVal + " could not be updated</h1>");
			}
			out.println("</body>");
			out.println("</html>");
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
