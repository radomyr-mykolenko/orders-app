package com.ordersapp.workwith_db;

public class SqlQueries {
    public static final String CREATE_CLIENTS_TABLE = "CREATE TABLE IF NOT EXISTS clients (" +
            "id SMALLINT NOT NULL AUTO_INCREMENT," +
            "name VARCHAR(30) NOT NULL DEFAULT 'noname'," +
            "PRIMARY KEY (id)" +
            ");";
}
