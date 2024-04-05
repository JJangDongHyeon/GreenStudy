package com.green.day17.ch7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
//        int i1 = 10;
//        Integer i2 = 10;
//        System.out.println( i1 == i2 );
//        double d1 = 10.3;
//        Double d2 = 10.7;

        List<Integer> list = new ArrayList(); //primitive타입은 안들어감 //레퍼클래스는 primitive타입의 객체형
        //상속관계

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0); //0번방 제거
        System.out.println(list);
        //list.add("우우우");
        int r1 = list.get(0);
        int r2 = list.get(1);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println(list);

        for(int i = 0; i < list.size() ; i++){
            System.out.printf("list.get(%d) >> %d\n" , i , list.get(i));
        }



    }
}
