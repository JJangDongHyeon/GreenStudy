package com.green.day3;

import java.sql.SQLOutput;

public class StringEquals {
    public static void main(String[] args){
        String s1 = "안녕"; //
        String s2 = "안녕";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        System.out.println("-------------------------");

        String s3 = "hello";
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s1));

        System.out.println("-------------------------");

        String so1 = new String("안녕");
        String so2 = new String("안녕");
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so1 == so2); //문자열 비교는 equals로 !!!!!!!!!!!!!!하자!!!!!!!!!!!!!
        System.out.println(so1.equals(so2));
        System.out.println(so2.equals(so1));
        System.out.println(so2.equals(s1));
        System.out.println(so2.equals(s2));


    }
}
