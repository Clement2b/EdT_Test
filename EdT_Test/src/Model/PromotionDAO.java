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
public class PromotionDAO extends DAO<Promotion>{
  
  public PromotionDAO(){
    super();
  }
  
  
  @Override
  public Promotion create(Promotion obj) {
      try{
        int id = obj.getPromotion();
        ResultSet result = this.connect.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM promotion WHERE ID ="+id);
        if(result.first()){
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO promotion (ID, NOM) VALUES(?, ?)");
            prepare.setInt(1, id);
            prepare.setString(2, obj.getNomPromotion());
            prepare.executeUpdate();
            obj = this.find(id);	
        }
    } 
    catch (SQLException e) {
    }
    return obj;
  }
  
  
  @Override
  public void delete(Promotion obj) {
    try {
        this.connect.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE, 
                 ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM promotion WHERE ID = " + obj.getPromotion());   
    } 
    catch (SQLException e) {
    }
  }
  
  
  @Override
  public Promotion update(Promotion obj) {
    try {
        this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, 
            ResultSet.CONCUR_UPDATABLE
         ).executeUpdate(
            "UPDATE promotion SET NOM = '" + obj.getNomPromotion() + "'"+
            " WHERE ID = " + obj.getPromotion()
         );
        obj = this.find(obj.getPromotion());
    } 
    catch (SQLException e) {
    }
    return obj;
}
  
   
  @Override
  public Promotion find(int id) {
    Promotion promo = new Promotion();      
    try {
      ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM promotion WHERE ID = " + id);
      if(result.first())
        promo = new Promotion(
          id,
          result.getString("NOM")
          );         
    } catch (SQLException e) {
    }
    return promo;
  }
}

