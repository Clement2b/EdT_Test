/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleme
 */
public class UtilisateurDAO extends DAO<Utilisateur>{
      
  public UtilisateurDAO(){
    super();
  }
  
  
  @Override
  public Utilisateur create(Utilisateur obj) {
      try{
        int id = obj.getIdUtilisateur();
        ResultSet result = this.conn.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM utilisateur WHERE ID ="+id);
        if(result.first()){
            PreparedStatement prepare = this.conn.prepareStatement("INSERT INTO promotion (ID, NOM) VALUES(?, ?)");
            prepare.setInt(1, id);
            prepare.setString(2, obj.getNomUtilisateur());
            prepare.executeUpdate();
            obj = this.find(id);	
        }
    } 
    catch (SQLException e) {
    }
    return obj;
  }
  
  
  @Override
  public void delete(Utilisateur obj) {
    try {
        this.conn.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE, 
                 ResultSet.CONCUR_UPDATABLE
            ).executeUpdate("DELETE FROM utilisateur WHERE ID = " + obj.getIdUtilisateur());   
    } 
    catch (SQLException e) {
    }
  }
  
  
  @Override
  public Utilisateur update(Utilisateur obj) {
    try {
        this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE, 
            ResultSet.CONCUR_UPDATABLE
         ).executeUpdate(
            "UPDATE utilisateur SET EMAIL = '" + obj.getEmailUtilisateur() + "', PASSWD = '" + obj.getPasswdUtilisateur() + "'"
                    + "                     , NOM = '" + obj.getNomUtilisateur() + "', PRENOM = '" + obj.getPrenomUtilisateur() + "', DROIT = '" + obj.getDroitUtilisateur() + "'"
                    + "                       WHERE ID = '" + obj.getIdUtilisateur() +"'"
        );
        obj = this.find(obj.getIdUtilisateur());
    } 
    catch (SQLException e) {
    }
    return obj;
}
  
   
  
  @Override
  public Utilisateur find(int id) {
    Utilisateur utilisateur = new Utilisateur();      
    try {
      ResultSet result = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM utilisateur WHERE ID = " + id +"");
      if(result.first())
        utilisateur = new Utilisateur(
          id, result.getString("EMAIL"),result.getString("PASSWD"),result.getString("NOM"),result.getString("PRENOM"),result.getInt("DROIT")
          );         
    } catch (SQLException e) {
    }
    return utilisateur;
  }


  @Override
  public Utilisateur FindByConnexion(String login) {
    Utilisateur utilisateur = new Utilisateur();
    try {
        ResultSet result;
        result = this.conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM utilisateur WHERE EMAIL = '"+login+"'");
        if(result.first()){
            utilisateur = new Utilisateur(
            result.getInt("ID"),login,result.getString("PASSWD"),result.getString("NOM"),result.getString("PRENOM"),result.getInt("DROIT")
          );
      }
    } catch (SQLException ex) {
          Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
      }

    return utilisateur;
    } 

    @Override
    public ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

