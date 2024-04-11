package com.green.day19.blackjack;

public class Rule {
        void whoIsWinner(Gamer gamer , Dealer dealer){
            int baseScore = 21;
            boolean gamerUnderBaseScore = baseScore >= getPoint(gamer);
            boolean gamerUpperBaseScore = baseScore < getPoint(gamer);
            boolean dealerUnderBaseScore = baseScore >= getPoint(dealer);
            boolean dealerUpperBaseScore = baseScore < getPoint(dealer);


//            if((getPoint(gamer) == getPoint(dealer)) ||
//                    gamerUpperBaseScore && DealerUpperBaseScore){
//                System.out.println("비겼습니다.");
//            }
//             if((gamerUpperBaseScore && DealerUnderBaseScore)){
//                System.out.println("딜러의 승리입니다..");
//              }   if (gamerUnderBaseScore && DealerUnderBaseScore){
//                if(getPoint(dealer) > getPoint(gamer)){
//                    System.out.println("딜러의 승리입니다.");
//                }
//            }
//              if(gamerUnderBaseScore && DealerUpperBaseScore){
//                  System.out.println("게이머의 승리입니다.");
//              } if (gamerUnderBaseScore && DealerUnderBaseScore){
//                  if(getPoint(dealer) < getPoint(gamer)){
//                      System.out.println("게이머의 승리입니다.");
//                  }
//            }
            if((getPoint(gamer) == getPoint(dealer)) ||
                    (gamerUpperBaseScore && dealerUpperBaseScore)){
                System.out.println("비겼습니다.");
            } else if(gamerUpperBaseScore || dealerUnderBaseScore && (getPoint(gamer) < getPoint(dealer))){
                System.out.println("딜러의 승리입니다.");//일단 딜러의 승리 조건을 다 적고 else 적으면 게이머의 승리바께 안남음
            } else {
                System.out.println("게이머의 승리입니다.");
            }
            System.out.println("딜러의 카드: " + dealer.openCards());
            System.out.println("게이머의 카드: " + gamer.openCards());
        }

        public int getPoint(Gamer gamer){
            int point = 0;
            for(int i = 0 ; i < gamer.cards.size() ; i++){
                point += gamer.cards.get(i).getScore();
            }
            return point;
        }

//        public int dealerPoint(Dealer dealer){
//            int point = 0;
//            for(int i = 0 ; i < dealer.cards.size() ; i++){
//                point += dealer.cards.get(i).getScore();
//            }
//            return point;
//        }
}
