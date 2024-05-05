package modele;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Materiel {
    private int idMateriel;
    private String typeMateriel;
    private LocalDate date;
    private String classe;
    private String etat;
    private String numero;
    private Connection connection;

    public Materiel(int idMateriel, String typeMateriel, LocalDate date, String classe, String etat, String numero) {
        this.idMateriel = idMateriel;
        this.typeMateriel = typeMateriel;
        this.date = date;
        this.classe = classe;
        this.etat = etat;
        this.numero = numero;
    }

    public Materiel(Connection connection) {
        this.connection = connection;
    }

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    public String getTypeMateriel() {
        return typeMateriel;
    }

    public void setTypeMateriel(String typeMateriel) {
        this.typeMateriel = typeMateriel;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void save() {
        if (connection == null) {
            System.out.println("La connexion à la base de données n'est pas établie.");
            return;
        }

        String sql = "INSERT INTO Materiel (typeMateriel, date, classe, etat, numero) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, this.typeMateriel);
            preparedStatement.setDate(2, Date.valueOf(this.date));
            preparedStatement.setString(3, this.classe);
            preparedStatement.setString(4, this.etat);
            preparedStatement.setString(5, this.numero);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Materiel inséré avec succès.");
            } else {
                System.out.println("Erreur lors de l'insertion du materiel.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Object getObject(int id) {
        Materiel materiel = null;
        String query = "SELECT * FROM Materiel WHERE idMateriel = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                materiel = new Materiel(
                        resultSet.getInt("idMateriel"),
                        resultSet.getString("typeMateriel"),
                        resultSet.getDate("date").toLocalDate(),
                        resultSet.getString("classe"),
                        resultSet.getString("etat"),
                        resultSet.getString("numero")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return materiel;
    }

    public List<Materiel> read() {
        List<Materiel> materiels = new ArrayList<>();
        String query = "SELECT * FROM Materiel";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Materiel materiel = new Materiel(
                        resultSet.getInt("idMateriel"),
                        resultSet.getString("typeMateriel"),
                        resultSet.getDate("date").toLocalDate(),
                        resultSet.getString("classe"),
                        resultSet.getString("etat"),
                        resultSet.getString("numero")
                );
                materiels.add(materiel);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return materiels;
    }

    public void update() {
        String sql = "UPDATE Materiel SET typeMateriel = ?, date = ?, classe = ?, etat = ?, numero = ? WHERE idMateriel = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, this.typeMateriel);
            preparedStatement.setDate(2, Date.valueOf(this.date));
            preparedStatement.setString(3, this.classe);
            preparedStatement.setString(4, this.etat);
            preparedStatement.setString(5, this.numero);
            preparedStatement.setInt(6, this.idMateriel);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Materiel mis à jour avec succès.");
            } else {
                System.out.println("Erreur lors de la mise à jour du materiel.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete() {
        String sql = "DELETE FROM Materiel WHERE idMateriel = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, this.idMateriel);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Materiel supprimé avec succès.");
            } else {
                System.out.println("Erreur lors de la suppression du materiel.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

   
}
