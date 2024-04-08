package com.green.practice.day16;

public class Coding {
    public static void main(String[] args) {
        Solution ad = new Solution();
        System.out.println(ad.solution(10 , 2));
    }
}
class Solution {
    public int solution(int num1, int num2) {
        double answer1 = (double)(num1) / (num2);
        answer1*=1000;
        int answer2 = (int)answer1;
        return answer2;
    }
}
//        boolean b = (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100);
//        if(b){
//            answer = num1 / num2;
//        } else {
//            System.out.println("양수를 입력해주세요");
