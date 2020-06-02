/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class Seance_Enseignants {
    
    private int ID_SEANCE;
    private ArrayList<Integer> Enseignants = new ArrayList<>();
    
    public Seance_Enseignants(int ID_SEANCE, ArrayList<Integer> Enseignants){
        this.ID_SEANCE = ID_SEANCE;
        this.Enseignants = Enseignants;
    }
    public Seance_Enseignants(){};
    
    public int getIdSeance() {
        return ID_SEANCE;
    }

    public void setIdSeance(int ID_SEANCE) {
        this.ID_SEANCE = ID_SEANCE;
    }
    
    
    public ArrayList<Integer> getEnseignantsSeance() {
        return Enseignants;
    }

    public void setEnseignantsSeance(ArrayList<Integer> Enseignants) {
        this.Enseignants = Enseignants;
    }
    
    public void addEnseignantsSeance(int IdEnseignants){
        this.Enseignants.add(IdEnseignants);
    }

    public int getSeanceEnseignants(int indice){
        return this.Enseignants.get(indice);
    }
}
