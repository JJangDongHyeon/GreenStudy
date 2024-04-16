package com.green.day23;

import com.green.day22.MemberEntity;
import com.green.day22.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//프리페어를 쓰는게 인젝션공격을 막는데 더 유리하다
public class BuyDao {
    private MyConnection myConn;

    public BuyDao(){
        myConn = new MyConnection();
    }
    public int insBuy(BuyEntity entity){
        String sql = "INSERT INTO buy (mem_id, prod_name, group_name, price, amount) " +
                                    " VALUES (?, ?, ?, ?, ?)";




            try ( Connection conn = myConn.getConn();
                  PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1,entity.getMemId()); //첫번째 물음표에 넣을 값
                ps.setString(2,entity.getProdName());
                ps.setString(3,entity.getGroupName());
                ps.setInt(4,entity.getPrice());
                ps.setInt(5,entity.getAmount());
                System.out.println(ps);
                return ps.executeUpdate();
            } catch (Exception e) {
              e.printStackTrace();
            }
            return 0;
        }

        public int delBuy(int num){
        String sql = "DELETE FROM buy WHERE num = ?";

            try ( Connection conn = myConn.getConn();
                  PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setInt(1,num);
                System.out.println(ps);
                return ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }

        public List<BuySelVo> selBuyGroupByMemId(){ // 추가 정보를 보내 줄 필요는 없다.
            String sql = "SELECT mem_id , COUNT(mem_id) AS buy_count FROM buy GROUP BY mem_id";
            List<BuySelVo> list = new ArrayList();
            try ( Connection conn = myConn.getConn();
                  PreparedStatement ps = conn.prepareStatement(sql);
                  ResultSet rs = ps.executeQuery()){

                while(rs.next()){ //레코드 있는 수만큼 반복
                    String memId = rs.getString("mem_id");
                    int buyCount = rs.getInt("buy_count");
                    BuySelVo buySelVo = new BuySelVo(memId , buyCount);
                    list.add(buySelVo);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            return list;
        }

        public int updBuy(BuyEntity entity){//num 컬럼 제외 모든 컬럼 수정
        String sql = "UPDATE buy SET mem_id = ?" +
                " , prod_name = ?" +
                " , group_name = ?" +
                " , price = ?" +
                " , amount = ?"
                + " WHERE num = ?";
             try(Connection conn = myConn.getConn();
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, entity.getMemId());
                ps.setString(2, entity.getProdName());
                ps.setString(3, entity.getGroupName());
                ps.setInt(4, entity.getPrice());
                ps.setInt(5, entity.getAmount());
                ps.setInt(6, entity.getNum());
                System.out.println(sql);
                return ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); //Myconnection 객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("구두");
        entity.setGroupName("패션");
        entity.setPrice(300);
        entity.setAmount(3);
        int affectedRow = buyDao.insBuy(entity);
        System.out.println(affectedRow);

    }
}

class UpBuyTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); //Myconnection 객체 주소값 갖게 된다.
        BuyEntity entity = new BuyEntity();
        entity.setMemId("RED");
        entity.setProdName("배트");
        entity.setGroupName("스포츠");
        entity.setPrice(500);
        entity.setAmount(6);
        entity.setNum(14);
        int affectedRow = buyDao.updBuy(entity);
        System.out.println(affectedRow);
    }
}
class DelBuyTest{
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); //Myconnection 객체 주소값 갖게 된다.
        int affectedRow = buyDao.delBuy(15);
        System.out.println(affectedRow);
    }
}

class SelBuyGroupByMemIdTest{
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao(); //Myconnection 객체 주소값 갖게 된다.
        List<BuySelVo> list = buyDao.selBuyGroupByMemId();
        for (int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i).getMemId() + " " +  list.get(i).getBuyCount());
//            System.out.println(list.get(i));
        }


    }
}