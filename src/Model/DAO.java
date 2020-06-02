package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.ConnectionBDD;

public abstract class DAO<T> {
    
  public ConnectionBDD connect = null;
  public Connection conn = null;
  
  public DAO(){
      try {
          this.connect = new ConnectionBDD("edt");
          this.conn = this.connect.conn;
      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  /**
  * Méthode de création
  * @param obj
  * @return boolean 
  */
  public abstract T create(T obj);

  /**
  * Méthode pour effacer
  * @param obj
  */
  public abstract void delete(T obj);

  /**
  * Méthode de mise à jour
  * @param obj
  * @return boolean
  */
  public abstract T update(T obj);

  /**
  * Méthode de recherche des informations
  * @param id
  * @return T
  */
  public abstract T find(int id);
  
  public abstract T FindByConnexion(String login);
  
  public abstract ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine);

}



