package com.green.day4;

public class MissionStarTriangle2 {
    public static void main(String[] args){
        int star= (int) (Math.random() * 6) + 3; // 3~8
        System.out.println(star);
        for( int i = 100 ; i <= star + 99; i++){
            for (int z=0 ; z <= i -100; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
