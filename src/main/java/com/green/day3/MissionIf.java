package com.green.day3;

import java.util.Scanner;

public class MissionIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //쓸 일 잘 없음
        String man = "남" , woman = "여";
        System.out.print("성별을 입력해 주세요.(남/여) >> ");
        String gender = scan.nextLine(); //문자열 반환
        if (man.equals(gender)) { //(gender.equals("남자")라고 해도 됨 위에 man woman 초기화 안해도 됨 (문자열 비교할때만 이퀄스)
            System.out.println("당신은 남자입니다.");
        } else if ("여".equals(gender)) {//리터럴을 앞으로 빼는게 오류가 덜 남 이렇게 하는게 좋음
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("성별을 입력해주세요.");
        }

            System.out.println("-끝-");

            //지금까지 배운거로 해결!

            // 만약 "남" > "당신은 남자입니다."
            // 만약 "여" > "당신은 여자입니다."
            // 만약 "남, 여도 아니면" > "성별을 입력해 주세요,"

    }
}