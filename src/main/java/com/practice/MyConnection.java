package com.practice;

import java.net.ConnectException;
import java.sql.*;
/*
Connection : DB와 연결성을 갖는 인터페이스
Statement : SQL문을 실행하는 인터페이스
ResultSet: 조회된 결과 데이터를 갖는 인터페이스

 */
public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306"; //3306은 기본포트라 생략해도 상관없음
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        //커넥션 클래스는 db와 연결할때 쓰임
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD); //getConnection의 리턴타입은 커넥션
        System.out.println("DB 접속완료!");
        return conn;
    }
}
