package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args){
        int star = (int) (Math.random() * 5.0) + 2; //2~6
                System.out.println(star);
        for(int z = 0 ; z < star ; z++ ) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");

            }
                System.out.println();
        }




        /*
        star = 2
        **
        **

        star = 4
        ****
        ****
        ****
        ****

         */











    }
}
