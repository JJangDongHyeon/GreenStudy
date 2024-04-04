package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args){
        BullDog bulldog = new BullDog();


        boolean r = bulldog instanceof Dog; //인스턴스오브 왼쪽에는 레퍼런스변수 오른쪽에는 클래스
        System.out.println("r: " + r);       //왼쪽에 있는 객체가 오른쪽으로 형변환이 가능하냐? > 가능하면 true

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog));

        ani = new BullDog();
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog));


    }
}
