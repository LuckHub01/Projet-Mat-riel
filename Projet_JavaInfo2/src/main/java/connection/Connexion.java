package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connexion {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gestion_materiel";
    private static final String USER = "root";
    private static final String PASSWORD = "";


    public Connexion() {
    }

    public Connection connect(){
        Connection connection = null;
        try {
            // Chargez le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établissez la connexion à la base de données avec le paramètre serverTimezone
            connection = DriverManager.getConnection(DB_URL + "?serverTimezone=UTC&useSSL=false", USER, PASSWORD);
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}