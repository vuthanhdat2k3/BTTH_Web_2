package com.demo.demo.context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/th2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "19052003";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
