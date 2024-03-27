package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] nArr1 = { 10 , 20 , 30 , 40};
        int[] nArr2 = new int [nArr1.length];

        for (int i = 0 ; i < nArr1.length ; i++){
            nArr2[i] = nArr1[i];

        }
            nArr2[1]=2;  //얕은 복사와는 달리 nArr2의 값을 바꿔도 nArr1의 값이 바뀌지 않는다.

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));


    }
}
