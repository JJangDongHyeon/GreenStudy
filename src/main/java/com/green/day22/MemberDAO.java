package com.green.day22;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private MyConnection myConn;

   public MemberDAO(){
        this.myConn = new MyConnection();
    }


   public int insMember(MemberEntity entity){
       String sql = String.format("INSERT INTO member" + "(mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date)"
                                    + " VALUES "
                                    + "('%s', '%s', '%d' ,'%s', '%s','%s','%d','%s') "
                                    , entity.getMemId() , entity.getMemName(), entity.getMemNumber() , entity.getAddr()
                                    , entity.getPhone1() , entity.getPhone2() , entity.getHeight() , entity.getDebutDate());

       System.out.println(sql);
       Connection conn = null;
       Statement stat = null;
       int result = 0;

       try {
           conn = myConn.getConn();
           stat = conn.createStatement(); //

           result = stat.executeUpdate(sql);//sql에 전송하면서 결과를 알려줌
                                            //영향받은 행 값을 리턴함
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } finally {
           myConn.close(conn , stat);
       }
       return result;
   }

   public MemberEntity selMember(String memId){
       String sql = String.format("SELECT mem_name, mem_number, addr, phone1, phone2, " +
                                 "height, debut_date " +
                                 "FROM member WHERE mem_id = '%s'", memId);
//       String sql = String.format("SELECT *" +
//               "FROM member WHERE mem_id = '%s'", memId); 어차피 다띄우는 거라 이렇게 해도 됨!!!

       System.out.println(sql);
       try(Connection conn = myConn.getConn();
           Statement stat = conn.createStatement();
           ResultSet rs = stat.executeQuery(sql)){
           if(rs.next()){
               MemberEntity entity = new MemberEntity();
                entity.setMemId(memId);
                entity.setMemName(rs.getString("mem_name"));
                entity.setMemNumber(rs.getInt("mem_number"));
                entity.setAddr(rs.getString("addr"));
                entity.setPhone1(rs.getString("phone1"));
                entity.setPhone2(rs.getString("phone2"));
                entity.setHeight(rs.getInt("height"));
                entity.setDebutDate(rs.getString("debut_date"));
               return entity;
           }
           return null;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
   }

   public List<MemberEntity> selMemberList() {
       List<MemberEntity> list = new ArrayList();
       MemberEntity me = new MemberEntity();
       String sql = "SELECT mem_id , mem_name , debut_date\n" +
               "FROM member\n" +
               "ORDER BY debut_date DESC";
       System.out.println(sql);


       try(Connection conn = myConn.getConn();
           Statement stat = conn.createStatement();
           ResultSet rs = stat.executeQuery(sql)) { //결과가 담기는 객체

           while(rs.next()){ //레코드 있는 수만큼 반복
               String memId = rs.getString("mem_id");
               String memName = rs.getString("mem_name");
               String debutDate= rs.getString("debut_date");

               MemberEntity member = new MemberEntity();
               list.add(member);
               member.setMemId(memId);
               member.setMemName(memName);
               member.setDebutDate(debutDate);
           }


       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
       return list;
   }

   int updmember(MemberEntity entity) {
       String mid = "";
       if(entity.getMemName() != null && entity.getMemName().length() > 0){
           mid += String.format(", mem_name = '%s' ", entity.getMemName());
       }
       if (entity.getMemNumber() > 0){
           mid += String.format(", mem_number = %d ", entity.getMemNumber());
       }
       if (entity.getAddr() != null && entity.getAddr().length() > 0) {
           mid += String.format(", addr = '%s' ", entity.getAddr());
       }
       if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
           mid += String.format(", phone1 = '%s' ", entity.getPhone1());
       }
       if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
           mid += String.format(", phone2 = '%s' ", entity.getPhone2());
       }
       if (entity.getHeight() > 0) {
           mid += String.format(", height = %d ", entity.getHeight());
       }
       mid =mid.substring(1);
       System.out.println(mid);
       String sql = String.format("UPDATE member SET %s WHERE mem_id = '%s'", mid, entity.getMemId());

       System.out.println(sql);
       Connection conn = null;
       Statement stat = null;
       int result = 0;

       try {
           conn = myConn.getConn();
           stat = conn.createStatement();
           result = stat.executeUpdate(sql);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } finally {
           myConn.close(conn , stat);
       }
       return result;
   }


int delete(MemberEntity entity) {

    String sql = String.format("DELETE FROM member WHERE mem_id = '%s'", entity.getMemId());

    System.out.println(sql);
    Connection conn = null;
    Statement stat = null;
    int result = 0;

    try {
        conn = myConn.getConn();
        stat = conn.createStatement();
        result = stat.executeUpdate(sql);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } finally {
        myConn.close(conn , stat);
    }
    return result;
}
}


class MemberDaoUpdateTest{
    public static void main(String[] args) {
        MemberDAO memberDao = new MemberDAO();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");
        member.setPhone1("011");
        int affectedRow = memberDao.updmember(member);
        System.out.printf("affectedRow: %d\n" , affectedRow);



    }
}

class SubStringTest{
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4,7)); //4번부터 7번 전 까지
        System.out.println(str.substring(4,5)); //4번부터 7번 전 까지
        System.out.println(str);

        String str2 = ", 안녕, 하하, 좋아요";
        System.out.println(str2.substring(2,4));
        String str3 = str2.substring(2);
        System.out.println("str3: " + str3);
        System.out.println(str2.substring(2,4) + str2.substring(6,8) + str2.substring(10,13));

        System.out.println(str2.startsWith(",")); //,로 시작하면 true
    }
}

class MemberDAOinsTest{
    public static void main(String[] args) {
        MemberDAO memberDAO = new MemberDAO();

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemId("NJS");
        memberEntity.setMemName("뉴진스");
        memberEntity.setAddr("대구");
        memberEntity.setPhone1("053");
        memberEntity.setPhone2("7777777");
        memberEntity.setHeight(166);
        memberEntity.setDebutDate("2022-10-01");
        memberEntity.setMemNumber(5);

        int affecttedRow  = memberDAO.insMember(memberEntity);
        System.out.printf("affecttedRow: %d\n", affecttedRow);

    }
}
class SelListMemberTest{
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        List<MemberEntity> list = dao.selMemberList();
        for(MemberEntity member : list){
            System.out.println(member);
        }
//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println(list.get(i));
//        }
    }
}

class MemberDelTest{
    public static void main(String[] args) {
        MemberDAO memberDAO = new MemberDAO();

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemId("NJS");
        int affectedRow = memberDAO.delete(memberEntity);
        System.out.println("affectedRow: " + affectedRow);
    }
}

class SelMemberTest{
    public static void main(String[] args) {
        MemberDAO memberDAO = new MemberDAO();
        MemberEntity memberEntity = memberDAO.selMember("WMN");
        System.out.println(memberEntity);
    }
}