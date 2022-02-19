package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOAcces;

/**
 * Servlet implementation class ControlleurChangePassword
 */
@WebServlet("/ControlleurChangePassword")
public class ControlleurChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter( "txtPassword" );
		HttpSession session = request.getSession();
		String id = session.getAttribute("id").toString();
		if (password == null) { password = ""; } 
		if (id == null) { id = ""; } 
		
		try {
			DAOAcces daoAcces = new DAOAcces();
			daoAcces.changePassword(id, password);
			response.getWriter().println("Le mot de passe a bien ete modifie");
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
