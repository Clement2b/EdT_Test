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
public class Promotion {
    
    private int ID_PROMOTION;
    private String NOM_PROMOTION;
    
    public Promotion(int ID, String PROMO){
        this.ID_PROMOTION = ID;
        this.NOM_PROMOTION = PROMO;
    }
    public Promotion(){}
    
    public int getPromotion() {
        return ID_PROMOTION;
    }

    public void setPromotion(int ID_PROMOTION) {
        this.ID_PROMOTION = ID_PROMOTION;
    }
    
    public String getNomPromotion() {
        return NOM_PROMOTION;
    }

    public void setNomPromotion(String NOM_PROMOTION) {
        this.NOM_PROMOTION = NOM_PROMOTION;
    }
}
