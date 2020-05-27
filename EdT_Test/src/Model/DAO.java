package Model;

import java.sql.Connection;
import jdbc2020.SdzConnection;

public abstract class DAO<T> {
    
  protected Connection connect = null;
  
  public DAO(){
    this.connect = SdzConnection.getInstance();
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
  * @return boolean 
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
}

