package com.green.day9.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80 }
                , {20, 25, 35,}
                , {30, 30, 30,}
                , {40, 40, 40,}
        };
                int sum = 0 ;
                for (int i = 0 ; i < score[0].length ; i++){
                    for ( int z= 0 ; z < score.length ; z++){
                        sum += score[z][i];
                    }
                    System.out.printf("%d열 합계:%d %d열평균: %.2f\n" , i , sum , i , (double)(sum)/ score.length  );
                    sum = 0;
                }
    }
}
//        int[] score0 = score[0];
//        int[] score1 = score[1];
//        int[] score2 = score[2];
//        int[] score3 = score[3];
