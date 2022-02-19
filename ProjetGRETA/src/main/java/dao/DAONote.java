package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAONote {
	
    private static Connection connection;

    /**
     *
     * Méthode qui permet d'instancier une connexion à notre base de données
     *
     * @throws SQLException
     */
    public DAONote() throws SQLException  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbName= "tp_jdbc";
            String url = "jdbc:mysql://localhost:3306/" +  dbName;
            String username = "teddy";
            String password = "teddy123";
            
            DAONote.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            
        } catch(ClassNotFoundException e) {
        	System.err.println("Driver non chargé !"); e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
    *
    * Méthode qui permet d’ajouter une Note, les paramètres sont les tuples de la table
    *
    * @param nom
    * @param nb_heures
    * @throws SQLException
    */
   public void ajouter(String note, String coefficient, String id_eleve, String id_devoir, String id_matiere) throws SQLException {
       try( Statement statement = connection.createStatement() ) {
           statement.executeUpdate("insert into Note (note, coefficient, id_eleve, id_devoir, id_matiere) values ('"
                           + note + "', '"
                           + coefficient + "', '"
                           + id_eleve + "', '"
                           + id_devoir + "', '"
                           + id_matiere + "')");
       } catch(SQLException e) {
           e.printStackTrace();
       }
   }
   
   public String view_note(String id_devoir) throws SQLException {
	   String note = ""; 
       try( Statement statement = connection.createStatement() ) {
    	   ResultSet rsNote = statement.executeQuery("select * from Note where id_devoir = '" + id_devoir + "'");
           while(rsNote.next()) {
        	   note = rsNote.getString("note");
           }
       } catch(SQLException e) {
           e.printStackTrace();
       }
       
       return note;
   }
   
   public int view_moyenne(String id_eleve) throws SQLException {
	   int moyenne = 0; 
	   int total_coefficient = 0; 
       try( Statement statement = connection.createStatement() ) {
    	   ResultSet rsNote = statement.executeQuery("select * from Note where id_eleve = " + id_eleve);
           while(rsNote.next()) {
        	   String note = rsNote.getString("note");
        	   String coefficient = rsNote.getString("coefficient");
        	   total_coefficient += Integer.parseInt(coefficient);
        	   moyenne += Integer.parseInt(note) * Integer.parseInt(coefficient);
           }
       } catch(SQLException e) {
           e.printStackTrace();
       }
       
       return moyenne / total_coefficient;
   }
   
   public int view_moyenne_prof(String id_matiere) throws SQLException {
	   int moyenne = 0; 
	   int total_coefficient = 0; 
       try( Statement statement = connection.createStatement() ) {
    	   ResultSet rsNote = statement.executeQuery("select * from Note where id_matiere = " + id_matiere);
           while(rsNote.next()) {
        	   String note = rsNote.getString("note");
        	   String coefficient = rsNote.getString("coefficient");
        	   total_coefficient += Integer.parseInt(coefficient);
        	   moyenne += Integer.parseInt(note) * Integer.parseInt(coefficient);
           }
       } catch(SQLException e) {
           e.printStackTrace();
       }
       
       return moyenne / total_coefficient;
   }
}
