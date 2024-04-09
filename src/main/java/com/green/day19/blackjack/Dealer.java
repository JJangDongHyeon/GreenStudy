package com.green.day19.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE = 16;

    public boolean isMoreReceiveCard() {
        int point = 0;
        for(int i = 0 ; i < cards.size() ; i++){
            point += cards.get(i).getScore();
        }
        return point<= CAN_RECEIVE;
    }

}

class DealerTest{
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("스페이드" , "A"));
        dealer.receiveCard(new Card("스페이드" , "K"));
        boolean answer = dealer.isMoreReceiveCard();
        System.out.println(answer);
    }
}
