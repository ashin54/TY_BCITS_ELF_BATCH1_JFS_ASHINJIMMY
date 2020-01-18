package com.bcits.webservletapp.practice2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bcits.webservletapp.bean.PrimaryEmployeeInfo;

@WebServlet("/getEmployee")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// validating session

		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (session != null) {
			// valid session
			// get the form data

			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("emsPersistenceUnit");
			EntityManager manager = emf.createEntityManager();

			PrimaryEmployeeInfo employeePrimaryInfo = manager.find(PrimaryEmployeeInfo.class, empId);

			if (employeePrimaryInfo != null) {
				
				PrimaryEmployeeInfo loggInEmpInfo =  (PrimaryEmployeeInfo) session.getAttribute("empInfo");

				out.println("<html>");
				out.println("<body>");

				out.println("<h1> Hello " + loggInEmpInfo.getEmpName() + " !!</h1>");
				out.println("<a href='./employeeHome.html'>HOME</a><br>");

				out.println("<h1 style='color: green'> Employee ID " + empId + " Found -</h1>");
				out.println("Name = " + employeePrimaryInfo.getEmpName());
				out.println("<br> Designation = " + employeePrimaryInfo.getDesignation());
				out.println("<br> Salary = " + employeePrimaryInfo.getSalary());
				out.println("<br> Mobile Number = " + employeePrimaryInfo.getEmpMobileNo());
				out.println("<br> Date of Join = "+ employeePrimaryInfo.getDoj());
				out.print("<br>Employee ID = "+ employeePrimaryInfo.getEmpId());
				out.print("<br> Manager Id = "+ employeePrimaryInfo.getManagerId());
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<html>");
				out.println("<body>");
				out.println("<h1 style='color:red'>Employee ID " + empId + " Not Found!!!</h1>");
				out.println("</body>");
				out.println("</html>");
			}

			manager.close();
			emf.close();
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 style='color:red'>Please Login First!!!</h1>");
			out.println("</body>");
			out.println("</html>");

			req.getRequestDispatcher("./loginForm.html").include(req, resp);
		}

	}// End of doGet()

}// End of Class
