/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lyazi
 */
public class recap extends JFrame {
    public recap(String login, String choix){
         
        super("Recap");
        
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();
        

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, largeur, hauteur);
        setResizable(true);
        setVisible(true);
        
        Container conteneur = this.getContentPane();
        conteneur.setLayout(new BorderLayout(8,6));
        conteneur.setBackground(new Color(0, 102, 102));
        
        JPanel paneltop = new JPanel();
        paneltop.setBorder(new LineBorder(Color.BLACK, 3, true));
        paneltop.setLayout(new GridLayout(1, 5, largeur/20, 5));
        paneltop.setBackground(new Color(250, 220, 210));
        conteneur.add(paneltop, BorderLayout.NORTH);
        
        JLabel M = new JLabel("                   Matière");
        M.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        JLabel p = new JLabel("                   Première séance");
        p.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        JLabel d = new JLabel("                   Dernière séance");
        d.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        JLabel D = new JLabel("                   Durée");
        D.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        JLabel Nb = new JLabel("                   Nb");
        Nb.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        
        paneltop.add(M);
        paneltop.add(p);
        paneltop.add(d);
        paneltop.add(D);
        paneltop.add(Nb);
        
        JPanel panelc = new JPanel();
        panelc.setBorder(new LineBorder(Color.BLACK, 3, true));
        panelc.setLayout(new FlowLayout(5, largeur/200, hauteur/50));
        panelc.setBackground(new Color(0, 160, 160));
        conteneur.add(panelc, BorderLayout.CENTER);
        
       /* final int borderWidth = 1;
        final int ligs = 20;
        final int cols = 5;*/
        JPanel panelgr = new JPanel(new FlowLayout(5));
        panelgr.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgr.setBackground(Color.WHITE);
        
        JPanel panelgr2 = new JPanel(new FlowLayout(5));
        panelgr2.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2.setBackground(Color.WHITE);
        
        JPanel panelgr3 = new JPanel(new FlowLayout(5));
        panelgr3.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3.setBackground(Color.WHITE);
        
        JPanel panelgr4 = new JPanel(new FlowLayout(5));
        panelgr4.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4.setBackground(Color.WHITE);
        
