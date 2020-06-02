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

public class Site {
    private int ID_SITE;
    private String NOM_SITE;
    
    public Site(int ID, String Nom){
        this.ID_SITE = ID;
        this.NOM_SITE = Nom;
    }
    public Site(){};
    
    public int getIdSite() {
        return ID_SITE;
    }

    public void setIdSite(int ID_SITE) {
        this.ID_SITE = ID_SITE;
    }
    
    public String getNomSite() {
        return NOM_SITE;
    }

    public void setNomSite(String NOM_SITE) {
        this.NOM_SITE = NOM_SITE;
    }
}
