package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] number = new int[3];
        for (int i = 0 ; i < number.length ; i++){
            number[i] = i+10;

        }
        System.out.println(Arrays.toString(number));
        for (int i = 0 ; i < number.length ; i++){
            int ran = (int)(Math.random()*number.length) , blank = 0;
            System.out.println("현재 i 값 : " + i + "바꿀 값: " + ran );
            blank = number[ran];
            number[ran] = number[i];
            number[i] = blank;
            System.out.println(Arrays.toString(number));
        }
            System.out.println("최종: " +Arrays.toString(number));



    }
}
