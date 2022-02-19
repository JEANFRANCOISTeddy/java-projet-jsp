package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOClassroom;

/**
 * Servlet implementation class ControlleurCreateClassroom
 */
@WebServlet("/ControlleurCreateClassroom")
public class ControlleurCreateClassroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurCreateClassroom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "txtNom" );
		String prof = request.getParameter( "txtProf" );
		String eleves = request.getParameter( "txtEleves" );
		String matiere = request.getParameter( "txtMatiere" );
		String devoir = request.getParameter( "txtDevoir" );
		
		if (nom == null) { nom = ""; } 
		if (prof == null) { prof = ""; } 
		if (eleves == null) { eleves = ""; } 
		if (matiere == null) { matiere = ""; } 
		if (devoir == null) { devoir = ""; } 
		
		try {
			DAOClassroom daoClassroom = new DAOClassroom();
			daoClassroom.ajouter(nom, prof, eleves, matiere, devoir);
			response.getWriter().println("La classe a bien ete creee");
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
