/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author clement
 */
public class EdT {
    
    //Liste des attributs
    private int semaine;
    private ArrayList<Seance> edt_seances = new ArrayList<>();
    
    //Constructeur
    public EdT(int semaine){
        this.semaine = semaine;
        
    }
    
    //Getters et setters
    public int getSemaineEdt() {
        return semaine;
    }

    public void setSemaineEdt(int semaine) {
        this.semaine = semaine;
    }
    
    public ArrayList<Seance> getEdtSeances() {
        return edt_seances;
    }

    public void setEdtSeances(ArrayList<Seance> edt_seances) {
        this.edt_seances = edt_seances;
    }
    
    public void addSeance(Seance seance){
        this.edt_seances.add(seance);
    }

    public Seance getSeance(int indice){
        return this.edt_seances.get(indice);
    }
}
