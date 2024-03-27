package com.green.day9.ch5;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0 ;
               double i = 0;
        while(true) {
            System.out.print("정수를 입력하세요:");
            int input = scan.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
            i++;
        }
            System.out.printf("합계는 %d입니다.평균은 %.2f입니다." , sum , sum/i );

    }
}
