package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "postgres";

    private Connection connection;

    public Util() {
        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Connection Failed: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to establish connection", e);
        }
    }

    // Геттеры для полей (опционально, если нужно к ним доступ)
    public static String getDbUrl() {
        return DB_URL;
    }

    public static String getDbUsername() {
        return DB_USERNAME;
    }

    public static String getDbPassword() {
        return DB_PASSWORD;
    }
}