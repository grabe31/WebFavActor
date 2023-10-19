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
 * Servlet implementation class AddActor
 */
@WebServlet("/addActor")
public class AddActor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddActor() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Actor t = new Actor();
		ActorHelper helper = new ActorHelper();
		t.setName(request.getParameter("name"));
		t.setBirthday(request.getParameter("birthday"));
		t.setAcademyAwards(request.getParameter("academyAwards"));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
	}

}
