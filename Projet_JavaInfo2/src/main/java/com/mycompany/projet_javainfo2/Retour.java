package com.mycompany.projet_javainfo2;

import form.FormMateriels;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Retour {
    static DefaultTableModel model;
    

    public static void openRetourFenetre(){
        JFrame editionFrame = new JFrame("Enregistrement d'un retour");
        editionFrame.setSize(800,600);
        editionFrame.setLayout(null);

        JLabel titre = new JLabel("Gestion des matériels de la scolarité");
        titre.setForeground(Color.BLUE);
        titre.setFont(new Font("Arial", Font.BOLD, 24));
        titre.setBounds(170,20,450,30);
        editionFrame.add(titre);

        JLabel newSaveLabel = new JLabel("Retour de matériels");
        newSaveLabel.setForeground(new Color(0, 128, 0));
        newSaveLabel.setFont(new Font("playball",Font.BOLD,24));
        newSaveLabel.setBounds(300, 70, 200, 30);
        editionFrame.add(newSaveLabel);

        model = new DefaultTableModel();
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 150, 770, 350);
        editionFrame.add(scrollPane);

        JButton retourButton = new JButton("Retour");
        JButton fermerButton = new JButton("Fermer");
        JButton acceuilButton = new JButton("Acceuil");
        JButton retoursButton = new JButton("Afficher les emprunts");

        retourButton.setBounds(10,520,150,30);
        retourButton.setBackground(new Color(0, 128, 0));
        fermerButton.setBounds(180,520,150,30);
        fermerButton.setBackground(new Color(255, 215, 0));
        acceuilButton.setBounds(350, 520,150,30);
        acceuilButton.setBackground(new Color(173, 216, 230));
        retoursButton.setBounds(520,520,260,30);
        retoursButton.setBackground(new Color(64, 224, 208));

        //Fonctions pour les boutons
        // Ajouter un ActionListener au bouton "Retour"
        retourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String selectedID = (String) model.getValueAt(selectedRow, 0);
                    String selectedMateriels = (String) model.getValueAt(selectedRow, 3);

                    // Séparer les matériaux par ';'
                    String[] materiels = selectedMateriels.split(",");

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(materiels.length, 3));

                    java.util.List<JComboBox<String>> retourCombos = new ArrayList<>();
                    List<JComboBox<String>> etatCombos = new ArrayList<>();

                    for (String materiel : materiels) {
                        JLabel materielLabel = new JLabel("ID matériel: "+materiel);
                        panel.add(materielLabel);

                        JLabel retourLabel = new JLabel("Retourné:");
                        JComboBox<String> retourCombo = new JComboBox<>(new String[]{"","Oui", "Non"});
                        retourCombos.add(retourCombo);
                        panel.add(retourLabel);
                        panel.add(retourCombo);

                        JLabel etatLabel = new JLabel("État:");
                        JComboBox<String> etatCombo = new JComboBox<>(new String[]{"","Bon", "Mauvais", "Défectueux"});
                        etatCombos.add(etatCombo);
                        panel.add(etatLabel);
                        panel.add(etatCombo);
                    }

                    int result = JOptionPane.showConfirmDialog(editionFrame, panel, "Retour de matériel",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    //requete de mise à jour
                    try {
                        //Statement statement = db.mycon().createStatement();
                        // Création de la requête SQL avec un placeholder pour l'ID
                        String query = "UPDATE emprunts SET statut='0' WHERE idEmprunteur = ?";
                        // Préparation de la requête
                        PreparedStatement preparedStatement = db.mycon().prepareStatement(query);
                        // Remplacement du placeholder par la valeur de selectedID
                        preparedStatement.setString(1, selectedID);
                        // Exécution de la requête
                        int rowsAffected = preparedStatement.executeUpdate();

                    } catch (SQLException exception) {
                        JOptionPane.showMessageDialog(null, "Erreur! SQL", null, JOptionPane.ERROR_MESSAGE);
                    }
                    
                    if (result == JOptionPane.OK_OPTION) {
                        StringBuilder messageBuilder = new StringBuilder();
                        for (int i = 0; i < materiels.length; i++) {
                            String materiel = materiels[i];
                            String retour = (String) retourCombos.get(i).getSelectedItem();
                            String etat = (String) etatCombos.get(i).getSelectedItem();
                            messageBuilder.append("Matériel: ").append(materiel)
                                    .append(", Retourné: ").append(retour)
                                    .append(", État: ").append(etat).append("\n");
                        }
                        JOptionPane.showMessageDialog(editionFrame, messageBuilder.toString());
                        editionFrame.setVisible(false);
                        openRetourFenetre();
                    }
                } else {
                    JOptionPane.showMessageDialog(editionFrame, "Veuillez sélectionner une ligne.");
                }
            }
        });

        fermerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editionFrame.setVisible(false);
            }
        });

        editionFrame.add(fermerButton);
        editionFrame.add(retourButton);
        editionFrame.add(acceuilButton);
        editionFrame.add(retoursButton);

        afficherEmprunts();
        editionFrame.setVisible(true);
    }

    private static void afficherEmprunts() {
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Emprunteur");
        model.addColumn("Classe");
        model.addColumn("Matériels");
        model.addColumn("Date de sortie");
        //exemple de remplissage du tableau en entendant la connexion à la base de données
        // Remplir la colonne "Marquer retour" avec des exemples
         try {
            Statement statement = db.mycon().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT e.*, i.nom AS nom_emprunteur, i.prenom AS prenom_emprunteur, i.classe AS classe_emprunteur " +
                                                         "FROM emprunts e " +
                                                         "INNER JOIN emprunteur i ON e.idEmprunteur = i.idEmprunteur " +
                                                         "WHERE e.statut='1' " +
                                                         "ORDER BY e.idEmprunteur");            
            while (resultSet.next()) {
                model.addRow(new Object[]{
                        resultSet.getString(1),
                        resultSet.getString(6)+" "+resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(2),
                        resultSet.getString(4)
                });
            }
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Erreur! SQL", null, JOptionPane.ERROR_MESSAGE);
        }
        
        /*
        for (int i = 0; i < 20; i++) { // Par exemple, 10 lignes d'exemples
            JButton retourButton = new JButton("Retour");
            model.addRow(new Object[]{
                    "ID " + i,
                    "Emprunteur " + i,
                    "Matériel " + i+","+"Materiel"+i+i,
                    "Date de sortie " + i,
            });
        }
        */
    }

    public static void main(String[] args) {
        System.out.println("Hello Wordl");
        openRetourFenetre();
        
    }

   
}