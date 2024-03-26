package com.green.day9;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[14]; //0~99번방 0으로 채워져있음
        System.out.println(numArr.length);

        for(int i = 0 ; i < numArr.length ; i++){
        numArr[i]= i+1;

        }
        for(int i = 0 ; i < numArr.length ; i++){
            System.out.printf("numArr[%d]: %d\n " ,i,  numArr[i]);
        }
        System.out.println(Arrays.toString(numArr));
    }
}
