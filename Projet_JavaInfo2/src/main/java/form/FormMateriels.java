/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import connection.Connexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.Materiel;

/**
 *
 * @author HP
 */



public class FormMateriels extends javax.swing.JFrame {
    private final Connexion connexion;

    /**
     * Creates new form FormMateriels
     */
    
    private void remplirComboBox() {
        
        jComboType.removeAllItems();
        jComboClasse.removeAllItems();
        jComboBox3.removeAllItems();
        
    // Remplissage du JComboBox pour le type de matériel
        jComboType.addItem("Rallonge");
        jComboType.addItem("Projecteur");
        jComboType.addItem("Câble HDMI");
        jComboType.addItem("Cable VGA ");
        jComboType.addItem("Cable d’alimentation");
        jComboType.addItem("Fiche d’absence");
        jComboType.addItem("Cahier de texte");
        // Ajoutez autant d'éléments que nécessaire

        // Remplissage du JComboBox pour la classe
        jComboClasse.addItem("");
        jComboClasse.addItem("IGIT 1");
        jComboClasse.addItem("Informatique 2");
        jComboClasse.addItem("Telecom 2");
        jComboClasse.addItem("Informatique 3");
        jComboClasse.addItem("Telecom 3");
        jComboClasse.addItem("IGSIT 1");
        jComboClasse.addItem("IGSIT 2");
        jComboClasse.addItem("IGSIT 3");
        jComboClasse.addItem("MPSI");
        jComboClasse.addItem("PCSI");
        jComboClasse.addItem("MP");
        jComboClasse.addItem("PC");



        // Ajoutez autant d'éléments que nécessaire

        // Remplissage du JComboBox pour l'état
        jComboBox3.addItem("Bon");
        jComboBox3.addItem("Passable");
        // Ajoutez autant d'éléments que nécessaire
        
        
}
    
    public FormMateriels() {
        initComponents();
        remplirComboBox();
        // Définir jComboClasse et jLabel3 comme cachés au démarrage
        jComboClasse.setVisible(false);
        jLabel3.setVisible(false);

        // Ajouter un écouteur d'événements à jComboType
        jComboType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Vérifier si "Rallonge" est sélectionné
                if (jComboType.getSelectedItem().equals("Cahier de texte")) {
                    // Afficher jComboClasse et jLabel3
                    jComboClasse.setVisible(true);
                    jLabel3.setVisible(true);
                } else {
                    // Cacher jComboClasse et jLabel3
                    jComboClasse.setVisible(false);
                    jLabel3.setVisible(false);
                }
            }
        });

        // Autres initialisations...
        this.connexion = new Connexion(); // Initialiser la connexion dans le constructeur
        this.connexion.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboClasse = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jb_save = new javax.swing.JButton();
        jb_cancel1 = new javax.swing.JButton();
        jb_update = new javax.swing.JButton();
        jNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Enregistrement du materiel");

        jLabel2.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel2.setText("Type");

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel3.setText("Classe");

        jComboClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel6.setText("Etat");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel4.setText("Date");

        jb_save.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jb_save.setForeground(new java.awt.Color(0, 153, 0));
        jb_save.setText("Enregistrer");
        jb_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveActionPerformed(evt);
            }
        });

        jb_cancel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jb_cancel1.setForeground(new java.awt.Color(204, 51, 0));
        jb_cancel1.setText("Annuler");
        jb_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancel1ActionPerformed(evt);
            }
        });

        jb_update.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jb_update.setForeground(new java.awt.Color(0, 0, 102));
        jb_update.setText("Modifier");
        jb_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_updateActionPerformed(evt);
            }
        });

        jNumero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jNumero.setText("Numero");

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_save)
                        .addGap(18, 18, 18)
                        .addComponent(jb_cancel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_update)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jComboBox3, 0, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboType, 0, 178, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNumero))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumero))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_save, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_update, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox3, jComboClasse, jComboType, jDateChooser1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel6, jNumero});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveActionPerformed
        // TODO add your handling code here:
        // Récupérer les valeurs des champs du formulaire
        String typeMateriel = jComboType.getSelectedItem().toString();
        String classe = jComboClasse.getSelectedItem().toString();
        String etat = jComboBox3.getSelectedItem().toString();
        String numero = jTextFieldNumero.getText();
        // Récupérer la date à partir du JDateChooser
        Date selectedDate = jDateChooser1.getDate();
        

        // Vérifier si une date a été sélectionnée
        if (selectedDate != null) {
            // Convertir la date sélectionnée en LocalDate
            LocalDate date = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Utiliser la date sélectionnée
            
            
            Connexion con = new Connexion();
            Materiel materiel = new Materiel(con.connect());
            materiel.setTypeMateriel(typeMateriel);
            materiel.setEtat(etat);
            materiel.setDate(date);
            materiel.setClasse(classe);
            materiel.setNumero(numero);
            materiel.save();
            JOptionPane.showMessageDialog(this, "Materiel enregistré avec success", "Infos", JOptionPane.INFORMATION_MESSAGE);
            jComboType.setSelectedIndex(0);
            jComboClasse.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jDateChooser1.setDate(null);
            jTextFieldNumero.setText("");
        } else {
            // Afficher un message d'erreur indiquant que l'utilisateur doit sélectionner une date
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une date", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_saveActionPerformed

    private void jb_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancel1ActionPerformed
        // TODO add your handling code here:
        jComboType.setSelectedIndex(0);
        jComboClasse.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jTextFieldNumero.setText("");
    }//GEN-LAST:event_jb_cancel1ActionPerformed

    private void jb_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_updateActionPerformed
        // TODO add your handling code here:
        FormMaterielsUp formMaterielsUp = new FormMaterielsUp();
        formMaterielsUp.setVisible(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jb_updateActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMateriels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMateriels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMateriels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMateriels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMateriels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboClasse;
    private javax.swing.JComboBox<String> jComboType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jNumero;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JButton jb_cancel1;
    private javax.swing.JButton jb_save;
    private javax.swing.JButton jb_update;
    // End of variables declaration//GEN-END:variables
}