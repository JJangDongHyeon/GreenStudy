package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int iCopy = i;
            System.out.printf("i = %d", iCopy);

            while (iCopy != 0) {
                int iCopymod = iCopy % 10;

                if (iCopymod % 3 == 0 && iCopymod  != 0) {
                    System.out.print("짝");
                }
                iCopy/= 10;
            }
            System.out.println();









        /*
        1~100Rkwl
        3, 6, 9 짝
        i = 1
        i = 2
        i = 3 짝
         */


        }
    }
    }

