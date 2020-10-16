package com.ordersapp.servlets;

import com.ordersapp.model.Order;
import com.ordersapp.workwith_db.ConnectDB;
import com.ordersapp.workwith_db.QuerySelect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ShowOrdersServlet")
public class ShowOrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Order> Orders = new ArrayList<>();
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        /*
        try {
            rs = querySelect.execute(SqlQueries.SELECT_ALL_CARS, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
               Order car = new Order(
                        rs.getShort(1),
                        rs.getShort(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5)
                );
                cars.add(car);
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
