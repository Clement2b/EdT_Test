/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleme
 */
public class EtudiantDAO extends DAO<Etudiant>{
    
  public EtudiantDAO(){
    super();
  }
  
  @Override
  public boolean create(Etudiant obj) {
    return false;
  }
  
  @Override
  public boolean delete(Etudiant obj) {
    return false;
  }
  
  @Override
  public boolean update(Etudiant obj) {
    return false;
  }
   
  @Override
  public Etudiant find(int id) {
    Etudiant etudiant = new Etudiant();      
    try {
      ResultSet resultUtilisateur = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM utilisateur WHERE ID = " + id);
      ResultSet resultEtudiant = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM etudiant WHERE ID_UTILISATEUR = " + id);
      if(resultEtudiant.first()){
          etudiant = new Etudiant(
            id,resultUtilisateur.getString("EMAIL"), resultUtilisateur.getString("PASSWD"), resultUtilisateur.getString("NOM"), resultUtilisateur.getString("PRENOM"), resultUtilisateur.getInt("DROIT"),
            resultEtudiant.getInt("NUMERO"),resultEtudiant.getInt("ID_GROUPE"));  
      }
    }
    catch (SQLException e) {
    }
    return etudiant;
  }
}
