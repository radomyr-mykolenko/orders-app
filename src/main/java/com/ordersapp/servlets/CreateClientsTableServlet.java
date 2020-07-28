package com.ordersapp.servlets;

import com.ordersapp.workwith_db.ConnectDB;
import com.ordersapp.workwith_db.QueryUpdate;
import com.ordersapp.workwith_db.SqlQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/CreateClientsTableServlet")
public class CreateClientsTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ConnectDB connectDB = new ConnectDB();
            QueryUpdate queryUpdate = new QueryUpdate(connectDB);
            queryUpdate.execute(SqlQueries.CREATE_CLIENTS_TABLE);
            connectDB.stop();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Table Clients created</h3>");
        } catch (SQLException e) {
            getServletContext().getRequestDispatcher("/jsp/error_page.jsp").forward(request, response);
        }
    }
}
