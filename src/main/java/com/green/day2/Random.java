package com.green.day2;

public class Random {
    //1~9 사이의 랜덤한 값 나올 수있게 세팅

    public static void main(String[] args) {


        int result = (int) (Math.random() * 9) + 1;//
        System.out.println(result);

        int a;
        //5~12 사이의 랜덤한 값 나올 수있게 세팅
        for (int i = 0; i < 100; i++) {


            a = (int) (Math.random() * 8) + 5;

            System.out.println(a);
        }
    }
}