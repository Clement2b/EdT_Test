/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleme
 */
public class CoursDAO extends DAO<Cours>{
    
    
  public CoursDAO(){
    super();
  }
  
  
  @Override
  public Cours create(Cours obj) {
    try{
        int id = obj.getIdCours();
        ResultSet result = this.connect.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM cours WHERE ID ="+id);
        if(result.first()){
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO cours (ID, NOM) VALUES(?, ?)");
            prepare.setInt(1, id);
            prepare.setString(2, obj.getNomCours());
            prepare.executeUpdate();
            obj = this.find(id);	
        }
    } 
    catch (SQLException e) {
    }
    return obj;
  }
  
  
  @Override
  public void delete(Cours obj) {
    try {
        this.connect.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE, 
                 ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM cours WHERE ID = " + obj.getIdCours());   
    }
    catch (SQLException e) {
    }
  }
  
  
  @Override
  public Cours update(Cours obj) {
    try {
        this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, 
            ResultSet.CONCUR_UPDATABLE
         ).executeUpdate(
            "UPDATE cours SET NOM = '" + obj.getNomCours() + "'"+
            " WHERE ID = " + obj.getIdCours());
        obj = this.find(obj.getIdCours());
    } 
    catch (SQLException e) {
    }
    return obj;
  }
   
  
  @Override
  public Cours find(int id) {
    Cours cours = new Cours();      
    try {
      ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM cours WHERE ID = " + id);
      if(result.first())
        cours = new Cours(
          id,
          result.getString("NOM")
          );         
    } catch (SQLException e) {
    }
    return cours;
  }
}

