package com.green.day4;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //삼항식, 조건식
        // 식 ? true일 때 : false일 때;
        int num = (int) (Math.random() * 10) + 1;
        String s = "짝";

        s = 10 % 2 == 0 ? "짝" : "홀";

        System.out.println(num + s);
    }
}