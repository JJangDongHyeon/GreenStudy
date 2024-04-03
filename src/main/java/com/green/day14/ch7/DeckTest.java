package com.green.day14.ch7;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();

//        deck.shuffle(deck.cards);
        Card c = deck.pick();
        System.out.println(c);

        Card c2 = deck.pick(5);
        System.out.println(c2);

        deck.shuffle();
        deck.printAllCard();
    }
}

class Deck {
    final int CARD_NUM;
    Card[] cards;


    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        int temp = 0;
        String[] shape = {"스페이드", "클로버", "다이아", "하트"};
        for (int i = 0; i < shape.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String number =  switch (z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                Card a = new Card(shape[i] , number);
                cards[temp++] = a;
            }
        }
    }

   Card pick() {
        int rIdx = (int)(Math.random()*cards.length);
        Card c = cards[rIdx];
        return  c;
    }
    Card pick(int idx) {
        Card c = cards[idx];
        return  c;
    }
//    void shuffle(Card[] cards) {
//        System.out.println("원본값: " + Arrays.toString(cards));
//
//        for (int i = 0; i < cards.length; i++) {
//            int random = (int) (Math.random() * cards.length);
//            Card temp = cards[i];
//            cards[i] = cards[random];
//            cards[random] = temp;
//        }
//        for (Card c : cards) {
//            System.out.println(c);}
////        System.out.println("셔플 후값: " + Arrays.toString(cards));
//    }
    void printAllCard() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    void shuffle(){
        for(int i = 0 ; i < cards.length ; i++){
            int random =(int)(Math.random()* cards.length);
            if( i == random) { continue; }
            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }
}


    class Card {
        String kind;
        String number; // 번호(A , 2~10 , J , Q , K)

        Card(String kind , String number) {
            this.kind = kind;
            this.number = number;
        }

        @Override
        public String toString() { //원래 모든 클래스에는 toString이 들어감.
            return String.format("%s(%s)", kind, number);  //this.kind , this.number 라고 생각하면 됨
        }

    }
