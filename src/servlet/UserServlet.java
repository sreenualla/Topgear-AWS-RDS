package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 7423217796755007454L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String regno = request.getParameter("regno");
		String name = request.getParameter("name");
		String operation = request.getParameter("operation");
		System.out.println("Reg No : " + regno + " Name : " + name + " Operation : " + operation);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
