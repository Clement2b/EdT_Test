/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author cleme
 */
public class Cours {
    private int ID_COURS;
    private String NOM_COURS;
    
    public Cours(int ID, String PROMO){
        this.ID_COURS = ID;
        this.NOM_COURS = PROMO;
    }
    public Cours(){};
    
    public int getIdCours() {
        return ID_COURS;
    }

    public void setIdCours(int ID_COURS) {
        this.ID_COURS = ID_COURS;
    }
    
    public String getNomCours() {
        return NOM_COURS;
    }

    public void setNomCours(String NOM_COURS) {
        this.NOM_COURS = NOM_COURS;
    }
}
