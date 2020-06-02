/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class EnseignantDAO extends DAO<Enseignant>{
        
  public EnseignantDAO(){
    super();
  }
  

   
  @Override
  public Enseignant find(int id) {
    Enseignant enseignant = new Enseignant();      
    try {
      ResultSet resultUtilisateur = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM utilisateur WHERE ID = " + id);
      ResultSet resultEnseignant = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT ID_COURS FROM enseignant WHERE ID_UTILISATEUR = " + id);
      if(resultEnseignant.first()){
            ArrayList<Integer> ID_COURS = new ArrayList<>();
            ID_COURS.add(resultEnseignant.getInt("ID_COURS"));
            while(resultEnseignant.next()){
                ID_COURS.add(resultEnseignant.getInt("ID_COURS"));
            }
            if(resultUtilisateur.first())
              enseignant = new Enseignant(
                id,resultUtilisateur.getString("EMAIL"), resultUtilisateur.getString("PASSWD"), resultUtilisateur.getString("NOM"), resultUtilisateur.getString("PRENOM"), resultUtilisateur.getInt("DROIT"),
                ID_COURS);  
            }
    }
    catch (SQLException e) {
    }
    return enseignant;
  }

    @Override
    public Enseignant create(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enseignant update(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enseignant FindByConnexion(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
