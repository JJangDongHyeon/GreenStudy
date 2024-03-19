package com.green.day4;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        if (true && true && true) { //and 연산자
            System.out.println("true && true && true");

        }


        boolean r = true && true && true;
        System.out.println("r:" + r);

        boolean r2 = true && true && true && false; //%%는 중간에 false만나면 뒤에거 싹 무시
        System.out.println("r2:" + r2);

        boolean r3 = true & true & true & true; //&는 중간에 false만나도 뒤에거 다 계산해봄
        System.out.println("r3:" + r3);

        boolean r4 = true & true & true & false;
        System.out.println("r4:" + r4);
    }
}










