package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 >>");
        int score = scan.nextInt();
        scan.close(); //다 쓰고나면 종료 시켜주면 좋음

            if(score > 100 || score < 0) {
            System.out.println("점수 입력이 잘못 됐습니다.");
        }       else { String grade = "D";
                     if (score >= 90) {grade = "A";}
                else if (score >= 80) {grade = "B";}
                else if (score >= 70) {grade = "C";}
            System.out.printf("당신의 학점은 %s입니다.", grade);
        }






    }
}
        /*
        Scanner를 통해 정수를 입력받으세요
        정수는 정수로 바로 받으시고 , grade(학점)을 관리할 문자타입을 선언해주세요.
        만약 점수가 90점 이상이면 grade에 A값을 저장하고
        만약 점수가 80점 이상이면 grade에 B값을 저장하고
        만약 점수가 70점 이상이면 grade에 C값을 저장하고
        만약 점수가 69점 이하이면 grade에 D값을 저장하고

        (출력) 당신의 학점은 ? 입니다.
         */
