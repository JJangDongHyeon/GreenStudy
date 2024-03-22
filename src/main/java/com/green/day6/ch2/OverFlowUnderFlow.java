package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 127;
        int i2 = -129;


        if (Byte.MAX_VALUE >= i) {
            byte b = (byte) i; //-128 ~ 127
            System.out.println("b: " + b);
        }
        if (Byte.MIN_VALUE <= i2) {
            byte b2 = (byte) i2;
            System.out.println("b2: " + b2);
        }

            int n3 = -1000; //n3를 byte로 형변환 할 것이다.
            //형 변환 할 수있는 값인지 체크하는 if문 작성하기


            if (Byte.MAX_VALUE >= n3 && Byte.MIN_VALUE <= n3) {
                byte n = (byte) n3; //-128 ~ 127
                System.out.println("n: " + n);}


                 byte n = (byte) n3;
                System.out.println(n3 <= Byte.MAX_VALUE && n3 >= Byte.MIN_VALUE ?
                                    "n: " + n : "값을 초과했습니다.");



    }
}
