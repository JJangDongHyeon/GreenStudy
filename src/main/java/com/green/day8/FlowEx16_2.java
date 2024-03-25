package com.green.day8;

public class FlowEx16_2 {
    public static void main(String[] args){
        int star = 5;
        for(int i = 0 ; i < star ; i++){
            for(int z = 0; z < star ; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*star 값이 5라면 별을 5개 가로로 5줄 출력한다.
        */
    }
}
