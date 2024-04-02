package com.green.day14.ch6;

import java.util.Arrays;

public class MyArrays {
    static void printArr(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[" + arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }

    static String toString(int[] arr) {
        if(arr.length == 0 ){ return "[]";}

        String str = "[" + arr[0]; // String.foramt("[%d" , arr[i])
        for(int i = 1; i<arr.length ; i++){
            str += ", " + arr[i]; //String.format(", %d" , arr[i])
        }
        str+= "]";
        return str;


    }
}

class MyArraysTest{
    public static void main(String[] args) {
        int[] arr = { 3 , 2 , 1 , 6 , 5 , 4, 10};
        MyArrays.printArr(arr); //[3,2,1,6,5,4,10] //배열 인트형으로 출력

        String str = Arrays.toString(arr);
        System.out.println("str: " + str); //스트링형

        String str2 = MyArrays.toString(arr);
        System.out.println("str2: " + str2);
    }
}