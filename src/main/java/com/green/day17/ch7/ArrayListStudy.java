package com.green.day17.ch7;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {

        Object obj = 10;
        obj = "하하하하하하하하ㅏ하ㅏ";
        obj = 11.1;

        ArrayList list = new ArrayList();//ArrayList는 범용적으로 만들어짐 문자열 정수 실수 다들어감
        // 그래서 넘ㅇ올때 object 타입으로 넘어옴
        list.add(10); //0번방에 값이 대입
        list.add(20); //1번방에 값이 대입
        list.add(30); //2번방에 값이 대입
        list.add("하하하하하"); //문자열
        list.add(11.23); //실수


        int r = (int)list.get(0);
            r = (int)list.get(1);
            r = (int)list.get(2);
//            r = (int)list.get(3); //3번방에 문자열 있었기 떄문에 오류
        System.out.println(r);
        System.out.println("----종료----");
    }
}
