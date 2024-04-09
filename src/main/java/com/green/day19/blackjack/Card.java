package com.green.day19.blackjack;

public class Card {
    private String pattern;  //무늬 , 하트 다이아 스페이드
    private String denomination; // A , 2~10 , J , Q , K


   public Card( String pattern , String denomination){
        this.pattern      = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination(){
       return this.denomination;
    }
    @Override
    public String toString(){
       return String.format("%s(%s)" , this.pattern , this.denomination);
    }

    public int getScore(){
       int score = switch (this.denomination){
           case "A"             -> 1;
           case "J" , "Q" , "K" -> 10;
           default              -> Integer.parseInt(this.denomination);
       };
       return score;
    }



}

class CardTest{
    public static void main(String[] args) {
        Card c = new Card("스페이드" , "A");
        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c); // 스페이드(A);

        int score = c.getScore(); //1

    }
}


