/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author cleme
 */
public class Test {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Controler controleur;
        controleur = new Controler("elevetest", "motdepasse", 9);
        System.out.println(controleur.EdTUtilisateur.utilisateur.getNomUtilisateur()+"\n");
                
        int n = controleur.EdTUtilisateur.edt_seances.size();
        for (int i = 0; i<n; i++){
            System.out.println(controleur.EdTUtilisateur.edt_seances.get(i).getIdSeance()+"\n");
        }   
    }
}
