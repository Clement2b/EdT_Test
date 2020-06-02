/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author lyazi
 * 
 * 
 * 
 */


import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jfree.chart.*; 
import org.jfree.chart.plot.*; 
import org.jfree.data.*; 
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


public class Reporting extends JFrame {
    
    public Reporting(String login){
        
        super("Reporting");
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
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK, 3));
        panel.setLayout(new FlowLayout(100));
        panel.setBackground(new Color(250, 230, 210));
        conteneur.add(panel, BorderLayout.CENTER);
        
        
        DefaultPieDataset pieDatasetps = new DefaultPieDataset(); 
        pieDatasetps.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDatasetps.setValue("Nombre d'heures restantes", new Integer(10)); 
   

        JFreeChart pieChartps = ChartFactory.createPieChart("Probabilités et statistiques", 
        pieDatasetps, true, true, true); 
        ChartPanel cPanelps = new ChartPanel(pieChartps);
        cPanelps.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelps);
    
        DefaultPieDataset pieDatasetw = new DefaultPieDataset(); 
        pieDatasetw.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDatasetw.setValue("Nombre d'heures restantes", new Integer(1)); 
    

        JFreeChart pieChartw = ChartFactory.createPieChart("Web Dynamique", 
        pieDatasetw, true, true, true); 
        ChartPanel cPanelw = new ChartPanel(pieChartw);
        cPanelw.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelw);
        
        DefaultPieDataset pieDatasetr = new DefaultPieDataset(); 
        pieDatasetr.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDatasetr.setValue("Nombre d'heures restantes", new Integer(1)); 
    

        JFreeChart pieChartr = ChartFactory.createPieChart("Robotique", 
        pieDatasetr, true, true, true); 
        ChartPanel cPanelr = new ChartPanel(pieChartr);
        cPanelr.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelr);
        
        DefaultPieDataset pieDataseth = new DefaultPieDataset(); 
        pieDataseth.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDataseth.setValue("Nombre d'heures restantes", new Integer(1)); 
    

        JFreeChart pieCharth = ChartFactory.createPieChart("Thermodynamique", 
        pieDataseth, true, true, true); 
        ChartPanel cPanelh = new ChartPanel(pieCharth);
        cPanelh.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelh);
        
        DefaultPieDataset pieDatasetaf = new DefaultPieDataset(); 
        pieDatasetaf.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDatasetaf.setValue("Nombre d'heures restantes", new Integer(1)); 
    

        JFreeChart pieChartaf = ChartFactory.createPieChart("Analyse financière", 
        pieDatasetaf, true, true, true); 
        ChartPanel cPanelaf = new ChartPanel(pieChartaf);
        cPanelaf.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelaf);
        
        DefaultPieDataset pieDatasetj = new DefaultPieDataset(); 
        pieDatasetj.setValue("Nombre d'heures effectuées", new Integer(12)); 
        pieDatasetj.setValue("Nombre d'heures restantes", new Integer(1)); 
    

        JFreeChart pieChartj = ChartFactory.createPieChart("Analyse financière", 
        pieDatasetj, true, true, true); 
        ChartPanel cPanelj = new ChartPanel(pieChartj);
        cPanelj.setPreferredSize(new Dimension(largeur/3, hauteur/4));
        panel.add(cPanelj);
        
           
        ImageIcon imgece = new ImageIcon("C:\\Users\\lyazi\\OneDrive\\Documents\\NetBeansProjects\\projetjava\\eceparis.png");
     
        JLabel ecelogo = new JLabel(imgece);
     
     
    // ecelogo.setIcon(imgece);
     
        JPanel panels = new JPanel();
        panels.setBorder(new LineBorder(Color.BLACK, 3));
        panels.setLayout(new FlowLayout(100));
        panels.setBackground(new Color(250, 220, 210));
        panels.add(ecelogo);
        conteneur.add(panels, BorderLayout.EAST);
        
        
         
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
           JPanel est = new JPanel();
           est.setBorder(new LineBorder(Color.BLACK, 3));
           est.setLayout(new FlowLayout());
           est.setBackground(new Color(250, 220, 210));
           JPanel panelbe = new JPanel();
           JLabel titre = new JLabel("REPORTING                                                                                                  ");
           Font font = new Font("Arial",Font.BOLD,(largeur/100)*2);
           titre.setFont(font);
           panelbe.setBorder(new LineBorder(Color.BLACK, 3));
           panelbe.setLayout(new GridLayout(1,5));
           panelbe.setBackground(new Color(250, 220, 210));
           JLabel log = new JLabel(login);
           JButton buttonrc = new JButton("Récapitulatif des cours");
           JButton buttonmaj = new JButton("Mise à jour des séances");
           //panelbe.add(log);
           
          String[] choix ={"SELECT UN RECAP DE PROF","MANOLO HINA", "LAURENT DELISLE", "JP SEGADO", "ROBERT MINOT", "MICHEL PULLICINO", "FRANCESCO TURZI" };
        
       // JComboBox cb = new JComboBox(semaines);
        //cb.addItem("Semaine 1");
           JComboBox cob = new JComboBox(choix);
           panelbe.add(buttonmaj);
           panelbe.add(buttonrc);
           panelbe.add(buttone);
           panelbe.add(cob);
           //est.setLayout(null);
        //panel.add(button, BorderLayout.CENTER);
         //  panelbe.setBounds(largeur-largeur/4, hauteur/3, largeur/5, hauteur/5);
         
           est.add(titre);
           est.add(panelbe);
           conteneur.add(est, BorderLayout.NORTH);
           buttonmaj.addActionListener(new ActionListener() {
     
      
      public void actionPerformed(ActionEvent event) {
         
          
          MiseAJour r = new MiseAJour(login);
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
           
    
    }
    
}
