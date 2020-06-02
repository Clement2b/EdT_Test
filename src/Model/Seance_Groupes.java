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
public class Seance_Groupes {
    
    private int ID_SEANCE;
    private ArrayList<Integer> Groupes = new ArrayList<>();
    
    public Seance_Groupes(int ID_SEANCE, ArrayList<Integer> Groupes){
        this.ID_SEANCE = ID_SEANCE;
        this.Groupes = Groupes;
    }
    public Seance_Groupes(){};
    
    public int getIdSeance() {
        return ID_SEANCE;
    }

    public void setIdSeance(int ID_SEANCE) {
        this.ID_SEANCE = ID_SEANCE;
    }
    
    public ArrayList<Integer> getGroupesSeance() {
        return Groupes;
    }

    public void setGroupesSeance(ArrayList<Integer> Groupes) {
        this.Groupes = Groupes;
    }
    
    public void addGroupeSeance(int IdGroupe){
        this.Groupes.add(IdGroupe);
    }

    public int getSeanceGroupe(int indice){
        return this.Groupes.get(indice);
    }
}
