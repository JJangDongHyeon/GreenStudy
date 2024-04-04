package com.green.day16.ch7;

public interface PlayingCard {
    //public static final
        int CLOVER = 1;

        //메소드는 추상메소드만 만들 수 있음 //public abstract가 자동으로 붙음
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {
    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    } //클래스가 인터페이스르 상속 바등ㄹ때는 implements //추상메소드 때문에 빨간줄

}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        System.out.println("----끝-----");
    }
}
