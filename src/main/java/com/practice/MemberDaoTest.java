package com.practice;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberEnitity memberEnitity = new MemberEnitity();
        memberEnitity.setMemId("NJS");
        memberEnitity.setMemName("뉴진스");
        memberEnitity.setMemNumber(5);
        memberEnitity.setAddr("대구");
        memberEnitity.setPhone1("053");
        memberEnitity.setPhone2("09809");
        memberEnitity.setHeight(165);
        memberEnitity.setDebut_date("2020-02-02");
        System.out.println(memberDao.insertMember(memberEnitity));
    }
}
