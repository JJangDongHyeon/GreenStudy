package com.green.day16.ch7;

public interface PlayingCard {
    //public static final //인터페이스는 앞에 이게 항상 붙음
        int CLOVER = 1;

        //메소드는 추상메소드만 만들 수 있음 //public abstract가 자동으로 붙음
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard { //클래스가 인터페이스를 상속받을떈 implements 를 사용
    //이러면 추상 메소드를 구현해야할 의무가 생김
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
    public static void main(String[] args) { //PlayCard는 PlayingCard에도 DeepPlayingCard에도 담길 수 있음
        PlayingCard pc = new PlayCard();      //자기가 알고있는 메소드만 호출 가능 PlayCard는 두개를 알공 ㅣㅆ지만
        pc.getCardNumber();                         //PlayingCard는 하나만 알기때문에 pc는 getCardNumber() 만 호출 가능
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        System.out.println("----끝-----");
    }
}
