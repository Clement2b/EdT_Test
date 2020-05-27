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
 * @author clement
 */
public class SeanceDAO extends DAO<Seance>{
  
  public SeanceDAO(){
    super();
  }
  
  @Override
  public boolean create(Seance obj) {
    return false;
  }

  @Override
  public boolean delete(Seance obj) {
    return false;
  }
   
  @Override
  public boolean update(Seance obj) {
    return false;
  }
  
  @Override
  public Seance find(int id) {  
    Seance seance = new Seance();            
    try {
        
        ResultSet resultSeance = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM seance WHERE ID = " + id); 
        ResultSet resultCours = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT S.ID_COURS FROM seance S JOIN cours C WHERE S.ID = " + id);
        ResultSet resultTypeCours = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT T.NOM FROM type_cours T JOIN seance S ON S.ID_TYPE = T_ID WHERE S.ID = " + id); 
        ResultSet resultSalle = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT Sl.NOM, Sl.CAPACITE, St.NOM"
                + "                                                                                                                            FROM seance Sc" 
                + "                                                                                                                             INNER JOIN seances_salles Ss ON Ss.ID_SEANCE = Sc.ID" 
                + "                                                                                                                             INNER JOIN salle Sl ON Ss.ID_SALLE = Sl.ID"
                + "                                                                                                                             INNER JOIN site St ON St.ID = Sl.ID_SITE"
                + "                                                                                                                             WHERE Sc.ID = " + id); 
        ResultSet resultEnseignant = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT U.NOM"
                + "                                                                                                                            FROM seance S" 
                + "                                                                                                                             INNER JOIN seances_enseigants Se ON Se.ID_SEANCE = S.ID" 
                + "                                                                                                                             INNER JOIN utilisateur U ON Se.ID_ENSEIGNANT = U.ID"
                + "                                                                                                                             WHERE S.ID = " + id); 
        ResultSet resultGroupes = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT G.ID"
                + "                                                                                                                            FROM seance S" 
                + "                                                                                                                             INNER JOIN seances_groupes Sg ON Sg.ID_SEANCE = S.ID" 
                + "                                                                                                                             INNER JOIN groupe G ON Sg.ID_GROUPE = G.ID"
                + "                                                                                                                             WHERE S.ID = " + id); 
        if(resultGroupes.first()){
            ArrayList<Integer> Groupes = new ArrayList<>();
            Groupes.add(resultGroupes.getInt("G.ID"));
            while(resultGroupes.next()){
                Groupes.add(resultGroupes.getInt("G.ID"));
            }
            if(resultSeance.first() && resultCours.first() && resultTypeCours.first() && resultSalle.first() && resultEnseignant.first()){
                seance = new Seance(id, resultSeance.getInt("SEMAINE"), resultSeance.getDate("DATE"), resultSeance.getTime("HEURE_DEBUT"), resultSeance.getTime("HEURE_FIN"), resultSeance.getInt("ETAT"), 
                                    resultCours.getInt("S.ID_COURS"), 
                                    resultTypeCours.getString("T.NOM"), 
                                    resultSalle.getString("Sl.NOM"), resultSalle.getInt("Sl.CAPACITE"), resultSalle.getString("St.NOM"), 
                                    resultEnseignant.getString("U.NOM"),
                                    Groupes);
            }
        }
    } 
    catch (SQLException e) {
    }
    return seance;
  }
}
