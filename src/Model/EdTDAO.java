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
public class EdTDAO extends DAO<EdT> {
    
  public EdTDAO(){
    super();
  }
  

  
  @Override
  public EdT find(int semaine) {  
    EdT edt_semaine = new EdT(semaine);            

    return edt_semaine;
  }
  
  
  @Override
  public ArrayList<Seance> FindSeancesByUser(Utilisateur user, int semaine) {
        int id = user.getIdUtilisateur();
        ArrayList<Seance> edt_semaine = new ArrayList<>();
        
        //Cas où l'utilisateur est un étudiant
        if (user.getDroitUtilisateur()==4){
            DAO<Etudiant> eleveDAO = DAOFactory.getEtudiantDAO();
            Etudiant eleve = eleveDAO.find(user.getIdUtilisateur());
            //On effectue la recherche de l'id de chaque séance à laquelle le groupe de l'étudiant assiste dans la semaine donnée
            try{
                ResultSet resultSeancesGroupes = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                                              ResultSet.CONCUR_READ_ONLY
                                                                             ).executeQuery("SELECT S.ID"
                    + "                                                      FROM seance S" 
                    + "                                                      INNER JOIN seances_groupes Sg ON Sg.ID_GROUPE = "+ eleve.getIdGrp()
                    + "                                                      WHERE S.ID = Sg.ID_SEANCE AND S.SEMAINE = "+ semaine);
                
                //On rassemble toutes les informations liées à la séance (voir SeanceDAO.java et Seance.java)
                if (resultSeancesGroupes.first()){
                    DAO<Seance> seanceDAO = DAOFactory.getSeanceDAO();
                    Seance seance = seanceDAO.find(resultSeancesGroupes.getInt("S.ID"));
                    edt_semaine.add(seance);
                    int i = 0;
                    System.out.println(edt_semaine.get(i).getIdCoursSeance()+"\n");
                    
                    while (resultSeancesGroupes.next()){
                        int id_seance = resultSeancesGroupes.getInt("S.ID");
                        seanceDAO = DAOFactory.getSeanceDAO();
                        seance = seanceDAO.find(id_seance);
                        edt_semaine.add(seance);                    
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(SeanceDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Cas où l'utilisateur est un professeur
        if (user.getDroitUtilisateur()==3){
            
            //A revoir (ancienne version) (le droit etudiant marche ci dessus)
            
            DAO<Enseignant> enseignantDAO = DAOFactory.getEnseignantDAO();
            Enseignant prof = enseignantDAO.find(user.getIdUtilisateur());
            
            //On effectue la recherche de l'id de chaque séance à laquelle l'enseignant prend part dans la semaine donnée
            try{
                ResultSet resultSeancesEnseignees = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                                              ResultSet.CONCUR_READ_ONLY
                                                                             ).executeQuery("SELECT S.ID"
                    + "                                                      FROM seance S" 
                    + "                                                      INNER JOIN seances_enseignants Se ON Se.ID_ENSEIGNANT = "+ prof.getIdUtilisateur()
                    + "                                                      WHERE S.ID = Se.ID_SEANCE AND S.SEMAINE = "+ semaine);
                
                //On rassemble toutes les informations liées à la séance (voir SeanceDAO.java et Seance.java)
                if (resultSeancesEnseignees.first()){
                    DAO<Seance> seanceDAO = DAOFactory.getSeanceDAO();
                    Seance seance;
                    seance = seanceDAO.find(resultSeancesEnseignees.getInt("S.ID"));
                    edt_semaine.add(seance);
                    while (resultSeancesEnseignees.next()){
                        seance = seanceDAO.find(resultSeancesEnseignees.getInt("S.ID"));
                        edt_semaine.add(seance);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(SeanceDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    return edt_semaine;
  }

    @Override
    public EdT create(EdT obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EdT obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdT update(EdT obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdT FindByConnexion(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
