package com.green.day9.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
        /*
        1.numArr 모든 방에 0~9사이의 랜덤값 넣어주세요. 중복허용
         */
        for(int i = 0 ; i < len ; i ++){
            numArr[i] = (int)(Math.random()*len);

        }
        System.out.println(Arrays.toString(numArr));
        //02. numArr 각 칸에 들어있는 값의 갯수를 counterArr에 정리한다.
        //예를들어 [8, 2, 3, 6, 3, 5, 3, 9, 8, 3]인 경우
        //counterArr[0] 에는 0
        //counterArr[1] 에는 0
        //counterArr[2] 에는 1
        //counterArr[3] 에는 4
        for (int i = 0 ; i < len ; i++){
            int val = numArr[i];
                counterArr[val]++;
        }
        System.out.println(Arrays.toString(counterArr));
    }
}
//            int num =1 ;
//            for( int z = 0 ; z < len ; z++){
//                if ( i == numArr[z]){
//                    counterArr[i]++;
//                }
//            }
//
//        }
