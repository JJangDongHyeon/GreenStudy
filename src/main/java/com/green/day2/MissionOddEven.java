package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {


        //--num 만약 5라면 --
        //콘솔에 출력이 "5는 홀 수입니다."

        //예를 들어 num이 만약 10이라면 출력 "10는(은) 짝수입니다."
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 10) + 1; //1~10
            if (num % 2 > 0) {
                System.out.println(num + "는(은) 홀수입니다.");
            } else {
                System.out.println(num + "는(은) 짝수입니다.");
            }
        }
    }
}
