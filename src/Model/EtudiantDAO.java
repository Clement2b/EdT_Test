/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleme
 */
public class EtudiantDAO extends DAO<Etudiant>{
    
  public EtudiantDAO(){
    super();
  }

  /**
     * @return 
  @Override
  public Etudiant find(int id) {
    Etudiant etudiant = new Etudiant();      
    try {
      ResultSet resultUtilisateur = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM utilisateur WHERE ID = " + id);
      ResultSet resultEtudiant = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM etudiant WHERE ID_UTILISATEUR = " + id);
      if(resultEtudiant.first()){
          etudiant = new Etudiant(
            id,resultUtilisateur.getString("EMAIL"), resultUtilisateur.getString("PASSWD"), resultUtilisateur.getString("NOM"), resultUtilisateur.getString("PRENOM"), resultUtilisateur.getInt("DROIT"),
            resultEtudiant.getInt("NUMERO"),resultEtudiant.getInt("ID_GROUPE"));  
      }
    }
    catch (SQLException e) {
        Logger.getLogger(EtudiantDAO.class.getName()).log(Level.SEVERE, null, e);
    }
    return etudiant;
  }
  **/
  
  @Override
    public Etudiant find(int id) {
    Etudiant etudiant = new Etudiant();      
    try {
       DAO<Utilisateur> utilisateurDAO = DAOFactory.getUtilisateurDAO();
       Utilisateur user = utilisateurDAO.find(id);
       ResultSet resultEtudiant = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM etudiant WHERE ID_UTILISATEUR = " + id);
      if(resultEtudiant.first()){
          etudiant = new Etudiant(
            id,user.getEmailUtilisateur(), user.getPasswdUtilisateur(), user.getNomUtilisateur(), user.getPrenomUtilisateur(), user.getDroitUtilisateur(),
            resultEtudiant.getInt("NUMERO"),resultEtudiant.getInt("ID_GROUPE"));  
      }
    }
    catch (SQLException e) {
        Logger.getLogger(EtudiantDAO.class.getName()).log(Level.SEVERE, null, e);
    }
    return etudiant;
  }
  

    @Override
    public Etudiant create(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant update(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant FindByConnexion(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
