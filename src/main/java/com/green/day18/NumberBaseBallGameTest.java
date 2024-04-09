package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(3);
        game.showArr();
        game.start();
    }
}

class NumberBaseBallGame {
    static final int MIN_NUMBER = 1;
    static final int DEFAULT_NUMBER = 3;
    static final int MAX_NUMBER = 9;
    final int NUMBER_COUNT;
    private int[] numArr;

    NumberBaseBallGame(final int NUMBER_COUNT) {
        if (NUMBER_COUNT < MIN_NUMBER || NUMBER_COUNT > MAX_NUMBER) {
            this.NUMBER_COUNT = DEFAULT_NUMBER;
        } else {
            this.NUMBER_COUNT = NUMBER_COUNT;
        }
        this.init();
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("숫자를 %d개 입력해주세요. (구분은 스페이스) >> ", NUMBER_COUNT);
            String strAnswer = scan.nextLine(); // 3 7 9
            String[] answerStrArr = strAnswer.split(" ");
            int[] answerArr = new int[answerStrArr.length];
            for (int i = 0; i < answerStrArr.length; i++) {
                answerArr[i] = Integer.parseInt(answerStrArr[i]);
            }
            if(numArr.length != answerStrArr.length){
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            int strike = 0 , ball = 0;
            for(int i = 0 ; i < numArr.length ; i++) {
                if (numArr[i] == answerArr[i]) {
                    strike++;
                }  //else 넣든가 앤드 연산자 쓰든가
                    for (int z = 0; z < numArr.length; z++) {
                        if (numArr[i] == answerArr[z]&& i != z) {
                            ball++;
                        }
                    }

            }
                System.out.printf("스트라이크:%d\t볼:%d\t아웃:%d\n", strike, ball, (NUMBER_COUNT - (strike + ball)));
                if (strike == NUMBER_COUNT) {
                    System.out.println("정답!!!!");
                    break;
                }

//        scan.close();
        }
    }

        private void init() {
            this.numArr = new int[NUMBER_COUNT];
            Main:
            for (int i = 0; i < this.numArr.length; i++) {
                int val = getRandomValue();
                for (int z = 0; z < i; z++) {
                    if (this.numArr[z] == val) {
                        i--;
                        continue Main;
                    }
                }
                this.numArr[i] = val;
            }
        }

        private int getRandomValue () {
            return (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;
        }

        public void showArr() {
            System.out.println(Arrays.toString(this.numArr));
        }
    }
