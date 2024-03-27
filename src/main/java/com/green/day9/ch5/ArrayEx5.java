package com.green.day9.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100 , 100 , 90};
        int sum = 0;

        for ( int i = 0 ; i < score.length ; i++){
            sum+= score[i];
        }
        double average = (double)sum/score.length;
        System.out.println("총점: " + sum + "평점: " + average );


    /*
    학생들의 국어 점수입니다.
    총점과 평점 출력해주세요.
    포맷은 자유.

     */

    }
}