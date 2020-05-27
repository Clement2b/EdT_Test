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

import java.util.ArrayList;


public class Enseignant extends Utilisateur{
    
    //Attributs de Enseignant
    private ArrayList<Integer> ID_COURS = new ArrayList<>();
    
    //Constructeur de Etudiant
    public Enseignant(){
        super();
    }
    public Enseignant(int ID_UTILISATEUR, String EMAIL_UTILISATEUR, String PASSWD_UTILISATEUR, String NOM_UTILISATEUR, String PRENOM_UTILISATEUR, 
            int DROIT_UTILISATEUR, ArrayList<Integer> ID_COURS)
        {
        super(ID_UTILISATEUR, EMAIL_UTILISATEUR, PASSWD_UTILISATEUR, NOM_UTILISATEUR, PRENOM_UTILISATEUR, DROIT_UTILISATEUR);
        this.ID_COURS = ID_COURS;
    }
    
    public ArrayList<Integer> getIdCours() {
        return ID_COURS;
    }

    public void setIdCours(ArrayList<Integer> ID_COURS) {
        this.ID_COURS = ID_COURS;
    }
    
    public void addCoursEnseignant(int IdCours){
        this.ID_COURS.add(IdCours);
    }

    public int getCoursEnseignant(int indice){
        return this.ID_COURS.get(indice);
    }

    @Override
    public String toString(){
        String str =	"*******************************\n";
        str += 			"NOM : " + this.getNomUtilisateur() + "\n";
        str +=			"*******************************\n";
        str +=			"LISTE DES Cours : \n";

        str = this.ID_COURS.stream().map((IdCours) -> IdCours.toString() + "\n").reduce(str, String::concat);

        return str;
    }
}
