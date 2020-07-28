package com.ordersapp.workwith_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
    private Connection connection = null;
    private Statement statement = null;
    private String drivername = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "root566";
    private String urlDB = "jdbc:mysql://localhost/orders_db?useUnicode=true&serverTimezone=UTC";

    public Connection getConnection() {
        try {
            Class.forName(drivername).getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(urlDB,user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void stop() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
