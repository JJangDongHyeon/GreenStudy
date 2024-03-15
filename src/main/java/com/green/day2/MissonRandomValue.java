package com.green.day2;

public class MissonRandomValue {
    public static void main(String[] args) {
        //1~9 사이의 랜덤한 값 나올 수 있게 세팅
        int n1;
        n1=(int)(Math.random() * 10);
        if (n1 > 0) {
            System.out.println(n1);
        }
    }
}
