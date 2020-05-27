/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author lyazi
 */

import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.ImageIcon; 

import javax.imageio.ImageIO;
    
public   class connexion extends JFrame {
    
    
    JTextField text = new JTextField(10);
     
     public connexion() {
        
         super("Connexion");

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(200, 200, 400, 400);
        setResizable(true);
        setVisible(true);
        
        
        Container conteneur = this.getContentPane();
        conteneur.setLayout(new BorderLayout(8,6));
        conteneur.setBackground(new Color(250, 250, 210));
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK, 3));
        panel.setLayout(new FlowLayout(100));
        panel.setBackground(new Color(250, 250, 210));
        conteneur.add(panel, BorderLayout.CENTER);
        
        
        JButton button = new JButton("se connecter");
        JTextField text = new JTextField(10);
        JPasswordField pass = new JPasswordField(10);
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();
        panel.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
        button.setBounds(largeur/2, hauteur/2, 200, 40);
        text.setBounds(largeur/2, hauteur/2-200, 200, 40);
        pass.setBounds(largeur/2, hauteur/2-100, 200, 40);
        
        JLabel Identifiant = new JLabel("Identifiant");
        JLabel passw = new JLabel("Mot de passe");
       
        
       
        Identifiant.setBounds(largeur/2-100, hauteur/2-200, 200, 60);
        passw.setBounds(largeur/2-100, hauteur/2-100, 200, 60);
        
        
        panel.add(text);
        panel.add(pass);
        panel.add(button);
        panel.add(Identifiant);
        panel.add(passw);
        
       
        
        
        
      
     // panel.setPreferredSize(new Dimension(5, 5));
        
        //add(button);
        
       /* private void JButtonMouseClicked(java.awt.event.MouseEvent evt){
            
        pageemploi p = new pageemploi();
        p.setVisible(true);
        }*/
        //this.getContentPane().add(button, BorderLayout.CENTER);
        
        
         button.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
          pageemploi p = new pageemploi();
          p.setVisible(true);
          String login;
          
        
          login = text.getText();
          String mdp = new String(pass.getPassword());
          
          JLabel msg = new JLabel("Vous êtes  ");
          JLabel Id = new JLabel(login);
          JLabel mp = new JLabel(mdp);
          
          JPanel panele = new JPanel();
          panele.setBorder(new LineBorder(Color.BLACK, 3));
          panele.setBackground(Color.WHITE);
          panele.setLayout(new FlowLayout(5));
          
          panele.add(msg);
          panele.add(Id);
          //panele.add(mp);
          
          p.add(panele, BorderLayout.EAST);
        
        System.out.println(login);
        System.out.println(mdp);
          dispose();
      }
          
         });
        String login;
        String mdp;
        
        login = text.getText();
        mdp = pass.getText();
        
        System.out.println(login);
        System.out.println(pass);
         
         
         }
    /* ImageIcon imgece = new ImageIcon("logo_ece.png");
     
     JLabel ecelogo = new JLabel("");
     
     
     ecelogo.setIcon(imgece);*/
     
     
     /*ImageIcon icone = new ImageIcon("logo_ece.png");
  
    
     JLabel j = new JLabel("");
     logo.setIcon(icone);
     panel.add(j);*/
     
     
     
     
     
     
}


    

