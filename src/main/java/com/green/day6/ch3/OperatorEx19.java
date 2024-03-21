package com.green.day6.ch3;
// p.108
public class OperatorEx19 {
    public static void main(String[] args){

        int x = 10;
        int y = 8;
        System.out.printf("x / y =%d (몫)\n", x / y);
        System.out.printf("x %% y = %d (나머지)\n", x % y); //%%2개 적어줘야함

        int x2 = 7;
        System.out.printf("x2 / y = %d (몫)\n" , x2 / y);
        System.out.printf("x2 %% y = %d (나머지)\n" , x2 % y);

        System.out.println(10 % 8); //2
        System.out.println(-10 % 8); //-2
        System.out.println(10 % -8); //2
        System.out.println(-10 % -8); //-2   뒤쪽 부호는 의미가 없다~~~~~ 뒤쪽은 무조건 절댓값 판정 양수!!!!
    }
}
