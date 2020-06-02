/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;
import static Controler.FindWeek.*;
import Model.EdT;

/**
 *
 * @author cleme
 */
public class Controler {
    
    protected EdT EdTUtilisateur;
    
    public Controler(String login){
        this.EdTUtilisateur = new EdT(FindWeek());
        this.EdTUtilisateur.SetUtilisateur(login);
        this.EdTUtilisateur.setEdtSeances(this.EdTUtilisateur.utilisateur);
    }
    
    
    public Controler(String login, String mdp, int semaine){
        this.EdTUtilisateur = new EdT(semaine);
        this.EdTUtilisateur.SetUtilisateur(login);
        this.EdTUtilisateur.setEdtSeances(this.EdTUtilisateur.utilisateur);
    }

    
    public void SetEdt(EdT EdTUtilisateur){
        this.EdTUtilisateur = EdTUtilisateur;
        
    }
    
    public EdT GetEdt(){
        return this.EdTUtilisateur;
    }
    
    
    
    
}