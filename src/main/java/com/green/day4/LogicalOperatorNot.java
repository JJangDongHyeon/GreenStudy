package com.green.day4;

import java.sql.SQLOutput;

public class LogicalOperatorNot {
    public static void main(String[] args){
        boolean r = true && true && true;
        System.out.println("!!r:" + !!r);
        System.out.println("!r:" + !r);
        System.out.println("r:" + r);
        // != 비교연산자
        // ! 논리연산자

        //togle 처리
        boolean tg = true;
        tg = !tg;
        System.out.println("tg:" + tg);
        tg = !tg;
        System.out.println("tg:" + tg);
        tg = !tg;
        System.out.println("tg:" + tg);
        tg = !tg;
        System.out.println("tg:" + tg);

        int tg2 = 0;
        tg2 = 1 - tg2;
        System.out.println("tg2:" + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg2:" + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg2:" + tg2);
    }
}
