/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sakshi
 */
public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation_system", "root", "sakshi@18");
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred while connecting to the database.");
            System.out.println("Database error occurred: " + e.getMessage());
        }
        return conn;
    }
}

