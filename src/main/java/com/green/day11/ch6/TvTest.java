package com.green.day11.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv(); //new 넣으면 새 것임 주소값이 다름
        tv.color = "red";
        tv.channel = 10;
        tv.power = true;

        System.out.printf("tv coler: %s , chnnel: %d , power: %b\n",
                            tv.color , tv.channel , tv.power);

        Tv tv2 = new Tv();
        tv2.channelUp();
        System.out.println("tv == tv2: " + (tv == tv2)); //괄호뺴면 스트링과 tv타입으로 ㅏㅂ껴서 안됨
        System.out.printf("tv2 coler: %s , chnnel: %d , power: %b\n",
                tv2.color , tv2.channel , tv2.power);


    }
}
