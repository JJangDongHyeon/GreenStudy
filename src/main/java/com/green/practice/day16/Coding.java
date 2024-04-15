package com.green.practice.day16;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public static void main(String[] args) {
        Integer[] numbers = { 1 , 3 , 4 ,5 ,6 ,7};
        String[] str = { "1" , "3" , "4" ,"5" ,"6" ,"7"};
        Solution s = new Solution();
//        System.out.println(s.solution(numbers));
//        Stream<Integer> n = Arrays.stream(numbers);
//        System.out.println(Arrays.stream(numbers).average().orElse(0));


    }
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}

//        boolean b = (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100);
//        if(b){
//            answer = num1 / num2;
//        } else {
//            System.out.println("양수를 입력해주세요");
