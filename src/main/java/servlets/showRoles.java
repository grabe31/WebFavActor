package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Helpers.RoleHelper;
import model.Role;



/**
 * Servlet implementation class showRoles
 */
@WebServlet("/showRoles")
public class showRoles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showRoles() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RoleHelper helper = new RoleHelper();

		List<Role> roleList = helper.showAllRoles();

		request.setAttribute("allRoles", roleList);

		String path = "/showRoles.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}



}
