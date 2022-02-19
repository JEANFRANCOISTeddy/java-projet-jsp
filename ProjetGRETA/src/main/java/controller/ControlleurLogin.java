package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOAcces;
import model.Acces;

/**
 * Servlet implementation class ControlleurLogin
 */
@WebServlet("/ControlleurLogin")
public class ControlleurLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter( "txtLogin" );
		String password = request.getParameter( "txtPassword" );
		if (login == null) { login = ""; } 
		if (password == null) { password = ""; } 
		
		try {
			DAOAcces daoAcces = new DAOAcces();
			ArrayList<Acces> acces = daoAcces.listerDAO();
			for(int i=0; i<acces.size(); i++) {
				if( acces.get(i).getLogin() != null && acces.get(i).getPassword() != null && acces.get(i).getPrenom() != null && acces.get(i).getStatut() != null) {
					if( acces.get(i).getLogin().equals(login) && acces.get(i).getPassword().equals(password) ) {
						HttpSession session = request.getSession();
						
				        session.setAttribute("id", acces.get(i).getId());
				        session.setAttribute("prenom", acces.get(i).getPrenom());
				        session.setAttribute("statut", acces.get(i).getStatut());
				        
				    	getServletContext().getRequestDispatcher("/Accueil.jsp").
				        include(request,response);
					}
				}
			}
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
