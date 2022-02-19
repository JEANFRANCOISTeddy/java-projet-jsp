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
 * Servlet implementation class ControlleurCreateNote
 */
@WebServlet("/ControlleurCreateNote")
public class ControlleurCreateNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurCreateNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String note = request.getParameter( "txtNote" );
		String coefficient = request.getParameter( "txtCoefficient" );
		String id_eleve = request.getParameter( "txtIdEleve" );
		String id_devoir = request.getParameter( "txtIdDevoir" );
		String id_matiere = request.getParameter( "txtIdMatiere" );
		
		if (note == null) { note = ""; } 
		if (coefficient == null) { coefficient = ""; } 
		if (id_eleve == null) { id_eleve = ""; } 
		if (id_devoir == null) { id_devoir = ""; } 
		if (id_matiere == null) { id_matiere = ""; } 
		
		try {
			DAONote daoNote = new DAONote();
			daoNote.ajouter(note, coefficient, id_eleve, id_devoir, id_matiere);
			response.getWriter().println("La note a bien ete cree");
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
