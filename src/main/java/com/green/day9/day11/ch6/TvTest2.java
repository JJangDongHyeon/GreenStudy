package com.green.day9.day11.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.channel = 10;
//        tv = new Tv();
//        System.out.println(tv.channel);


        Tv  tv2 =  tv;
        tv2 = new Tv();


        System.out.println(tv2.channel);
    }
}
