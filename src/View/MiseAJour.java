/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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

/**
 *
 * @author lyazi
 */
public class MiseAJour extends JFrame {
    public MiseAJour(String login) {
        
         super("Mise à jour des séances");
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, largeur, hauteur);
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
        
        
        JButton button = new JButton("Supprimer");
        JTextField cours = new JTextField(10);
        JTextField jour = new JTextField(10);
        JTextField heured = new JTextField(10);
        JTextField heuref = new JTextField(10);
        JTextField prof = new JTextField(10);
        JTextField groupe = new JTextField(10);
        
        panel.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
        button.setBounds(largeur/2+largeur/10, hauteur-(hauteur/10)*4, largeur/10, hauteur/25);
        cours.setBounds(largeur/2, hauteur-(hauteur/10)*9, largeur/10, hauteur/25);
        jour.setBounds(largeur/2, hauteur-(hauteur/10)*8, largeur/10, hauteur/25);
        heured.setBounds(largeur/2, hauteur-(hauteur/10)*7, largeur/10, hauteur/25);
        heuref.setBounds(largeur/2, hauteur-(hauteur/10)*6, largeur/10, hauteur/25);
        prof.setBounds(largeur/2, hauteur-(hauteur/10)*5, largeur/10, hauteur/25);
        groupe.setBounds(largeur/2, hauteur-(hauteur/10)*4, largeur/10, hauteur/25);
        
        
        JLabel msg = new JLabel("Veuillez entrez les coordonnées de la séance que vous voulez effacer");
         
        Font font = new Font("Arial",Font.BOLD,(largeur/100)*2);
        msg.setFont(font);
        JLabel c = new JLabel("Nom du cours");
        JLabel j = new JLabel("Le jour");
        JLabel hd = new JLabel("Heure de début");
        JLabel hf = new JLabel("Heure de fin");
        JLabel p = new JLabel("Professeur");
        JLabel g = new JLabel("Groupe");
        
       msg.setBounds(largeur/2-2*(largeur/7), hauteur-(hauteur/10)*10, largeur, hauteur/25);
        c.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*9, largeur/10, hauteur/25);
        j.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*8, largeur/10, hauteur/25);
        hd.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*7, largeur/10, hauteur/25);
        hf.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*6, largeur/10, hauteur/25);
        p.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*5, largeur/10, hauteur/25);
        g.setBounds(largeur/2-(largeur/20), hauteur-(hauteur/10)*4, largeur/10, hauteur/25);
        
        
        panel.add(msg);
        panel.add(cours);
        panel.add(jour);
        panel.add(heured);
        panel.add(heuref);
        panel.add(prof);
        panel.add(groupe);
        panel.add(c);
        panel.add(j);
        panel.add(hd);
        panel.add(hf);
        panel.add(p);
        panel.add(g);
        panel.add(button);
        
       
        
        
        
      
     // panel.setPreferredSize(new Dimension(5, 5));
        
        //add(button);
        
       /* private void JButtonMouseClicked(java.awt.event.MouseEvent evt){
            
        pageemploi p = new pageemploi();
        p.setVisible(true);
        }*/
        //this.getContentPane().add(button, BorderLayout.CENTER);
        
      
        
        
        
        // button.addActionListener(new ActionListener() {
     
      
     /* public void actionPerformed(ActionEvent event) {
         
          String login = text.getText();
          String mdp = new String(pass.getPassword());
          
          pageemploi p = new pageemploi(login);
          p.setVisible(true);
          
          
        
          /*login = text.getText();
          String mdp = new String(pass.getPassword());*/
          
         /* JLabel msg = new JLabel("Vous êtes  ");
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
        
        System.out.println(login);
        System.out.println(mdp);
          dispose();
      }
          
         });*/
              
        ImageIcon imgece = new ImageIcon("C:\\Users\\lyazi\\OneDrive\\Documents\\NetBeansProjects\\projetjava\\logo_ece.png");
     
        JLabel ecelogo = new JLabel(imgece);
     
     
    // ecelogo.setIcon(imgece);
     
        JPanel panels = new JPanel();
        panels.setBorder(new LineBorder(Color.BLACK, 3));
        panels.setLayout(new FlowLayout(100));
        panels.setBackground(new Color(250, 220, 210));
        panels.add(ecelogo);
        
        conteneur.add(panels, BorderLayout.NORTH);
        
        JButton buttone = new JButton("revenir à l'emploi du temps");
         
           buttone.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          pageemploi r = new pageemploi(login);
          //System.out.print(login);
          JPanel panele = new JPanel();
          panele.setBorder(new LineBorder(Color.BLACK, 3));
          panele.setBackground(Color.WHITE);
          panele.setLayout(new FlowLayout(5));
          JLabel l = new JLabel(login);
          
          panele.add(l);
          r.add(panele, BorderLayout.EAST);
          
          r.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });
          
           
          String[] choix ={"SELECT UN RECAP DE PROF","MANOLO HINA", "LAURENT DELISLE", "JP SEGADO", "ROBERT MINOT", "MICHEL PULLICINO", "FRANCESCO TURZI" };
        
       // JComboBox cb = new JComboBox(semaines);
        //cb.addItem("Semaine 1");
         JComboBox cob = new JComboBox(choix);
         cob.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange() == ItemEvent.SELECTED) {
                     //Object Id = e.getItem();
                    for(int i=0; i<7; i++)
                    { if((e.getItem() == choix[i]) && (e.getItem()!=choix[0]))
                    
                    {   recap r = new recap(login, choix[i]);
                        
                        /*JLabel cx =     new JLabel(choix[i]);
                        r.add(cx, BorderLayout.SOUTH);*/
                        r.setVisible(true);
                    }
                    }
                     
          
        
          
                    dispose();
                     
             }
             }
         });
           JPanel est = new JPanel();
           est.setBorder(new LineBorder(Color.BLACK, 3));
           est.setLayout(new FlowLayout());
           est.setBackground(new Color(250, 220, 210));
           JPanel panelbe = new JPanel();
           panelbe.setBorder(new LineBorder(Color.BLACK, 3));
           panelbe.setLayout(new GridLayout(5,1));
           panelbe.setBackground(new Color(250, 220, 210));
           JLabel log = new JLabel(login);
           JButton buttonrc = new JButton("Récapitulatif des cours");
           JButton buttonr = new JButton("Reporting");
           panelbe.add(log);
           panelbe.add(buttonr);
           panelbe.add(buttonrc);
           panelbe.add(buttone);
           panelbe.add(cob);
           //est.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
         //  panelbe.setBounds(largeur-largeur/4, hauteur/3, largeur/5, hauteur/5);
           est.add(panelbe);
           conteneur.add(est, BorderLayout.EAST);
           buttonr.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          Reporting r = new Reporting(login);
          r.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });
         
         
          buttonrc.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          String cx ="";
          recap rc = new recap(login, cx);
          rc.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });

          
           
        
    
    
}
}
