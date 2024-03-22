package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
         /*
         무식하게 해결 요망!!!
         Scanner를 통해 정수를 입력받으세요
        점수는 정수로 바로 받으시고 , grade(학점)을 관리할 문자타입을 선언해주세요.
        symbol(+-0) 저장할 문자타입 선언해주세요.
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        1점대가 0~2 -
               3~6 0
               7~9 +
               나머지 c학점 오로지 c학점
        (출력) 당신의 학점은 ? 입니다.
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 >> ");
        int score = scan.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
            String grade = switch (score / 10) {
                case 10, 9 -> "A";
                case     8 -> "B";
                default    -> "C";
            };

            String grade2 = switch (score % 10) {
                case 0, 1, 2    -> "-";
                case 3, 4, 5, 6 -> "0";
                default         -> "+";
            };
            System.out.printf(grade.equals("C") ?
                              "당신의 학점은 C입니다." : "당신의 학점은 %s%s입니다.", grade, grade2);
        }

    }









    }


