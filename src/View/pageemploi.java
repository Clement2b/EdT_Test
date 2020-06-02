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
import Controler.Controler;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pageemploi extends JFrame{
    
    //On instancie le controleur
    protected Controler controler;
    
    
    public pageemploi(String login) {
    
        
         super("Emploi du temps");
         
         
        //On recupere les donnees du modele a partir de la construction du controleur
        controler = new Controler(login);
        
        
        /**
         * Pour afficher une donnée par rapport a l'objet de type EdT dans le controleur :
         * controler.getEdT() -> objet de type EdT qu'il y a dans le controleur
         * controler.EdTUtilisateur -> Exactement la meme chose
         * 
         * controler.EdTUtilisateur.utilisateur -> acces à l'utilisateur
         * controler.EdTUtilisateur.edt_seances -> acces à la ArrayList d'objet de type Seance contenant les seances 
         * auquel assiste l'utilisateur par rapport à l'int semaine : controler.EdTUtilisateur.semaine
         * 
        **/
        
        Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int hauteur = (int)tailleEcran.getHeight();
        int largeur = (int)tailleEcran.getWidth();
        

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, largeur, hauteur);
        setResizable(true);
        
      
    
        
        Container conteneur = this.getContentPane();
        conteneur.setLayout(new BorderLayout(8,6));
        conteneur.setBackground(new Color(0, 102, 102));
        
        JLabel l1 = new JLabel("                                  LUNDI     ");
        //l1.setHorizontalAlignment(JLabel.CENTER);
        JLabel l2 = new JLabel("                                 MARDI");
        //l2.setHorizontalAlignment(JLabel.CENTER);
        JLabel l3 = new JLabel("                                 MERCREDI");
        //l3.setHorizontalAlignment(JLabel.CENTER);
        JLabel l4 = new JLabel("                                   JEUDI");
        //l4.setHorizontalAlignment(JLabel.CENTER);
        JLabel l5 = new JLabel("                                   VENDREDI");
        //l5.setHorizontalAlignment(JLabel.CENTER);
        JLabel l6 = new JLabel("                                      SAMEDI");
        //l6.setHorizontalAlignment(JLabel.CENTER);
        
      
        
        JPanel panelj = new JPanel();
        panelj.setBorder(new LineBorder(Color.BLACK, 3));
        panelj.setLayout(new GridLayout(1,6));
        panelj.setBackground(Color.WHITE);
        panelj.setPreferredSize(new Dimension(largeur-largeur/5, hauteur/50));
        
        
       // panelj.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
       /* l1.setBounds(140, 15, 200, 20);
        l2.setBounds(275, 15, 200, 20);
        l3.setBounds(410, 15, 200, 20);
        l4.setBounds(545, 15, 200, 20);
        l5.setBounds(680, 15, 200, 20);
        l6.setBounds(815, 15, 200, 20);*/

        
        
        
        
        
       
       
        panelj.add(l1);
        panelj.add(l2);
        panelj.add(l3);
        panelj.add(l4);
        panelj.add(l5);
        panelj.add(l6);
        
        String[] semaines= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        String[] choix ={"SELECT UN RECAP DE PROF","MANOLO HINA", "LAURENT DELISLE", "JP SEGADO", "ROBERT MINOT", "MICHEL PULLICINO", "FRANCESCO TURZI" };
        
        JComboBox cb = new JComboBox(semaines);
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
         
        
        
       
        JLabel label = new JLabel("EMPLOI DU TEMPS ");
        JLabel week = new JLabel("Semaine ");
        JPanel paneltop = new JPanel();
        paneltop.setBorder(new LineBorder(Color.BLACK, 3));
        paneltop.setBackground(new Color(0, 160, 160));
        paneltop.setLayout(new FlowLayout(5));
        paneltop.add(label);
        paneltop.add(panelj);
        paneltop.add(week);
        //paneltop.add(cob);
        
        paneltop.add(cb);
        conteneur.add(paneltop, BorderLayout.NORTH);
        
        JLabel label1 = new JLabel("8h30");
        JLabel label2 = new JLabel("10h 10h15");
        JLabel label3 = new JLabel("11h45 12h");
        JLabel label4 = new JLabel("13h30 13h45");
        JLabel label5 = new JLabel("15h15 15h30");
        JLabel label6 = new JLabel("17h 17h15");
        JLabel label7 = new JLabel("18h45 19h");
        JLabel label8 = new JLabel("20h30");
        
        JPanel panelg = new JPanel();
        panelg.setBorder(new LineBorder(Color.BLACK, 3));
        panelg.setLayout(new GridLayout(8, 1, 5, hauteur/10));
        panelg.setBackground(Color.WHITE);
        
        
        
        
        
       
       
        panelg.add(label1);
        panelg.add(label2);
        panelg.add(label3);
        panelg.add(label4);
        panelg.add(label5);
        panelg.add(label6);
        panelg.add(label7);
        panelg.add(label8);
        JPanel panelw = new JPanel();
        panelw.setBorder(new LineBorder(Color.BLACK, 3));
        panelw.setBackground(new Color(0, 160, 160));
        panelw.setLayout(new FlowLayout(5));
        panelw.add(panelg);
        conteneur.add(panelw, BorderLayout.WEST);
        
        //JLabel lc = new JLabel("OUI EN EFFET");
        JPanel panelgca = new JPanel();
        panelgca.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb = new JPanel();
        panelgccb.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb.setLayout(new FlowLayout(5));
        
        JPanel panelgccc = new JPanel();
        panelgccc.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc.setLayout(new FlowLayout(5));
        
        JPanel panelgccd = new JPanel();
        panelgccd.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce = new JPanel();
        panelgcce.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf = new JPanel();
        panelgccf.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg = new JPanel();
        panelgccg.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg.setLayout(new FlowLayout(5));
        
       
        
        
        
        
        panelgca.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
 
        
        panelgca.setBackground(new Color(250, 240, 210));
        panelgccb.setBackground(new Color(250, 230, 210));
        panelgccc.setBackground(new Color(250, 220, 210));
        panelgccd.setBackground(new Color(250, 210, 210));
        panelgcce.setBackground(new Color(250, 200, 210));
        panelgccf.setBackground(new Color(250, 190, 210));
        panelgccg.setBackground(new Color(250, 180, 210));
       
        
        
    
        
        JPanel panelgc = new JPanel();
        panelgc.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc.setBackground(Color.WHITE);
        panelgc.add(panelgca);
        panelgc.add(panelgccb);
        panelgc.add(panelgccc);
        panelgc.add(panelgccd);
        panelgc.add(panelgcce);
        panelgc.add(panelgccf);
        panelgc.add(panelgccg);
        
        panelgc.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        JPanel panelgca2 = new JPanel();
        panelgca2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca2.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb2 = new JPanel();
        panelgccb2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb2.setLayout(new FlowLayout(5));
        
        JPanel panelgccc2 = new JPanel();
        panelgccc2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc2.setLayout(new FlowLayout(5));
        
        JPanel panelgccd2 = new JPanel();
        panelgccd2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd2.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce2 = new JPanel();
        panelgcce2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce2.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf2 = new JPanel();
        panelgccf2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf2.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg2 = new JPanel();
        panelgccg2.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg2.setLayout(new FlowLayout(5));
        
        
       
        
        panelgca2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg2.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
       
        
        panelgca2.setBackground(new Color(250, 240, 210));
        panelgccb2.setBackground(new Color(250, 230, 210));
        panelgccc2.setBackground(new Color(250, 220, 210));
        panelgccd2.setBackground(new Color(250, 210, 210));
        panelgcce2.setBackground(new Color(250, 200, 210));
        panelgccf2.setBackground(new Color(250, 190, 210));
        panelgccg2.setBackground(new Color(250, 180, 210));
        
        
        JPanel panelgc2 = new JPanel();
        panelgc2.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc2.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc2.setBackground(Color.WHITE);
        panelgc2.add(panelgca2);
        panelgc2.add(panelgccb2);
        panelgc2.add(panelgccc2);
        panelgc2.add(panelgccd2);
        panelgc2.add(panelgcce2);
        panelgc2.add(panelgccf2);
        panelgc2.add(panelgccg2);
      
        panelgc2.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        JPanel panelgca3 = new JPanel();
        panelgca3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca3.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb3 = new JPanel();
        panelgccb3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb3.setLayout(new FlowLayout(5));
        
        JPanel panelgccc3 = new JPanel();
        panelgccc3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc.setLayout(new FlowLayout(5));
        
        JPanel panelgccd3 = new JPanel();
        panelgccd3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd3.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce3 = new JPanel();
        panelgcce3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce3.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf3 = new JPanel();
        panelgccf3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf3.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg3 = new JPanel();
        panelgccg3.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg3.setLayout(new FlowLayout(5));
        
        
        
        
        panelgca3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg3.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));

        
        panelgca3.setBackground(new Color(250, 240, 210));
        panelgccb3.setBackground(new Color(250, 230, 210));
        panelgccc3.setBackground(new Color(250, 220, 210));
        panelgccd3.setBackground(new Color(250, 210, 210));
        panelgcce3.setBackground(new Color(250, 200, 210));
        panelgccf3.setBackground(new Color(250, 190, 210));
        panelgccg3.setBackground(new Color(250, 180, 210));
        
        
        
        JPanel panelgc3 = new JPanel();
        panelgc3.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc3.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc3.setBackground(Color.WHITE);
        panelgc3.add(panelgca3);
        panelgc3.add(panelgccb3);
        panelgc3.add(panelgccc3);
        panelgc3.add(panelgccd3);
        panelgc3.add(panelgcce3);
        panelgc3.add(panelgccf3);
        panelgc3.add(panelgccg3);
       
        panelgc3.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        JPanel panelgca4 = new JPanel();
        panelgca4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca4.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb4 = new JPanel();
        panelgccb4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb.setLayout(new FlowLayout(5));
        
        JPanel panelgccc4 = new JPanel();
        panelgccc4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc.setLayout(new FlowLayout(5));
        
        JPanel panelgccd4 = new JPanel();
        panelgccd4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd4.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce4 = new JPanel();
        panelgcce4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce4.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf4 = new JPanel();
        panelgccf4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf4.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg4 = new JPanel();
        panelgccg4.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg4.setLayout(new FlowLayout(5));
        
        
        
        
        panelgca4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg4.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        
        panelgca4.setBackground(new Color(250, 240, 210));
        panelgccb4.setBackground(new Color(250, 230, 210));
        panelgccc4.setBackground(new Color(250, 220, 210));
        panelgccd4.setBackground(new Color(250, 210, 210));
        panelgcce4.setBackground(new Color(250, 200, 210));
        panelgccf4.setBackground(new Color(250, 190, 210));
        panelgccg4.setBackground(new Color(250, 180, 210));
       
        
        
        
        JPanel panelgc4 = new JPanel();
        panelgc4.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc4.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc4.setBackground(Color.WHITE);
        panelgc4.add(panelgca4);
        panelgc4.add(panelgccb4);
        panelgc4.add(panelgccc4);
        panelgc4.add(panelgccd4);
        panelgc4.add(panelgcce4);
        panelgc4.add(panelgccf4);
        panelgc4.add(panelgccg4);

        panelgc4.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        
        JPanel panelgca5 = new JPanel();
        panelgca5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca5.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb5 = new JPanel();
        panelgccb5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb5.setLayout(new FlowLayout(5));
        
        JPanel panelgccc5 = new JPanel();
        panelgccc5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc5.setLayout(new FlowLayout(5));
        
        JPanel panelgccd5 = new JPanel();
        panelgccd5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd5.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce5 = new JPanel();
        panelgcce5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce5.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf5 = new JPanel();
        panelgccf5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf5.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg5 = new JPanel();
        panelgccg5.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg5.setLayout(new FlowLayout(5));
        
        
        
        
        panelgca5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg5.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        
        
        panelgca5.setBackground(new Color(250, 240, 210));
        panelgccb5.setBackground(new Color(250, 230, 210));
        panelgccc5.setBackground(new Color(250, 220, 210));
        panelgccd5.setBackground(new Color(250, 210, 210));
        panelgcce5.setBackground(new Color(250, 200, 210));
        panelgccf5.setBackground(new Color(250, 190, 210));
        panelgccg5.setBackground(new Color(250, 180, 210));
      
        
        
        
        JPanel panelgc5 = new JPanel();
        panelgc5.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc5.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc5.setBackground(Color.WHITE);
        panelgc5.add(panelgca5);
        panelgc5.add(panelgccb5);
        panelgc5.add(panelgccc5);
        panelgc5.add(panelgccd5);
        panelgc5.add(panelgcce5);
        panelgc5.add(panelgccf5);
        panelgc5.add(panelgccg5);
      
        panelgc5.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        JPanel panelgca6 = new JPanel();
        panelgca6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgca6.setLayout(new FlowLayout(5));
        //panelgca.setBackground(Color.WHITE);
       
        
        JPanel panelgccb6 = new JPanel();
        panelgccb6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccb6.setLayout(new FlowLayout(5));
        
        JPanel panelgccc6 = new JPanel();
        panelgccc6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccc6.setLayout(new FlowLayout(5));
        
        JPanel panelgccd6 = new JPanel();
        panelgccd6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccd6.setLayout(new FlowLayout(5));
        
        
        JPanel panelgcce6 = new JPanel();
        panelgcce6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgcce6.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccf6 = new JPanel();
        panelgccf6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccf6.setLayout(new FlowLayout(5));
        
        
        JPanel panelgccg6 = new JPanel();
        panelgccg6.setBorder(new LineBorder(Color.BLACK, 1));
        panelgccg6.setLayout(new FlowLayout(5));
        
        
       
        
        panelgca6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccb6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccc6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccd6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgcce6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccf6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        panelgccg6.setPreferredSize(new Dimension((largeur-largeur/5)/6-largeur/300, hauteur/10));
        
        
        panelgca6.setBackground(new Color(250, 240, 210));
        panelgccb6.setBackground(new Color(250, 230, 210));
        panelgccc6.setBackground(new Color(250, 220, 210));
        panelgccd6.setBackground(new Color(250, 210, 210));
        panelgcce6.setBackground(new Color(250, 200, 210));
        panelgccf6.setBackground(new Color(250, 190, 210));
        panelgccg6.setBackground(new Color(250, 180, 210));
       
        
        
        
        JPanel panelgc6 = new JPanel();
        panelgc6.setBorder(new LineBorder(Color.BLACK, 3));
        panelgc6.setLayout(new FlowLayout(5,0,hauteur/70));
        panelgc6.setBackground(Color.WHITE);
        panelgc6.add(panelgca6);
        panelgc6.add(panelgccb6);
        panelgc6.add(panelgccc6);
        panelgc6.add(panelgccd6);
        panelgc6.add(panelgcce6);
        panelgc6.add(panelgccf6);
        panelgc6.add(panelgccg6);
    ;
        panelgc6.setPreferredSize(new Dimension((largeur-largeur/5)/6, (hauteur*8)/10+hauteur/50));
        
        
        JPanel panelc = new JPanel();
        panelc.setBorder(new LineBorder(Color.BLACK, 3));
        panelc.setBackground(new Color(0, 160, 160));
        panelc.setLayout(new FlowLayout(5));
        panelc.add(panelgc);
        panelc.add(panelgc2);
        panelc.add(panelgc3);
        panelc.add(panelgc4);
        panelc.add(panelgc5);
        panelc.add(panelgc6);
        
        conteneur.add(panelc, BorderLayout.CENTER);
        
        //JLabel log = new JLabel(login);
        //paneltop.add(log);
        JButton buttonr = new JButton("Reporting");
        JButton buttonrc = new JButton("Récapitulatif des cours");
        JButton buttonmaj = new JButton("Mise à jour des séances");
        
        JPanel panelb = new JPanel();
        panelb.setBorder(new LineBorder(Color.BLACK, 3));
        panelb.setBackground(Color.WHITE);
        panelb.setLayout(new GridLayout(1, 4));
        //buttonr.setPreferredSize(new Dimension(50, 100));
        panelb.add(buttonr);
        panelb.add(buttonrc, BorderLayout.SOUTH);
       
        panelb.add(buttonmaj);
        panelb.add(cob);        
        panelc.add(panelb);
        
        
         buttonr.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          Reporting r = new Reporting(login);
          r.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });
         
         
          buttonrc.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          String cx = "";
          recap rc = new recap(login, cx);
          rc.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });
          
      buttonmaj.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          MiseAJour maj = new MiseAJour(login);
          /*JPanel test = new JPanel();
          JLabel l = new JLabel(login);
          test.add(l);
          maj.add(test, BorderLayout.EAST);*/
          maj.setVisible(true);
          
          
        
          
          dispose();
      }
          
         });

        
}
}
