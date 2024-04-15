package com.green.day22;

import java.sql.Connection;
import java.sql.SQLException;

public class MarketTest {
    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        Connection conn = null;
        try {
            Connection com = myConnection.getConn();
        } catch (SQLException e) {
            System.out.println("SQL에러가 발생했습니다.");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("클래스에러입니다.");
            throw new RuntimeException(e);
        } finally {
            myConnection.close(conn);
        }

        System.out.println("123");
    }
}
