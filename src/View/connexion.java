/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, largeur/2, hauteur/2);
        setResizable(true);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
       /* this.setTitle("titre");
        this.setSize(500,300);
        this.setAlwaysOnTop(true);
         
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
        this.setVisible(true);*/
        
        
        Container conteneur = this.getContentPane();
        conteneur.setLayout(new BorderLayout(8,6));
        conteneur.setBackground(new Color(250, 240, 210));
        
        
     
     
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK, 3));
        panel.setLayout(new FlowLayout(100));
        panel.setBackground(new Color(250, 240, 210));
        conteneur.add(panel, BorderLayout.CENTER);
        
        
        JButton button = new JButton("se connecter");
        JTextField text = new JTextField(10);
        JPasswordField pass = new JPasswordField(10);
        
        panel.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
        button.setBounds(largeur/2, hauteur/3, largeur/10, hauteur/25);
        text.setBounds(largeur/2, hauteur/3-(hauteur/10)*2, largeur/10, hauteur/25);
        pass.setBounds(largeur/2, hauteur/3-hauteur/10, largeur/10, hauteur/25);
        
        JLabel msg = new JLabel("Veuillez vous connectez pour accéder à votre planning");
         
        Font font = new Font("Arial",Font.BOLD,(largeur/100)*2);
        msg.setFont(font);
        JLabel Identifiant = new JLabel("Identifiant");
        JLabel passw = new JLabel("Mot de passe");
       
        
        msg.setBounds(largeur/2-2*(largeur/10), hauteur/3-(hauteur/10)*3, largeur, hauteur/25);
        Identifiant.setBounds(largeur/2-largeur/20, hauteur/3-(hauteur/10)*2, largeur/10, hauteur/25);
        passw.setBounds(largeur/2-largeur/20, hauteur/3-hauteur/10, largeur/10, hauteur/25);
        
        panel.add(msg);
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
         
          String login = text.getText();
          String mdp = new String(pass.getPassword());
          
          pageemploi p = new pageemploi(login);
          p.setVisible(true);
          
          
        
          /*login = text.getText();
          String mdp = new String(pass.getPassword());*/
          
          JLabel msg = new JLabel("Vous êtes  ");
          JLabel Id = new JLabel(login);
          JLabel mp = new JLabel(mdp);
          
          JPanel panele = new JPanel();
          panele.setBorder(new LineBorder(Color.BLACK, 3));
          panele.setBackground(Color.WHITE);
          panele.setLayout(new FlowLayout(5));
          
          panele.add(msg);
          panele.add(Id);
          panele.add(mp);
          
          p.add(panele, BorderLayout.EAST);
        
       // System.out.println(login);
        //System.out.println(mdp);
          dispose();
      }
          
         });
         
           
        ImageIcon imgece = new ImageIcon("logo_ece.png");
     
        JLabel ecelogo = new JLabel(imgece);
     
     
    // ecelogo.setIcon(imgece);
     
        JPanel panels = new JPanel();
        panels.setBorder(new LineBorder(Color.BLACK, 3));
        panels.setLayout(new FlowLayout(100));
        panels.setBackground(new Color(250, 220, 210));
        panels.add(ecelogo);
        conteneur.add(panels, BorderLayout.NORTH);
        
    /**
     *
     * @return
     */
    
     
     
   
        //panels.add(ecelogo);
    


     
     
     
}
     
     /*public String EnvoitLogin(){
        String login;
        
        
        
        login = text.getText();
        //String mdp = new String(pass.getPassword());
        
        return login;
         
         
         }*/
}