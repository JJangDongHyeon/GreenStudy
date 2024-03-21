package com.green.day6.ch3;
//p. 98 ~ 100
public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//        byte c = (byte) (a + b); 바이트로 하고싶다면
//        int c = a + b;
//        System.out.println(c);

        int c = 1_000_000;
        System.out.println(c);

        long e = 1_000_000 * 1_000_000; // int * int 값이 long으로 전환된것
        long f = 1_000_000 * 1_000_000L; // int * long인데 이러면 계산이 안되니까 자동으로 long * long으로 형변환됨

        System.out.println("e: " + e);
        System.out.println("f: " + f);

        double g = 10 / 3;
        double g2 = 10 / (double)3;
        System.out.println("g: " + g);
        System.out.println("g2: " + g2);

    }
}
