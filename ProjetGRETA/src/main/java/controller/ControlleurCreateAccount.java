package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOAcces;
import model.Acces;

/**
 * Servlet implementation class ControlleurCreateAccount
 */
@WebServlet("/ControlleurCreateAccount")
public class ControlleurCreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurCreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter( "txtPrenom" );
		String login = request.getParameter( "txtLogin" );
		String password = request.getParameter( "txtPassword" );
		String statut = request.getParameter( "txtStatut" );
		int age = Integer.parseInt(request.getParameter("txtAge"));
		if (prenom == null) { prenom = ""; } 
		if (login == null) { login = ""; } 
		if (password == null) { password = ""; } 
		if (statut == null) { statut = ""; } 
		
		try {
			DAOAcces daoAcces = new DAOAcces();
			daoAcces.ajouter(prenom, login, password, statut, age);
			
			response.getWriter().println("Le compte a bien ete cree");
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
