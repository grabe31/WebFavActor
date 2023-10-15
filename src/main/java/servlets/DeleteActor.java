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
 * Servlet implementation class DeleteActor
 */
@WebServlet("/DeleteActor")
public class DeleteActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteActor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ActorHelper helper = new ActorHelper();
		String name = request.getParameter("name");
		Actor deleteable = helper.searchActorByName(name);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);	

}

}
