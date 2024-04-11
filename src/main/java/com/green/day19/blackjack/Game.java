package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2; //게임 최초 받는 카드 수

    public void play() {
        System.out.println("========BlackJack========");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();//Gamer dealer = new Dealer(); 하면 딜러의 메소드를 사용 못함.
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        initPhase(cardDeck, gamer, dealer);
//            System.out.println("gamer: " + gamer.openCards());
//            System.out.println("dealer: " + dealer.openCards());

        playingPhase(cardDeck, gamer, dealer);

        System.out.println("결과 발표");
        rule.whoIsWinner(gamer , dealer);

    }

    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
               System.out.print("현재 카드: ");
               System.out.println(gamer.openCards());
               System.out.println("카드를 더 뽑겠습니까? 종료 >> 0 뽑기 >> 1");
        while (true) {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if(input == 0 ){
                scan.close();
                break;
            }
            gamer.receiveCard(cardDeck.draw());
            System.out.print("현재 카드: ");
            System.out.println(gamer.openCards());
            System.out.println("카드를 더 뽑겠습니까? 종료 >> 0 뽑기 >> 1");

        }
    }

        private void initPhase ( final CardDeck cardDeck, final Gamer gamer, final Dealer dealer){
            System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");
            for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
                Card c = cardDeck.draw(); //이렇게해도 되고 안해도 되고
                gamer.receiveCard(c);
                dealer.receiveCard(cardDeck.draw());
            }
            //딜러가 16점 이하면 카드 한 장 더 받을 수 있도록 처리를 해주세요.

            while (dealer.isMoreReceiveCard()) {
                dealer.receiveCard(cardDeck.draw());
            }
        }


}
