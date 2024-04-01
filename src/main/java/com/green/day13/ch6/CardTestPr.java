package com.green.day13.ch6;

public class CardTestPr {
    public static void main(String[] args) {
        Card1[] card = new Card1[52];
        String[] cardshape = {"클로버" , "다이아" , "스페이드" , "하트"};
        Card1 mm = new Card1();
       mm.cardMake(cardshape,card);

    }
}

class Card1 {
    String shape;
    String number;

    void cardMake(String [] c,Card1[] n){
        int temp = 0;
        for(int i = 0 ; i < c.length ; i++){
            for(int z = 1 ; z <=13 ; z++){
                Card1 ca = new Card1();
                ca.shape = c[i];
                ca.number = switch (z){
                    case 1   -> "A";
                    case 11  -> "J";
                    case 12  -> "Q";
                    case 13  -> "K";
                    default  -> String.valueOf(z);
                };
                n[temp++] = ca;
            }
        }


    }





}

