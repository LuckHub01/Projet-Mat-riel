/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.projet_javainfo2;

import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class CorpsEnregistrement extends javax.swing.JPanel {

    /**
     * Creates new form CorpsAccueil
     */
    public CorpsEnregistrement() {
        initComponents();
    }
    
    public void enregistrerCorps(){
       txtCahier.grabFocus();
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new erp.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtCahier = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(12, 135, 148));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plateforme de Gestion du Matériel EPO");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 60);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 27)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Effectuer un enregistrement");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(290, 80, 660, 33);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Lettre de la rallonge:");
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(140, 340, 300, 32);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelBorder1.add(jComboBox1);
        jComboBox1.setBounds(570, 330, 370, 42);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Lettre du projecteur:");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(140, 470, 300, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Numero du cahier de texte: ");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(110, 210, 360, 32);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panelBorder1.add(jComboBox2);
        jComboBox2.setBounds(570, 460, 370, 42);

        txtCahier.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCahier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtCahier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCahierActionPerformed(evt);
            }
        });
        panelBorder1.add(txtCahier);
        txtCahier.setBounds(570, 200, 370, 42);

        jButton1.setBackground(new java.awt.Color(12, 104, 112));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enregistrer");
        panelBorder1.add(jButton1);
        jButton1.setBounds(450, 600, 370, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtCahierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCahierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCahierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private erp.PanelBorder panelBorder1;
    private javax.swing.JComboBox<String> txtCahier;
    // End of variables declaration//GEN-END:variables
}
