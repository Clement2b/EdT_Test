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
public class Salle {
    
    private int ID_SALLE;
    private String NOM_SALLE;
    private int CAPACITE;
    private int ID_SITE;
    
    public Salle(int ID_SALLE, String NOM_SALLE, int CAPACITE, int ID_SITE){
        this.ID_SALLE = ID_SALLE;
        this.NOM_SALLE = NOM_SALLE;
        this.CAPACITE = CAPACITE;
        this.ID_SITE = ID_SITE;
    }
    public Salle(){};
    
    public int getIdSalle() {
        return ID_SALLE;
    }

    public void setIdSalle(int ID_SALLE) {
        this.ID_SALLE = ID_SALLE;
    }
    
    public String getNomSalle() {
        return NOM_SALLE;
    }

    public void setNomSalle(String NOM_SALLE) {
        this.NOM_SALLE = NOM_SALLE;
    }
    
    public int getCapacite() {
        return CAPACITE;
    }

    public void setCapacite(int CAPACITE) {
        this.CAPACITE = CAPACITE;
    }
    
    public int getIdSite() {
        return ID_SITE;
    }

    public void setIdSite(int ID_SITE) {
        this.ID_SITE = ID_SITE;
    }
}
