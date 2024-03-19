package com.green.day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        int input; //
        int a= 0;
        while(true) {//
            System.out.print("숫자를 입력해 주세요. (종료:0) >> ");

            input = scan.nextInt();
            if(input == 0) {break;}
            a = a + input;
            System.out.println("더한 값:" + input);
            System.out.println("중간합산:" + a);
            //if(input == 0) {break;}

        }
        System.out.println("최종 합산:" + a);

    }
    }
