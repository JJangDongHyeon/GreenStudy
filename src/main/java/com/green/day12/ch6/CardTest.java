package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        System.out.println(c1.width);
        System.out.println(Card.height);//static이 붙으면 객체화 없이 사용 가능

        c1.width = 110;

        System.out.println(c1.width);

        //Card.kind = " " ;
        c1.kind = "Heart";
        c1.number = 7;

        System.out.printf("c1.kind: %s c1.number: %d \n" , c1.kind , c1.number);
        System.out.println(c1.width);
        System.out.println(c1.height);//사용은 되나 지양.  static 타입은 Card.height 이렇게 사용
        System.out.println("----------------");

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        c2.height = 200;

        System.out.printf("c2.kind: %s , c2:number: %d\n",
                            c2.kind , c2.number);
        System.out.println("c2.width: " + c2.width); // static을 안쓰면 객체마다 변수가 달라짐
        System.out.println("c2.height: " + c2.height); //사용은 되나 지양. static 타입은 Card.height 이렇게 사용
        System.out.println("c1.height: " + c1.height); //static을 쓰면 값이 다 또같아짐
    }
}
