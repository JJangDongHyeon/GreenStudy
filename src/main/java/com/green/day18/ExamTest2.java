package com.green.day18;

public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugudan(2,4);
        /* 2 x 1 = 2  \t   3 x 1 = 3  \t  4 x 1 = 4 \n

         */
      int sum =  Exam2.getSumFromString("1"); //2 + 3 + 2 + 2 + 3 값 리턴
        System.out.println("sum: "+ sum);
    }
}

class Exam2{
    public static void printGugudan(int sNum , int eNum) {
        for (int i = 1; i < 10; i++) {
            for (int j = sNum ; j <= eNum; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * i );
            }
            System.out.println();
        }
    }

    public static int getSumFromString(String val){
        int valNum = Integer.parseInt(val);
        int sum = 0 ;
        while(valNum>0){
            int oneDigit = valNum % 10;
           sum+= oneDigit;
           valNum/=10;
//        if(valNum == 0){ break;}
        }
        return sum;
    }
}

