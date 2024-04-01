package com.green.day13.ch6;

public class CardTest {
    public static void main(String[] args) {
        //카드객체 52개
        //shape = 클로버 , 하트 , 다이아몬드 , 스페이드
        //숫자 = A , 2 , 3 , 4 , 5, 6, 7, 8, 9,10 ,J , Q, K
        Card[] card = new Card[52];
        String shape[] = { "클로버" , "하트" , "다이아몬드" , "스페이드"};
        int idx = 0; //&[Id2141, &[Id2142
        for(int i = 0 ; i < shape.length ; i++){
            for(int z = 1 ; z <= 13 ; z++){
               Card c = new Card(); // Card c = &[Id2141;
//                card[idx++] = c; 이렇게 해도 차이 업음
                card[idx++] = c; // CARD[IDX++] = &[Id2141;
               c.shape = shape[i]; // &[Id2141.shape = shape[0]
               c.number = switch (z){
                   case 1 -> "A";
                   case 11 -> "J";
                   case 12 -> "Q";
                   case 13 -> "K";
                   default -> String.valueOf(z);
               };

            }

        }
        System.out.println("-----------");
        System.out.println(card[1]);
        for(Card c : card) {
            System.out.printf("%s(%s)\n" , c.shape , c.number);
        }
        }

    }

