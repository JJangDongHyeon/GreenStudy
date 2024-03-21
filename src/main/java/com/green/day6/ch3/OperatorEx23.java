package com.green.day6.ch3;
//p.113
public class OperatorEx23 {
        public static void main(String[] args){
            String str1 = "abc";
            String str2 = new String("abc"); //new가 붙으면 새로 만드는 것
            //String str2 = "abc"; 해버리면 str1과 str2 같은 주소값을 돌려쓴느거

            System.out.println("str1: " + str1);
            System.out.println("str2: " + str2);
            System.out.println("str1 == str2: " + (str1 == str2));
            System.out.println("str1 == str2: " + (str1.equals(str2)));

            //동등성 > 지위 , 권리 , 권한
            //동일성 > 같은 인물 , 같다

        }
}
