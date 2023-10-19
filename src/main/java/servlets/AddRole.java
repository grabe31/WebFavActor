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
 * Servlet implementation class AddRole
 */
@WebServlet("/addRole")
public class AddRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRole() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			// TODO Auto-generated method stub
		//doGet(request, response);
		Role h = new Role();
		RoleHelper helper = new RoleHelper();
		h.getActor().setName(request.getParameter("actor"));
		h.setCharName(request.getParameter("charName"));
		h.setMovieName(request.getParameter("movieName"));
		helper.persist(h);
		getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
	}

}
