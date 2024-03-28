package com.green.day9.day11.ch5;

import java.util.Arrays;

//p. 214
public class MultiArrayStudy1 {
    public static void main(String[] args) {
      int[][] score = new int[3][5];


        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 10;

        System.out.println("scorelength: " + score.length);
        System.out.println("scorelength: " + score[0]);
        int[] temp = score[0];
        System.out.println("templength: " + temp.length);


        for (int i = 0 ; i < score.length; i++){
            for(int z= 0 ; z < temp.length ; z++){
                System.out.printf("%d\t" , score[i][z]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(score)); //2차원 배열은 이렇게하면 안나옴
    }
}
