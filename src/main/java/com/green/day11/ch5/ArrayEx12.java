package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim" , "Park" , "Yi" };
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println("tmp: " + tmp);
        //0번방의 값을 "YU"로 변경

        names[0] = "YU";
        System.out.println("names[0]: " + names[0]);

        System.out.println("-------------------");

        //일반 for 문
        for(int i = 0 ; i < names.length ; i++){
            String val = names[i];
            System.out.printf("val: %s\n" , val);

            System.out.println("-------------------");


        }
        //향상된 for문 , foreach 문
        for(String val : names){
            System.out.printf("val: %s\n" , val);
        }
    }
}
