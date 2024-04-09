package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards; //딜러에서 바로 이용할수 있도록 프로텍티드

    public Gamer(){
        cards = new ArrayList();
    }

    public void receiveCard(Card c){
        cards.add(c);
    }

    public List<Card> openCards() {
        return cards;
    }
}

class GamerTest{
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        Card c = new Card("스페이드" , "9");
        gamer.receiveCard(c);  //밑이랑 같은 의미
        gamer.receiveCard(new Card("하트" , "2"));

        List<Card> cards = gamer.openCards();
    }
}
