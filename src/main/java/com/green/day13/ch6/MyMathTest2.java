package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
       long r =  MyMath2.add( 100 , 200);
        System.out.println("r: " + r);

        MyMath2 myMath2 = new MyMath2();
        long r2 = myMath2.add();
        System.out.println("r2: " + r2);
    }
}

class MyMath2 {
    long n1, n2;

    long add() {
        System.out.println("call add()");
        add(10 , 20);
        return n1 + n2;
    }


    static long add(long n1, long n2) {
        System.out.println("call add(n1 , n2)");
        return n1 + n2;
    }
}