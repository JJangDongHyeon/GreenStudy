package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
        //인터페이스 Movable , 클래스 MyMove 객체 만들기 m1
        //인터페이스 Movable , Movable 객체 만들기 m2
        //move메소드 만들어서 오버라이딩  //m1.move()에는 한국으로 가자 출력 m2.move()에는 일본으로 가자 출력
        Movable m1 = new MyMove();
        m1.move();

        Movable m2 = new Movable() {//원래 인터페이스 객체화 안되는데 익명클래스는 가능
            @Override
            public void move() { System.out.println("일본으로 가자"); }
        };
        m2.move();
    }
}
interface Movable {
    void move();
}

class MyMove implements Movable{
    @Override
    public  void move(){
        System.out.println("서울까지 간다");
    }
}