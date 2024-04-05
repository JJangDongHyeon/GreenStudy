package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);
        System.out.println( n1  == n2 ); //레퍼런스 타입끼리의 ==비교는 주소값 비교 , 같은 객체를 가르키냐?
        System.out.println(n1.equals(n2)); // 원래 이퀄스는 주소값 비교임 근데 왜 스트링끼리는 값을 비교하냐?
                                           //오버라이딩 떄문에

    }
}

class Numbox{
    private int num;

   public Numbox(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj){//누군 ㅏ드러올수있게
       if (!(obj instanceof Numbox)) {
           return false;
       }
       Numbox numbox = (Numbox) obj;
       return this.num == numbox.num;
    }
}