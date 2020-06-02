/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author clement
 */
public class EdT {
    
    //Liste des attributs
    public Utilisateur utilisateur;
    public int semaine;
    public ArrayList<Seance> edt_seances;
    
    //Constructeur
    public EdT(int semaine){
        this.utilisateur = new Utilisateur(); 
        this.semaine = semaine;
        this.edt_seances = new ArrayList<>();
    }
    public EdT(){}
    
    //Getters et setters
    public Utilisateur getUtilisateur(){
        return this.utilisateur;
    }
    
    
    public int getSemaineEdt() {
        return semaine;
    }

    public void setSemaineEdt(int semaine) {
        this.semaine = semaine;
    }
    
    public void SetUtilisateur(String login){
        DAO<Utilisateur> utilisateurDAO = DAOFactory.getUtilisateurDAO();
        this.utilisateur = utilisateurDAO.FindByConnexion(login);
    }
    
    
    public ArrayList<Seance> getEdtSeances() {
        return edt_seances;
    }

    public void setEdtSeances(Utilisateur user) {
        this.utilisateur = user;
        DAO<EdT> EdtDAO = DAOFactory.getEdTDAO();
        this.edt_seances = EdtDAO.FindSeancesByUser(user, this.semaine);
    }
    
    public void addSeance(Seance seance){
        this.edt_seances.add(seance);
    }

    public Seance getSeance(int indice){
        return this.edt_seances.get(indice);
    }
    
    public  Seance findSeanceDateHeure(ArrayList<Seance> edt, String datebox, String Heurebox){
        Seance sc_trouve = new Seance();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat stf = new SimpleDateFormat("hh-mm-ss");
            Date date = sdf.parse(datebox);
            Date heure_debut = stf.parse(Heurebox);
            
            int n = edt.size();
            
            for (int i=0; i<n; i++ ){
                Seance sc = edt.get(i);
                if ((sc.getDateSeance().compareTo(date) == 0) && (sc.getHrDebutSeance().compareTo(heure_debut) == 0)) {
                    sc_trouve = sc;
                }
            }
        }
        catch (ParseException ex) {
                Logger.getLogger(EdT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sc_trouve;
    }
}
