package com.green.day2;

public class If {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20 , n3=30;
        if (n1 > n2) {
            System.out.println("n1이 n2보다 초과값입니다.");
        } else {
            System.out.println("n1이 n2보다 미만값입니다.");
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        n2 = 10;
        if (n1 < n2) {
            System.out.println("n2가 큼");
        } else if (n1 > n2) {
            System.out.println("n1이 큼");

        } else {
            System.out.println("같음!!!!!!!!!");
        }
    }
}