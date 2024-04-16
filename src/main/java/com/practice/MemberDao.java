package com.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDao {
    private MyConnection myConn;

    MemberDao(){
        this.myConn = new MyConnection();
    }

    public int insertMember(MemberEnitity enitity){
        String sql = "INSERT INTO member" +
        " VALUES"  + "(?, ?, ?, ?, ?, ?, ?, ?)";

//        String sql = "INSERT INTO buy (mem_id, prod_name, group_name, price, amount) " +
//                "(mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date)" +
//                " VALUES (?, ?, ?, ?, ?)"; 이렇게 해도됨
        try (Connection conn = myConn.getConn();
             PreparedStatement pr = conn.prepareStatement(sql)){
            pr.setString(1, enitity.getMemId());
            pr.setString(2, enitity.getMemName());
            pr.setInt(3, enitity.getMemNumber());
            pr.setString(4, enitity.getAddr());
            pr.setString(5, enitity.getPhone1());
            pr.setString(6, enitity.getPhone2());
            pr.setInt(7, enitity.getHeight());
            pr.setString(8, enitity.getDebut_date());
            System.out.println(pr);
            return pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }




}
