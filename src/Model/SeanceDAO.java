/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clement
 */
public class SeanceDAO extends DAO<Seance>{
  
  public SeanceDAO(){
    super();
  }
  

  
  @Override
  public Seance find(int id) {  
    Seance seance = new Seance(); 
    ArrayList<Integer> Groupes = new ArrayList<>();
    try {
        Statement stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      
        ResultSet resultSeance = stmt.executeQuery("SELECT S.ID, S.SEMAINE, S.DATE, S.HEURE_DEBUT, S.HEURE_FIN, S.ETAT FROM seance S WHERE S.ID = " + id); 
        if(resultSeance.first()){
            seance.setIdSeance(resultSeance.getInt("S.ID"));
            seance.setSemaineSeance(resultSeance.getInt("S.SEMAINE"));
            seance.setDateSeance(resultSeance.getDate("S.DATE"));
            seance.setHrDebutSeance(resultSeance.getTime("S.HEURE_DEBUT"));
            seance.setHrFinSeance(resultSeance.getTime("S.HEURE_FIN"));
            seance.setEtatSeance(resultSeance.getInt("S.ETAT"));
        }
        ResultSet resultCours = stmt.executeQuery("SELECT S.ID_COURS, C.NOM FROM seance S "
                + "                                INNER JOIN cours C ON C.ID = S.ID_COURS"
                + "                                WHERE S.ID = " + id);
        if(resultCours.first()){
            seance.setIdCoursSeance(resultCours.getInt("S.ID_COURS"));
            seance.setNomCoursSeance(resultCours.getString("C.NOM"));
        }
        ResultSet resultTypeCours = stmt.executeQuery("SELECT T.NOM FROM type_cours T INNER JOIN seance S ON S.ID_TYPE = T.ID WHERE S.ID = " + id);
        if(resultTypeCours.first()){
            seance.setTypeCoursSeance(resultTypeCours.getString("T.NOM"));
        }
        ResultSet resultSalle = stmt.executeQuery("SELECT Sl.NOM, Sl.CAPACITE, St.NOM"
                + "                                FROM seance Sc" 
                + "                                INNER JOIN seances_salles Ss ON Ss.ID_SEANCE = Sc.ID" 
                + "                                INNER JOIN salle Sl ON Ss.ID_SALLE = Sl.ID"
                + "                                INNER JOIN site St ON St.ID = Sl.ID_SITE"
                + "                                WHERE Sc.ID = " + id); 
        if(resultSalle.first()){
            seance.setSalleSeance(resultSalle.getString("Sl.NOM"));
            seance.setCapaciteSalleSeance(resultSalle.getInt("Sl.CAPACITE"));
            seance.setSiteSeance(resultSalle.getString("St.NOM"));
        }
        ResultSet resultEnseignant = stmt.executeQuery("SELECT U.NOM"
                + "                                     FROM seance S" 
                + "                                     INNER JOIN seances_enseignants Se ON Se.ID_SEANCE = S.ID" 
                + "                                     INNER JOIN utilisateur U ON Se.ID_ENSEIGNANT = U.ID"
                + "                                     WHERE S.ID = " + id); 
        if(resultEnseignant.first()){
            seance.setIdEnseignantSeance(resultEnseignant.getString("U.NOM"));
        }
        ResultSet resultGroupes = stmt.executeQuery("SELECT G.ID"
                + "                                  FROM seance S" 
                + "                                  INNER JOIN seances_groupes Sg ON Sg.ID_SEANCE = S.ID" 
                + "                                  INNER JOIN groupe G ON Sg.ID_GROUPE = G.ID"
                + "                                  WHERE S.ID = " + id); 
        if(resultGroupes.first()){
            Groupes.add(resultGroupes.getInt("G.ID"));
            
            while(resultGroupes.next()){
                Groupes.add(resultGroupes.getInt("G.ID"));
            }
        }
        seance.setGroupesSeance(Groupes);
    } 
    catch (SQLException e) {
    }
    return seance;
  }

    @Override
    public Seance create(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance update(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance FindByConnexion(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  

}
