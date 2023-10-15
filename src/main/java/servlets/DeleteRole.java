package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Helpers.RoleHelper;
import model.Role;

/**
 * Servlet implementation class DeleteRole
 */
@WebServlet("/deleteRole")
public class DeleteRole extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RoleHelper helper = new RoleHelper();
		String name = request.getParameter("charName");
		Role deleteable = helper.searchRoleByName(name);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}