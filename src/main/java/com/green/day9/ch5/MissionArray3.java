package com.green.day9.ch5;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = { 10 , 20 , 30};
        int a = 0;
        a = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = a;
        System.out.println(Arrays.toString(numArr));
        /*
        스와핑, 0번칸과 , 2번칸 스와핑
         */
    }
}
