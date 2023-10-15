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
 * Servlet implementation class UpdateRole
 */
@WebServlet("/updateRole")
public class UpdateRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRole() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RoleHelper helper = new RoleHelper();

		String oldName = request.getParameter("oldName");
		String charName = request.getParameter("charName");
		String movieName = request.getParameter("movieName");
		String power = request.getParameter("power");

		Role roleToUpdate = helper.searchRoleByName(oldName);
		roleToUpdate.setCharName(charName);
		roleToUpdate.setMovieName(movieName);
		
		helper.update(roleToUpdate);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
