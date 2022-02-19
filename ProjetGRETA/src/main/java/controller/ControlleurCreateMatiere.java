package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOMatiere;


/**
 * Servlet implementation class ControlleurCreateMatiere
 */
@WebServlet("/ControlleurCreateMatiere")
public class ControlleurCreateMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurCreateMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "txtNom" );
		String nb_heures = request.getParameter( "txtNbHeures" );
		if (nom == null) { nom = ""; } 
		if (nb_heures == null) { nb_heures = ""; } 
		
		try {
			DAOMatiere daoMatiere = new DAOMatiere();
			daoMatiere.ajouter(nom, nb_heures);
			response.getWriter().println("La matiere a bien ete creee");
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
