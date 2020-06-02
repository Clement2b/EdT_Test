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
public class Etudiant extends Utilisateur {
    
    //Liste des nouveaux attributs
    private int NUMERO_ETUDIANT;
    private int ID_GROUPE;

    
    //Constructeur de Etudiant
    public Etudiant(){
        super();
        this.NUMERO_ETUDIANT = 0;
        this.ID_GROUPE = 0;

    }
    public Etudiant(int ID_UTILISATEUR, String EMAIL_UTILISATEUR, String PASSWD_UTILISATEUR, String NOM_UTILISATEUR, String PRENOM_UTILISATEUR, 
            int DROIT_UTILISATEUR, int NUMERO_ETUDIANT, int ID_GROUPE){
        super(ID_UTILISATEUR, EMAIL_UTILISATEUR, PASSWD_UTILISATEUR, NOM_UTILISATEUR, PRENOM_UTILISATEUR, DROIT_UTILISATEUR);
        this.NUMERO_ETUDIANT = NUMERO_ETUDIANT;
        this.ID_GROUPE = ID_GROUPE;
    }
    
    //Getters et Setters pour chaque attributes
    public int getNumEtudiant() {
        return NUMERO_ETUDIANT;
    }

    public void setNumEtudiant(int NUMERO_ETUDIANT) {
        this.NUMERO_ETUDIANT = NUMERO_ETUDIANT;
    }
    
    public int getIdGrp() {
        return ID_GROUPE;
    }

    public void setIdGrp(int ID_GROUPE) {
        this.ID_GROUPE = ID_GROUPE;
    }
}
