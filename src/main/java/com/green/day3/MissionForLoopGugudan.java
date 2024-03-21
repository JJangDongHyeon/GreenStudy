package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args){
        int dan = (int) (Math.random() * 8.0)+2; //2~9 랜덤ㄱ밧
        System.out.println("구구단 " + dan + "단");
        for(int i = 1 ; i<10 ; i++ ){
//            System.out.println(dan + " X " + i + " = " + (dan * i) + " ");
            System.out.printf("%d X %d = %d\n", dan, i, (dan * i));


        }



    }
}
