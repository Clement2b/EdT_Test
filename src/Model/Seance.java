/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author clement
 */

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Seance {
    
    //Listes des attributs
    private int ID_SEANCE;
    private int SEMAINE;
    private Date DATE;
    private Time HEURE_DEBUT;
    private Time HEURE_FIN;
    private int ETAT;
    
    private String NOM_COURS;
    private String TYPE_COURS;
    
    private String SALLE;
    private int ID_COURS;
    private int CAPACITE_SALLE;
    private String SITE;
    
    private String NOM_ENSEIGNANT;
    private ArrayList<Integer> Groupes = new ArrayList<>();
    
    
    //Constructeur de Seance
    public Seance(int ID_SEANCE, int SEMAINE, Date DATE, Time HEURE_DEBUT, Time HEURE_FIN, int ETAT, String NOM_COURS, int ID_COURS,
                    String TYPE_COURS, String SALLE, int CAPACITE_SALLE, String SITE, String NOM_ENSEIGNANT, ArrayList<Integer> Groupes) {
    this.ID_SEANCE = ID_SEANCE;
    this.SEMAINE = SEMAINE;
    this.DATE = DATE;
    this.HEURE_DEBUT = HEURE_DEBUT;
    this.HEURE_FIN = HEURE_FIN;
    this.ETAT = ETAT;
    this.NOM_COURS = NOM_COURS;
    this.ID_COURS = ID_COURS;
    this.TYPE_COURS = TYPE_COURS;
    this.SALLE = SALLE;
    this.CAPACITE_SALLE = CAPACITE_SALLE;
    this.SITE = SITE;
    this.NOM_ENSEIGNANT = NOM_ENSEIGNANT;
    this.Groupes = Groupes;
    }
    public Seance(){};
    
    //Getters et Setters pour chaque attributs
    public int getIdSeance() {
        return ID_SEANCE;
    }

    public void setIdSeance(int ID_SEANCE) {
        this.ID_SEANCE = ID_SEANCE;
    }
    
    public int getSemaineSeance() {
        return SEMAINE;
    }

    public void setSemaineSeance(int SEMAINE) {
        this.SEMAINE = SEMAINE;
    }
    
    public Date getDateSeance() {
        return DATE;
    }

    public void setDateSeance(Date DATE) {
        this.DATE = DATE;
    }
    
    public Time getHrDebutSeance() {
        return HEURE_DEBUT;
    }

    public void setHrDebutSeance(Time HEURE_DEBUT) {
        this.HEURE_DEBUT = HEURE_DEBUT;
    }
    
    public Time getHrFinSeance() {
        return HEURE_FIN;
    }

    public void setHrFinSeance(Time HEURE_FIN) {
        this.HEURE_FIN = HEURE_FIN;
    }
    
    public int getEtatSeance() {
        return ETAT;
    }

    public void setEtatSeance(int ETAT) {
        this.ETAT = ETAT;
    }
    
    public String getNomCoursSeance() {
        return NOM_COURS;
    }

    public void setNomCoursSeance(String NOM_COURS) {
        this.NOM_COURS = NOM_COURS;
    }
    
     public int getIdCoursSeance() {
        return ID_COURS;
    }

    public void setIdCoursSeance(int ID_COURS) {
        this.ID_COURS = ID_COURS;
    }
    
    public String getTypeCoursSeance() {
        return TYPE_COURS;
    }

    public void setTypeCoursSeance(String TYPE_COURS) {
        this.TYPE_COURS = TYPE_COURS;
    }
    
    public String getSalleSeance() {
        return SALLE;
    }

    public void setSalleSeance(String SALLE) {
        this.SALLE = SALLE;
    }
    
    public int getCapaciteSalleSeance() {
        return CAPACITE_SALLE;
    }

    public void setCapaciteSalleSeance(int CAPACITE_SALLE) {
        this.CAPACITE_SALLE = CAPACITE_SALLE;
    }
    
    public String getSiteSeance() {
        return SITE;
    }

    public void setSiteSeance(String SITE) {
        this.SITE = SITE;
    }
    
    public String getIdEnseignantSeance() {
        return NOM_ENSEIGNANT;
    }

    public void setIdEnseignantSeance(String NOM_ENSEIGNANT) {
        this.NOM_ENSEIGNANT = NOM_ENSEIGNANT;
    }
    
    public ArrayList<Integer> getGroupesSeance() {
        return Groupes;
    }

    public void setGroupesSeance(ArrayList<Integer> Groupes) {
        this.Groupes = Groupes;
    }
    
    public void addCoursEnseignant(int IdGroupe){
        this.Groupes.add(IdGroupe);
    }

    public int getCoursEnseignant(int indice){
        return this.Groupes.get(indice);
    }
}