        JPanel panelgr5 = new JPanel(new FlowLayout(5));
        panelgr5.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgr);
        panelc.add(panelgr2);
        panelc.add(panelgr3);
        panelc.add(panelgr4);
        panelc.add(panelgr5);
        
        JPanel panelgra = new JPanel(new FlowLayout(5));
        panelgra.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgra.setBackground(Color.WHITE);
        
        JPanel panelgr2a = new JPanel(new FlowLayout(5));
        panelgr2a.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2a.setBackground(Color.WHITE);
        
        JPanel panelgr3a = new JPanel(new FlowLayout(5));
        panelgr3a.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3a.setBackground(Color.WHITE);
        
        JPanel panelgr4a = new JPanel(new FlowLayout(5));
        panelgr4a.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4a.setBackground(Color.WHITE);
        
        JPanel panelgr5a = new JPanel(new FlowLayout(5));
        panelgr5a.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5a.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgra);
        panelc.add(panelgr2a);
        panelc.add(panelgr3a);
        panelc.add(panelgr4a);
        panelc.add(panelgr5a);
        
        JPanel panelgrb = new JPanel(new FlowLayout(5));
        panelgrb.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgrb.setBackground(Color.WHITE);
        
        JPanel panelgr2b = new JPanel(new FlowLayout(5));
        panelgr2b.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2b.setBackground(Color.WHITE);
        
        JPanel panelgr3b = new JPanel(new FlowLayout(5));
        panelgr3b.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3b.setBackground(Color.WHITE);
        
        JPanel panelgr4b = new JPanel(new FlowLayout(5));
        panelgr4b.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4b.setBackground(Color.WHITE);
        
        JPanel panelgr5b = new JPanel(new FlowLayout(5));
        panelgr5b.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5b.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgrb);
        panelc.add(panelgr2b);
        panelc.add(panelgr3b);
        panelc.add(panelgr4b);
        panelc.add(panelgr5b);
        
        JPanel panelgrc = new JPanel(new FlowLayout(5));
        panelgrc.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgrc.setBackground(Color.WHITE);
        
        JPanel panelgr2c = new JPanel(new FlowLayout(5));
        panelgr2c.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2c.setBackground(Color.WHITE);
        
        JPanel panelgr3c = new JPanel(new FlowLayout(5));
        panelgr3c.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3c.setBackground(Color.WHITE);
        
        JPanel panelgr4c = new JPanel(new FlowLayout(5));
        panelgr4c.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4c.setBackground(Color.WHITE);
        
        JPanel panelgr5c = new JPanel(new FlowLayout(5));
        panelgr5c.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5c.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgrc);
        panelc.add(panelgr2c);
        panelc.add(panelgr3c);
        panelc.add(panelgr4c);
        panelc.add(panelgr5c);
        
        JPanel panelgrd = new JPanel(new FlowLayout(5));
        panelgrd.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgrd.setBackground(Color.WHITE);
        
        JPanel panelgr2d = new JPanel(new FlowLayout(5));
        panelgr2d.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2d.setBackground(Color.WHITE);
        
        JPanel panelgr3d = new JPanel(new FlowLayout(5));
        panelgr3d.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3d.setBackground(Color.WHITE);
        
        JPanel panelgr4d = new JPanel(new FlowLayout(5));
        panelgr4d.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4d.setBackground(Color.WHITE);
        
        JPanel panelgr5d = new JPanel(new FlowLayout(5));
        panelgr5d.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5d.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgrd);
        panelc.add(panelgr2d);
        panelc.add(panelgr3d);
        panelc.add(panelgr4d);
        panelc.add(panelgr5d);
        
        JPanel panelgre = new JPanel(new FlowLayout(5));
        panelgre.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgre.setBackground(Color.WHITE);
        
        JPanel panelgr2e = new JPanel(new FlowLayout(5));
        panelgr2e.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2e.setBackground(Color.WHITE);
        
        JPanel panelgr3e = new JPanel(new FlowLayout(5));
        panelgr3e.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3e.setBackground(Color.WHITE);
        
        JPanel panelgr4e = new JPanel(new FlowLayout(5));
        panelgr4e.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4e.setBackground(Color.WHITE);
        
        JPanel panelgr5e = new JPanel(new FlowLayout(5));
        panelgr5e.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgre);
        panelc.add(panelgr2e);
        panelc.add(panelgr3e);
        panelc.add(panelgr4e);
        panelc.add(panelgr5e);
        
        JPanel panelgrf = new JPanel(new FlowLayout(5));
        panelgrf.setPreferredSize(new Dimension((largeur/5)+largeur/100, hauteur/50));
        panelgrf.setBackground(Color.WHITE);
        
        JPanel panelgr2f = new JPanel(new FlowLayout(5));
        panelgr2f.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr2f.setBackground(Color.WHITE);
        
        JPanel panelgr3f = new JPanel(new FlowLayout(5));
        panelgr3f.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr3f.setBackground(Color.WHITE);
        
        JPanel panelgr4f = new JPanel(new FlowLayout(5));
        panelgr4f.setPreferredSize(new Dimension((largeur/5), hauteur/50));
        panelgr4f.setBackground(Color.WHITE);
        
        JPanel panelgr5f = new JPanel(new FlowLayout(5));
        panelgr5f.setPreferredSize(new Dimension((largeur/7)+largeur/100, hauteur/50));
        panelgr5f.setBackground(Color.WHITE);
        
        
        
        panelc.add(panelgrf);
        panelc.add(panelgr2f);
        panelc.add(panelgr3f);
        panelc.add(panelgr4f);
        panelc.add(panelgr5f);


        
               
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
             String[] chox ={"SELECT UN RECAP DE PROF","MANOLO HINA", "LAURENT DELISLE", "JP SEGADO", "ROBERT MINOT", "MICHEL PULLICINO", "FRANCESCO TURZI" };
        
       // JComboBox cb = new JComboBox(semaines);
        //cb.addItem("Semaine 1");
         JComboBox cob = new JComboBox(chox);
         cob.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange() == ItemEvent.SELECTED) {
                     //Object Id = e.getItem();
                    for(int i=0; i<7; i++)
                    { if((e.getItem() == chox[i]) && (e.getItem()!=chox[0]))
                    
                    {   recap r = new recap(login, chox[i]);
                        
                        /*JLabel cx =     new JLabel(choix[i]);
                        r.add(cx, BorderLayout.SOUTH);*/
                        //JLabel choice = new JLabel(chox[i]);
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
           //JLabel titre = new JLabel("REPORTING                                                                                                  ");
           //Font font = new Font("Arial",Font.BOLD,(largeur/100)*2);
           //titre.setFont(font);
           panelbe.setBorder(new LineBorder(Color.BLACK, 3));
           panelbe.setLayout(new GridLayout(1,5));
           panelbe.setBackground(new Color(250, 220, 210));
           JLabel log = new JLabel(login);
           //JLabel cx = new JLabel(choix[i]);
           JLabel titre = new JLabel("Bienvenue sur le récapitulatif de cours de ");
           JButton buttonr = new JButton("Récapitulatif des cours");
           JButton buttonmaj = new JButton("Mise à jour des séances");
           //panelbe.add(choice);
           panelbe.add(buttonmaj);
           panelbe.add(buttonr);
           panelbe.add(buttone);
           panelbe.add(cob);
           //est.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
         //  panelbe.setBounds(largeur-largeur/4, hauteur/3, largeur/5, hauteur/5);
         
           //est.add(titre);
           est.add(titre);
           Font font = new Font("Arial",Font.BOLD,(largeur/100));
           titre.setFont(font);
           log.setFont(font);
           est.add(log);
           est.add(panelbe);
           conteneur.add(est, BorderLayout.SOUTH);
           buttonmaj.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          MiseAJour r = new MiseAJour(login);
          r.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });
         
         
          buttonr.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          Reporting r = new Reporting(login);
          r.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });

          
                 
 
        
    }
    
}
