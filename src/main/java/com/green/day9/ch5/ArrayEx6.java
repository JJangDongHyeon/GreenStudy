package com.green.day9.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {

        int[] score = { 79 , 88 , 91 , 33, 100 , 55 , 95};
            int min = score[0] , max = score[0];
        for ( int i = 1 ; i < score.length ; i++){ //score[0] < score[0] 비교가 되어버리니까 i= 1 부터 시작해도 됨.
                if( min > score[i]) {
                    min = score[i];
                } else if( max < score[i]) {
                    max = score[i];
                }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}

    /*
    score에서 가장 큰 값, 가장 작은 값  찾아내서 출력
    min : 33, max : 100

     */
