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
 * Servlet implementation class ControlleurUpdateMatiere
 */
@WebServlet("/ControlleurUpdateMatiere")
public class ControlleurUpdateMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurUpdateMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter( "txtId" );
		String nom = request.getParameter( "txtNom" );
		String nb_heures = request.getParameter( "txtNbHeures" );
		if (nom == null) { nom = ""; } 
		if (nb_heures == null) { nb_heures = ""; } 
		
		try {
			DAOMatiere daoMatiere = new DAOMatiere();
			daoMatiere.update(id, nom, nb_heures);
			response.getWriter().println("La matiere a bien ete modifiee");
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
