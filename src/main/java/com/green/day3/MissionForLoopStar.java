package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args){
        int star = (int) (Math.random() * 8) + 3;//3~10 랜덤한 값이 star에 대입되도록 해주세요.
        System.out.println(star);
        for(int i = 0 ; i < star ; i++){

            System.out.print("*");

        }
        System.out.println();
        for(int i=star ; i > 0 ; i--){
            System.out.print("*");
        }



        //만약 star = 5
        //*****

        //만약 star = 10
        //*****
    }
}
