package com.green.day5.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        char c = 'A';
        int finger = 10;
        //리터럴 정수는 int 타입
        //long타입 리터롤로 변경하려면 끝에 l, L 붙이면 된다.
        long big = 100_000_000_000L;

        System.out.printf("c=%c, %d\n", c, (int)c); //%c = 캐릭터 %d =정수 %s=문자열 %f= 실수값
        System.out.printf("finger=[%5d]\n", finger); //%와d사이에 숫자는 차지하는 칸 수
        System.out.printf("finger=[%-5d]\n", finger);// -를 주면 왼쪽 정렬
        System.out.printf("finger=[%05d]\n", finger);//빈칸을 0으로 채우겠다.
        System.out.println(big);

        //yyyy-mm-dd
        int year = 2024;
        int mon = 3 ;
        int day = 20;
        System.out.printf("%4d-%02d-%02d\n" , year , mon , day);

        String url = "www.green.com";
        float f1 = 0.10f; //0.10f 와 동일
        //리터럴 실수는 double타입이어서 f붙여야함
        //
        double d = 1.23456789;

        System.out.printf("url=%s\n", url);
        System.out.printf("f1=%f\n", f1);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=%.2f\n", d); //반올림 처리 됨
        System.out.printf("d=%10.2f\n", d); //반올림 처리 됨
        System.out.printf("d=%010.2f\n", d); //반올림 처리 됨

        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
