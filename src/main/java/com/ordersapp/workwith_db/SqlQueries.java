package com.ordersapp.workwith_db;

public class SqlQueries {
    public static final String CREATE_CLIENTS_TABLE = "CREATE TABLE IF NOT EXISTS clients (" +
            "id SMALLINT NOT NULL AUTO_INCREMENT," +
            "name VARCHAR(30) UNIQUE NOT NULL DEFAULT 'noname'," +
            "PRIMARY KEY (id)" +
            ");";
    public static final String CREATE_USERS_TABLE = "CREATE TABLE IF NOT EXISTS users (" +
            "id SMALLINT NOT NULL AUTO_INCREMENT," +
            "name VARCHAR(30) NOT NULL DEFAULT 'noname'," +
            "email VARCHAR(35) UNIQUE NOT NULL DEFAULT 'absent'," +
            "password VARCHAR(20) NOT NULL DEFAULT 'empty password'," +
            "PRIMARY KEY (id)" +
            ");";
    public static final String INSERT_CLINETS_TO_TABLE = "INSERT INTO clients (name)" +
            "VALUES" +
            "('Epicenter')," +
            "('Nova linia')," +
            "('Leroy Merlin')," +
            "('Auchan')," +
            "('Rozetka');";
}
