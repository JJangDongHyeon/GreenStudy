package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args){
        int star=(int) (Math.random() * 5.0 )+3; //3~7
            System.out.println(star);
            for(int i = 0 ; i < star ; i++ ) {
                for(int z=0 ; z <= i ; z++){
                    System.out.print("*");

                }
                System.out.println();
            }

        /*
        star = 3;
        *
        **
        ***
         */









    }
}
