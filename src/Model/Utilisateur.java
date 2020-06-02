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

public class Utilisateur {
    
    //Liste des attributs 
    
    //ID de l'utilisateur
    private int ID_UTILISATEUR = 0;
    //Email de l'utilisateur
    private String EMAIL_UTILISATEUR = "";
    //Mot de passe de l'utilisateur
    private String PASSWD_UTILISATEUR = "";
    //Nom de l'utilisateur 
    private String NOM_UTILISATEUR = "";
    //Prénoom de l'utilisateur 
    private String PRENOM_UTILISATEUR = "";
    //Droit de l'utilisateur (1 pour un droit d’administrateur, 2 pour un droit de référent pédagogique, 3 pour un droit d’enseignant, 4 pour un droit d’étudiant)
    private int DROIT_UTILISATEUR = 0;
    
    
    //Constructeur pour utilisateur
    public Utilisateur(int ID_UTILISATEUR, String EMAIL_UTILISATEUR, String PASSWD_UTILISATEUR, String NOM_UTILISATEUR, String PRENOM_UTILISATEUR, int DROIT_UTILISATEUR) {
    this.ID_UTILISATEUR = ID_UTILISATEUR;
    this.EMAIL_UTILISATEUR = EMAIL_UTILISATEUR;
    this.PASSWD_UTILISATEUR = PASSWD_UTILISATEUR;
    this.NOM_UTILISATEUR = NOM_UTILISATEUR;
    this.PRENOM_UTILISATEUR = PRENOM_UTILISATEUR;
    this.DROIT_UTILISATEUR = DROIT_UTILISATEUR;
    }
    public Utilisateur(){};
    
    
    //Getters et Setters pour chaque attributs
    public int getIdUtilisateur() {
        return ID_UTILISATEUR;
    }

    public void setIdUtilisateur(int ID_UTILISATEUR) {
        this.ID_UTILISATEUR = ID_UTILISATEUR;
    }
    
     public String getEmailUtilisateur() {
        return EMAIL_UTILISATEUR;
    }

    public void setEmailUtilisateur(String EMAIL_UTILISATEUR) {
        this.EMAIL_UTILISATEUR = EMAIL_UTILISATEUR;
    }
    
     public String getPasswdUtilisateur() {
        return PASSWD_UTILISATEUR;
    }

    public void setPasswdUtilisateur(String PASSWD_UTILISATEUR) {
        this.PASSWD_UTILISATEUR = PASSWD_UTILISATEUR;
    }

    public String getNomUtilisateur() {
        return NOM_UTILISATEUR;
    }

    public void setNomUtilisateur(String NOM_UTILISATEUR) {
        this.NOM_UTILISATEUR = NOM_UTILISATEUR;
    }

    public String getPrenomUtilisateur() {
        return PRENOM_UTILISATEUR;
    }

    public void setPrenomUtilisateur(String PRENOM_UTILISATEUR) {
        this.PRENOM_UTILISATEUR = PRENOM_UTILISATEUR;
    }   
    
    public int getDroitUtilisateur() {
        return DROIT_UTILISATEUR;
    }

    public void setDroitUtilisateur(int DROIT_UTILISATEUR) {
        this.DROIT_UTILISATEUR = DROIT_UTILISATEUR;
    }
}
