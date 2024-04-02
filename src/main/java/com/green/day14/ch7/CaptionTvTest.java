package com.green.day14.ch7;
//자식이 부모보다 더 작아질 수 있나요? xx 불가능
//자바는 다중상속 안됨
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;    //원래 CaptionTv에는 없지만 상속받아서 사용이 가능
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        System.out.println("cTv.channel: " + cTv.channel);
        cTv.caption = true;
        cTv.displayCaption("dddddddd");
    }
}

class Tv{
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }

}
class CaptionTv extends Tv{ //extends가 확장의 명령어.Tv로 확장한다.
                            //Tv가 가지고 있는걸 상속받는다.
        boolean caption;

        void displayCaption(String text){
            if(caption) {
                System.out.print(text);
            }
        }
}
//VideoTv와 CaptionTv는 같은 부모에게서 상속받았지만 전혀 관계가 없다.
class VideoTv extends Tv{

}