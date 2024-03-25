package com.green.day8;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력하세요 >>");
        int num = scan.nextInt();
        for(int i=0 ; i <num ; i++){
            for(int z=0 ; z <=i ; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
        /*
            Scanner를 이용하여 정수를 입력 받는다.
            가이드내용 "*을 출력할 라인의 수를 입력하세요 >>"

            만약 정수값이 3이라면
            *
            **
            ***

            만약 정수값이 5라면
            *
            **
            ***
            ****
            *****
         */
