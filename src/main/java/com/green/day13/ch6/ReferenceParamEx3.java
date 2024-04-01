package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = { 3 , 2 , 1 , 6 , 5 , 4 , 10};
        System.out.println(Arrays.toString(arr));

        printIntArr(arr);
    }
    public static void printIntArr(int [] a){
        System.out.print("[");
        for( int i = 0 ; i < a.length ; i++){
            System.out.print(i < a.length-1 ? a[i]+", " :a[i] );
        }
        System.out.println("]");
    }
}
