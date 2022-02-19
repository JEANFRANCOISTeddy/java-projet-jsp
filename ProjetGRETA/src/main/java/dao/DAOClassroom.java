package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Acces;
import model.Devoir;
import model.Matiere;

public class DAOClassroom {
	
    private static Connection connection;

    /**
     *
     * Méthode qui permet d'instancier une connexion à notre base de données
     *
     * @throws SQLException
     */
    public DAOClassroom() throws SQLException  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbName= "tp_jdbc";
            String url = "jdbc:mysql://localhost:3306/" +  dbName;
            String username = "teddy";
            String password = "teddy123";
            
            DAOClassroom.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            
        } catch(ClassNotFoundException e) {
        	System.err.println("Driver non chargé !"); e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
    *
    * Méthode qui permet d’ajouter une classe, les paramètres sont les tuples de la table
    *
    * @param nom
    * @param prof
    * @param eleves
    * @param matiere
    * @param devoir
    * @throws SQLException
    */
   public static void ajouter(String nom, String prof, String eleves, String matiere, String devoir) throws SQLException {
       try( Statement statement = connection.createStatement() ) {
           statement.executeUpdate("insert into Classroom (nom, prof, eleves, matiere, devoir) values ('"
                           + nom + "', '"
                           + prof + "', '"
                           + eleves + "', '"
                           + matiere + "', '"
                           + devoir + "')");
       } catch(SQLException e) {
           e.printStackTrace();
       }
   }
   
   /**
   *
   * Méthode qui permet de modifier une classe, les paramètres sont les tuples de la table
   *
   * @param id
   * @param nom
   * @param prof
   * @param eleves
   * @param matiere
   * @param devoir
   * @throws SQLException
   */
  public void update(String id, String nom, String prof, String eleves, String matiere, String devoir) throws SQLException {
      try( Statement statement = connection.createStatement() ) {
    	  ResultSet rsClassroom = statement.executeQuery("select * from Classroom where id = " + id);
    	  while(rsClassroom.next()) {
			  if(nom == "") { nom = rsClassroom.getString("nom"); }
			  if(prof == "") { prof = rsClassroom.getString("prof"); }
			  if(eleves == "") { eleves = rsClassroom.getString("eleves"); }
			  if(matiere == "") { matiere = rsClassroom.getString("matiere"); }
			  if(devoir == "") { devoir = rsClassroom.getString("devoir"); }
    	  }
    	  
		  statement.executeUpdate("update Classroom set nom ='" 
				  + nom + "', prof='" 
				  + prof + "', eleves='" 
				  + eleves + "', matiere='" 
				  + matiere + "', devoir='" 
				  + devoir + "' where id = " + id);
		  
      } catch(SQLException e) {
          e.printStackTrace();
      }
  }
   
   /**
   *
   * Méthode qui permet de supprimer des classrooms, les paramètres sont l’identifiant du tuple.
   *
   * @param id
   * @throws SQLException
   */
  public void supprimer(String id) throws SQLException {
      try( Statement statement = connection.createStatement() ) {
          statement.executeUpdate("delete from Classroom where id = " + id);
      } catch(SQLException e) {
          e.printStackTrace();
      }
  }

}
