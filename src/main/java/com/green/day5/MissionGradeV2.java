package com.green.day5;

public class MissionGradeV2 {
        public static void main(String[] args) {
            //int score = -10~120 사이의 랜덤 정수값
//            0~10= 11 (10-0 + 1)
//                1~10 = 10 ( 10-1 +1 )
//                -1~3 = 5 ( 3 --1  +1 )
//            0~0 = 0-0 + 1 = 1
////            int score = 97;
//            (120 - -10 +1 )
//            int score = (int) (Math.random() * 131.0) +(-10);
            int score=-3;
            System.out.println("점수: " + score);
            int val1 = score / 10;
            int val2 = score % 10;

                String grade = switch (val1) {
                    case 10 -> "A+";
                    case 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> "F";
                };

                String grade2 = switch (val2) {
                    case 7, 8, 9 -> "+";
                    case 0, 1, 2 -> "-";
                    default -> "0";
                };

                String result = "당신의 학점은" + grade + grade2 + "입니다.";
                String result2 = "당신의 학점은 F입니다.";
                String result3 = "당신의 학점은 A+입니다.";
                String result4 = "점수가 잘못되었습니다.";

              if (score > 100 || score < 0){
                    System.out.println("점수가 잘못되었습니다.");
            }   else if (grade.equals("F")){
                    System.out.println(result2);
              } else if (grade.equals("A+")) {
                    System.out.println(result3);
              } else {
                    System.out.println(result);
              }

                System.out.println("--- 종료 ---");
                //score 값이 0~100 사이의 값이 아니면 "점수가 잘못되었ㅅ브니다." 출력 > 끝!

                //10의 자리 숫자가
                //10 , 9 > A
                //     8 > B
                //     7 > C
                //     6 > F

                //1의 자리 숫자가
                //0~2 -
                //3~6 0
                //7~9 +

                //단 , F는 +-0가 없음 무조건 "F", 100점은 A+



        }
}
