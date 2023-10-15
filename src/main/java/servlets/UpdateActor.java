package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Helpers.ActorHelper;
import model.Actor;



/**
 * Servlet implementation class UpdateActor
 */
@WebServlet("/updateActor")
public class UpdateActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateActor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ActorHelper helper = new ActorHelper();
		
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("newName");
		String birthday = request.getParameter("birthday");
		String academyAwards = request.getParameter("academyAwards");

		Actor actorToUpdate = helper.searchActorByName(oldName);
		actorToUpdate.setName(name);
		actorToUpdate.setBirthday(birthday);
		actorToUpdate.setAcademyAwards(academyAwards);
		helper.update(actorToUpdate);
		
		getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
		
}

}
