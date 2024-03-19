package com.green.day4;

public class MissionGrade {
    public static void main(String[] args){
        int score = (int) (Math.random() * 101) ;
        System.out.println(score);
        String score2 = "F";

        if(score >= 90) {
            score2="A";
        }
            else if(score >= 80) {
            score2="B";
        }
            else if(score >= 70) {
            score2="C";
        }


        System.out.println("당신의 학점은 "+ score2 + "입니다."); // ("당신의 학점은 %s입니다.\n" , score2);
      //90점 이상은 "당신의 학점은 A입니다.
//        80점 B
//                70점 C
//                나머지 f













    }
}
