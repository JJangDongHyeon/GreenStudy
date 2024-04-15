package com.green.day22;

import java.net.ConnectException;
import java.sql.*;

public class MyConnection {
    private final String DRIVER  = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {

        String url = String.format("jdbc:mariadb://%s:%s/%s" , HOST , PORT , DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url , USERNAME , PASSWORD);
        System.out.println("DB 접속완료!");
        return conn;
    }
    public void close(Connection conn , Statement state){
        if(state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }



    public void close(Connection conn){
        if(conn == null) { return; }
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close(ResultSet rs , Statement stat , Connection conn){

    }
}


