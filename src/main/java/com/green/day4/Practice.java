package com.green.day4;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int input;
        int a = 0;
        while(true){
            System.out.println("숫자를 입력해주세요.");
            input = scan.nextInt();
            if(input == 10) {break;}
            a += input ;




        }
        System.out.println("최종합산:"+ a);
    }
}