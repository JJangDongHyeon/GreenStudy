package com.green.day14.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printAllCard();
        System.out.println(deck.cards[0]);

    }
}

class Deck {
    final int CARD_NUM;
    Card[] cards;


    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];

    }

    void printAllCard() {
        int temp = 0;
        String[] shape = {"스페이드", "클로버", "다이아", "하트"};
        for (int i = 0; i < shape.length; i++) {
            for (int z = 1; z <= 13; z++) {
                Card a = new Card();
                a.kind = shape[i];
                a.number = switch (z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                cards[temp++] = a;
            }
        }
        for (Card c : cards) {
            System.out.println(c);
        }

    }
}


    class Card {
        String kind;
        String number; // 번호(A , 2~10 , J , Q , K)

        @Override
        public String toString() { //원래 모든 클래스에는 toString이 들어감.
            return String.format("%s(%s)", kind, number);  //this.kind , this.number 라고 생각하면 됨
        }

    }
