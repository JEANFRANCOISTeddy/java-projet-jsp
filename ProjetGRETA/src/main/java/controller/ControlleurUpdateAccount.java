package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOAcces;

/**
 * Servlet implementation class ControlleurUpdateAccount
 */
@WebServlet("/ControlleurUpdateAccount")
public class ControlleurUpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurUpdateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter( "txtId" );
		String prenom = request.getParameter( "txtPrenom" );
		String login = request.getParameter( "txtLogin" );
		String password = request.getParameter( "txtPassword" );
		String statut = request.getParameter( "txtStatut" );
		int age;
		if (prenom == null) { prenom = ""; } 
		if (login == null) { login = ""; } 
		if (password == null) { password = ""; } 
		if (statut == null) { statut = ""; }
		if (request.getParameter("txtAge") == "") { 
			System.out.println("age : " + request.getParameter("txtAge"));
			age = 0; 
		} else { 
			age = Integer.parseInt(request.getParameter("txtAge"));
		}
		
		try {
			DAOAcces daoAcces = new DAOAcces();
			daoAcces.update(id, prenom, login, password, statut, age);
			
			response.getWriter().println("Le compte a bien ete modifie");
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
