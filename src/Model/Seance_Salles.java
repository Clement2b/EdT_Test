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

public class Seance_Salles {
    
    private int ID_SEANCE;
    private ArrayList<Integer> Salles = new ArrayList<>();
    
    public Seance_Salles(int ID_SEANCE, ArrayList<Integer> Salles){
        this.ID_SEANCE = ID_SEANCE;
        this.Salles = Salles;
    }
    public Seance_Salles(){};
    
    public int getIdSeance() {
        return ID_SEANCE;
    }

    public void setIdSeance(int ID_SEANCE) {
        this.ID_SEANCE = ID_SEANCE;
    }
    
    public ArrayList<Integer> getGroupesSeance() {
        return Salles;
    }

    public void setSallessSeance(ArrayList<Integer> Salles) {
        this.Salles = Salles;
    }
    
    public void addSalleSeance(int IdSalle){
        this.Salles.add(IdSalle);
    }

    public int getSeanceSalle(int indice){
        return this.Salles.get(indice);
    }
}
