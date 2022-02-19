package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAONote;

/**
 * Servlet implementation class ControlleurViewMoyenne
 */
@WebServlet("/ControlleurViewMoyenne")
public class ControlleurViewMoyenne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurViewMoyenne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_eleve = request.getParameter( "txtIdEleve" );
 	   	System.out.println(id_eleve);
		
		
		if (id_eleve == null) { id_eleve = ""; } 
		
		try {
			DAONote daoNote = new DAONote();
			int moyenne = daoNote.view_moyenne(id_eleve);
			
			response.getWriter().println("Voici votre moyenne : " + moyenne);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
