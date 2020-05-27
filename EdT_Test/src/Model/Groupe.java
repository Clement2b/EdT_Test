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
public class Groupe {
    
    private int ID_GROUPE;
    private String NOM_GROUPE;
    private int ID_PROMOTION;
    
    public Groupe(int ID_GROUPE, String NOM_GROUPE, int ID_PROMOTION){
        this.ID_GROUPE = ID_GROUPE;
        this.NOM_GROUPE = NOM_GROUPE;
        this.ID_PROMOTION = ID_PROMOTION;
    }
    public Groupe(){};
    
    public int getGroupe() {
        return ID_GROUPE;
    }

    public void setGroupe(int ID_GROUPE) {
        this.ID_GROUPE = ID_GROUPE;
    }
    
    public String getNomGroupe() {
        return NOM_GROUPE;
    }

    public void setNomGroupe(String NOM_GROUPE) {
        this.NOM_GROUPE = NOM_GROUPE;
    }
    
    public int getPromotion() {
        return ID_PROMOTION;
    }

    public void setPromotion(int ID_PROMOTION) {
        this.ID_PROMOTION = ID_PROMOTION;
    }
    
}
