package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        /*
        1~100 사이의 랜덤값을 만들어내고 랜덤값을 맞추는 게임
        1~100사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > "Up"
        입력한 숫자보다 정답이 작다 > "Down"
        맞출때까지 반복한다.
         */
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("정답:" + randomNumber);
        System.out.println("1~100사이의 정수를 입력하세요 >>");
        while (true) {
            int input = scan.nextInt();
            if (input == randomNumber) {
                scan.close();
                break;
            }
            if (input > 100 || input < 0) {
                System.out.println("숫자를 다시 입력해주세요.");
                }

                else {
                System.out.println(input > randomNumber ? "Down" : "Up");
            }


        }
            System.out.println("성공!!");

    }
}