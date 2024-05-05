/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.projet_javainfo2;

import erp.PanelSlide;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class Accordeon extends javax.swing.JPanel {

    /**
     * Creates new form Accordeon
     */
    public Accordeon() {
        initComponents();
        
        
      
    }
    
    
    
    
    public void addEventAccAccueil (ActionListener event){
        accueilAccordeon.addActionListener(event);
        
    }
    
    public void addEventAccEmprunt (ActionListener event){
        empruntAccordeon.addActionListener(event);
        
    }
    
    
     public JButton getHomeBtn() {
        return accueilAccordeon;
}
     
       public JButton getEnregistrerBtn() {
        return enregistrerAccordeon;
}
     
     
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        accordeon = new erp.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        accueilAccordeon = new javax.swing.JButton();
        empruntAccordeon = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        enregistrerAccordeon = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(9, 188, 202));

        accordeon.setBackground(new java.awt.Color(9, 152, 165));
        accordeon.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Accordeon");

        accueilAccordeon.setBackground(new java.awt.Color(12, 104, 112));
        accueilAccordeon.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        accueilAccordeon.setForeground(new java.awt.Color(255, 255, 255));
        accueilAccordeon.setText("Accueil");
        accueilAccordeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accueilAccordeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accueilAccordeonActionPerformed(evt);
            }
        });

        empruntAccordeon.setBackground(new java.awt.Color(12, 104, 112));
        empruntAccordeon.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        empruntAccordeon.setForeground(new java.awt.Color(255, 255, 255));
        empruntAccordeon.setText("Emprunt");
        empruntAccordeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empruntAccordeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empruntAccordeonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(12, 104, 112));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Retour");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        enregistrerAccordeon.setBackground(new java.awt.Color(12, 104, 112));
        enregistrerAccordeon.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        enregistrerAccordeon.setForeground(new java.awt.Color(255, 255, 255));
        enregistrerAccordeon.setText("Enregistrement");
        enregistrerAccordeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enregistrerAccordeon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerAccordeonActionPerformed(evt);
            }
        });

        accordeon.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        accordeon.setLayer(accueilAccordeon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        accordeon.setLayer(empruntAccordeon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        accordeon.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        accordeon.setLayer(enregistrerAccordeon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout accordeonLayout = new javax.swing.GroupLayout(accordeon);
        accordeon.setLayout(accordeonLayout);
        accordeonLayout.setHorizontalGroup(
            accordeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accordeonLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(accordeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enregistrerAccordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empruntAccordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accueilAccordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        accordeonLayout.setVerticalGroup(
            accordeonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accordeonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(accueilAccordeon)
                .addGap(31, 31, 31)
                .addComponent(enregistrerAccordeon)
                .addGap(37, 37, 37)
                .addComponent(empruntAccordeon)
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addGap(406, 406, 406))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(accordeon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(accordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empruntAccordeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empruntAccordeonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empruntAccordeonActionPerformed

    private void accueilAccordeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accueilAccordeonActionPerformed

       
        // TODO add your handling code here:

    }//GEN-LAST:event_accueilAccordeonActionPerformed

    private void enregistrerAccordeonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerAccordeonActionPerformed
        // TODO add your handling code here:
         Accueil accueilFrame = (Accueil) SwingUtilities.getWindowAncestor(this);
        CorpsEnregistrement corpsEnregistrement= new CorpsEnregistrement();
        //accueilFrame.getCorpsSlide().init(corpsEnregistrement);
    }//GEN-LAST:event_enregistrerAccordeonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private erp.PanelBorder accordeon;
    private javax.swing.JButton accueilAccordeon;
    private javax.swing.JButton empruntAccordeon;
    private javax.swing.JButton enregistrerAccordeon;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
