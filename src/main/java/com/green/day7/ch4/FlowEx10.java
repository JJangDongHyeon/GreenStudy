package com.green.day7.ch4;

public class FlowEx10 {
    public static void main(String[] args) {
//        int num = (int)(Math.random()*100) + 1;
        int num = 110;
        System.out.println("원점수: " + num);
        /*
        switch 사용
        90점 이상은 "당신의 학점은 A입니다.
        80점 이상은 "당신의 학점은 B입니다.
        790점 이상은 "당신의 학점은 C입니다.
        나머지는 "당신의 학점은 F입니다.
        10의 자리 숫자를 뽑아내서 switch로 해결
         */
        if (num >100 || num <0 ) {
            System.out.println("성적을 다시 입력해주세요.");
        } else {
        String grade = switch (num / 10) {
            case 9, 10 -> "A";
            case 8     -> "B";
            case 7     -> "C";
            default    -> "F";

        };
            System.out.printf("당신의 성적은 %s입니다" , grade);

        };
    }
}
