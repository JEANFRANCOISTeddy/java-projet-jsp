package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAODevoir;

/**
 * Servlet implementation class ControlleurCreateDevoir
 */
@WebServlet("/ControlleurCreateDevoir")
public class ControlleurCreateDevoir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurCreateDevoir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sujet = request.getParameter( "txtSujet" );
		String id_classroom = request.getParameter( "txtIdClassroom" );
		
		if (sujet == null) { sujet = ""; } 
		if (id_classroom == null) { id_classroom = ""; } 
		
		try {
			DAODevoir daoDevoir = new DAODevoir();
			daoDevoir.ajouter(sujet, id_classroom);
			response.getWriter().println("Le devoir a bien ete cree");
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
