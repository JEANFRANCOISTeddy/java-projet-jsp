package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAODevoir {
	
    private static Connection connection;

    /**
     *
     * Méthode qui permet d'instancier une connexion à notre base de données
     *
     * @throws SQLException
     */
    public DAODevoir() throws SQLException  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String dbName= "tp_jdbc";
            String url = "jdbc:mysql://localhost:3306/" +  dbName;
            String username = "teddy";
            String password = "teddy123";
            
            DAODevoir.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            
        } catch(ClassNotFoundException e) {
        	System.err.println("Driver non chargé !"); e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
    *
    * Méthode qui permet d’ajouter un Devoir, les paramètres sont les tuples de la table
    *
    * @param nom
    * @param nb_heures
    * @throws SQLException
    */
   public void ajouter(String sujet, String id_classroom) throws SQLException {
       try( Statement statement = connection.createStatement() ) {
           statement.executeUpdate("insert into Devoir (sujet, id_classroom) values ('"
                           + sujet + "', '"
                           + id_classroom + "')");
       } catch(SQLException e) {
           e.printStackTrace();
       }
   }
    
}
