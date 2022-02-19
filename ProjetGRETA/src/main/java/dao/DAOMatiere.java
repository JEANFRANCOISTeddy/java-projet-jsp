package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOMatiere {
	
    private static Connection connection;

    /**
     *
     * Méthode qui permet d'instancier une connexion à notre base de données
     *
     * @throws SQLException
     */
    public DAOMatiere() throws SQLException  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbName= "tp_jdbc";
            String url = "jdbc:mysql://localhost:3306/" +  dbName;
            String username = "teddy";
            String password = "teddy123";
            
            DAOMatiere.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            
        } catch(ClassNotFoundException e) {
        	System.err.println("Driver non chargé !"); e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
    *
    * Méthode qui permet d’ajouter une Matière, les paramètres sont les tuples de la table
    *
    * @param nom
    * @param nb_heures
    * @throws SQLException
    */
   public void ajouter(String nom, String nb_heures) throws SQLException {
       try( Statement statement = connection.createStatement() ) {
           statement.executeUpdate("insert into Matiere (nom, nb_heures) values ('"
                           + nom + "', '"
                           + nb_heures + "')");
       } catch(SQLException e) {
           e.printStackTrace();
       }
   }
   
   /**
   *
   * Méthode qui permet de modifier une Matière, les paramètres sont les tuples de la table
   *
   * @param nom
   * @param nb_heures
   * @throws SQLException
   */
  public void update(String id, String nom, String nb_heures) throws SQLException {
      try( Statement statement = connection.createStatement() ) {
    	  ResultSet rsMatiere = statement.executeQuery("select * from Matiere where id = " + id);
    	  while(rsMatiere.next()) {
			  if(nom == "") { nom = rsMatiere.getString("nom"); }
			  if(nb_heures == "") { nb_heures = rsMatiere.getString("nb_heures"); }
    	  }
		 
		  statement.executeUpdate("update Matiere set nom ='" + nom + "', nb_heures='" + nb_heures + "' where id = " + id);
      } catch(SQLException e) {
          e.printStackTrace();
      }
  }

   /**
   *
   * Méthode qui permet de supprimer des matières, les paramètres sont l’identifiant du tuple.
   *
   * @param id
   * @throws SQLException
   */
  public void supprimer(String id) throws SQLException {
      try( Statement statement = connection.createStatement() ) {
          statement.executeUpdate("delete from Matiere where id = " + id);
      } catch(SQLException e) {
          e.printStackTrace();
      }
  }




}