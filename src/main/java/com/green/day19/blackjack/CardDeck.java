package com.green.day19.blackjack;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {//static이 붙으면 인스턴스 멤버필드 , 메소드 사용 불가
    public static final String[] PATTERNS = {"스페이드", "하트", "다이아몬드", "클로버"};
    public static final int CARD_COUNT = 13;
    private List<Card> list;

    public CardDeck() {
        list = new ArrayList();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int z = 1; z <= CARD_COUNT; z++) {
                String denomination = getDenomination(z);
                Card c = new Card(PATTERNS[i], denomination);
                list.add(c);
            }
        }
    }

    private String getDenomination(int num) {
        return switch (num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(num);
        };
    }

    public void showCards() {
        for (Card c : list) {
            System.out.println(c);
        }
    }


    public Card draw() {
        int rIdx = (int) (Math.random() * list.size());

        return   list.remove(rIdx);
//        Card c = list.get(rIdx);
//        list.remove(rIdx);
//        return c;

    }
}
class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        // 기본생성자에서 PATTERS, CARD_COUNT를 활용하여
        //52장의 객체를 생성하여 list에 추가해 주세요.
        cd.showCards();

        Card c =cd.draw(); //랜덤한 카드 객체 주소값 리턴
        System.out.println("c: " + c);
        System.out.println("c: " + cd.draw());
        cd.showCards();
    }
}
