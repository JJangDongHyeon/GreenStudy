package com.green.day19;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
       String[] strArr = str.split(" ");//빈칸 기준으로 나누고 싶다.
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        int[] intArr = new int[strArr.length];
        for(int i = 0 ; i < strArr.length ; i++){
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(intArr));
    }
}
