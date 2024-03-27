package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args){
        int[] nArr1 = { 10, 20, 30 };
        int[] nArr2 = nArr1; //얕은 복사 , 주소값을 복사

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));


        boolean a = nArr1 == nArr2;
        int b = 2;
        int c = b;
        c=3;
        System.out.println(b);
    }
}
