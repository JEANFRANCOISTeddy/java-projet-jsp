

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resultat
 */
@WebServlet("/Resultat")
public class Resultat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resultat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "txtNom" );
        String nb_heures = request.getParameter( "txtNbHeures" );
        
        response.setContentType( "text/html" );
        try ( PrintWriter out = response.getWriter() ) {
            out.println( "<!DOCTYPE html>" );
            out.println( "<html>" );
            out.println( "    <body>" );
            out.println( "        <h1>'" + nom + "'</h1>" );
            out.println( "        <h1>'" + nb_heures + "'</h1>" );
            out.println( "    </body>" );
            out.println( "</html>" );
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
	}

}
