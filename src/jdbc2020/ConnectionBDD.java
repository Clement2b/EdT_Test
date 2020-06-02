package jdbc2020;

import java.sql.*;


public class ConnectionBDD{

  public final Statement stmt;
  private ResultSet rset;
  private ResultSetMetaData rsetMeta;
  /**
  * URL de connection
  */
  public static String url;

  /**
  * Nom du user
  */
  public static String user;

  /**
  * Mot de passe du user
  */
  public static String passwd;

  /**
  * Objet Connection
  */
  public  Connection conn = null;
  
     /**
     * Constructeur avec 3 paramètres : nom, login et password de la BDD locale
     *
     * @param nameDatabase
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public ConnectionBDD(String nameDatabase) throws SQLException, ClassNotFoundException{
        ConnectionBDD.user = "root";
        ConnectionBDD.passwd = "";
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");

        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String urlDatabase = "jdbc:mysql://localhost:3306/" + nameDatabase;
       // String urlDatabase = "jdbc:mysql://localhost:3308/jps?characterEncoding=latin1";

        //création d'une connexion JDBC à la base 
        conn = DriverManager.getConnection(urlDatabase, user, passwd);
        
        // création d'un ordre SQL (statement)
        stmt = conn.createStatement();
    }   
}