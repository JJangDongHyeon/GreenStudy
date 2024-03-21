import javax.swing.plaf.multi.MultiViewportUI;
import java.util.Scanner;

//                    사망 코멘트
//                    if(playerHP <= 0) {
//                    System.out.println("사망하였습니다. 종료합니다.");
//                    break AllMap;

public class _MS_Stack {
    public static void main(String[] args) {
        /*
        스텟 초기화, 플레이어 스텟, 몬스터 스텟, 플레이어 공격타입, 이름작성, 이동 초기화, 전투입력창,
        스텟 주사위, 모든맵이동(로딩창->선택맵으로 이동방식), 사망 코멘트
         */
        //HP, 몬스터, 스텟추가, 맵이동

        System.out.println("켠왕에 오신걸 환영합니다.");
        Scanner scan = new Scanner(System.in);

        // 스텟 초기화
        int STR=4, DEX=4, INT=4, LUK=4;

        // 플레이어 스텟
        int playerHP = 50;
        int playerMP = 10;
        int playArmer = 1;
        int ResultFirst = (int)(STR*0.4+DEX*0.2);
        int ResulSecond = (int)(STR*0.8+DEX*0.2);
        int playDamge = (int) (Math.random() * (ResulSecond - ResultFirst + 1)) + ResultFirst;
        int ResultFirst2 = (int)(INT*0.4+LUK*0.2);
        int ResulSecond2 = (int)(INT*0.8+LUK*0.2);
        int playMagicDamge = (int) (Math.random() * (ResulSecond2 - ResultFirst2 + 1)) + ResultFirst2;

        // 몬스터 공격 타입
        // 달팽이
        String monster1 = "달팽이";
        int monster1HP = 8;
        int monster1Armor = 1;
        int monster1Damge =  (int)(Math.random() * 3) + 3;

        // 플레이어 공격 타입
        int playerSkill1 = playDamge;  // 평타
        int playerSkill2 = (int)(playDamge*1.5);// 파워스트라이크
        int playerSkill3 = playMagicDamge;// 에너지볼트




        //이름 작성
        System.out.println("이름을 정하시오");
        final String userName = scan.nextLine();
        System.out.println("이름을 " + userName + "으로 설정합니다.");

        //이동 초기화
        String nextMove = null;
        int mapVictory = 0;

        // 전투 입력창

        String playerBattleStack2
                = ("'전투'합니다. 현재 당신의 능력치 \n HP: " + playerHP + "\n MP: " + playerMP + "\n AM:"
                + playArmer +  "\n STR:" + STR +  "\n DEX:" + DEX +  "\n INT:" + INT + "\n LUK: " + LUK);


        //스텟 주사위(4~13) 설정
        while (true) {
            //메소드 배우면 나이스하게 변경 예정.
            //랜덤값의 최소 최대값 입력.
            int first = 4;
            int second = 13;
            int result = (int) (Math.random() * (second - first + 1)) + first;
            STR = result;
            result = (int) (Math.random() * (second - first + 1)) + first;
            DEX = result;
            result = (int) (Math.random() * (second - first + 1)) + first;
            INT = result;
            result = (int) (Math.random() * (second - first + 1)) + first;
            LUK = result;

            //스텟값 저장
            if (STR + DEX + INT + LUK == 25) {
                System.out.println("주사위 결과값 : \n" + "STR: "+STR+"\nDEX: "+DEX+"\nINT: "+INT+"\nLUK: "+LUK);
                System.out.println("마음에 든다면 '다음', 재설정은 아무키를 입력하세요. >>");
                nextMove = scan.nextLine();
                if ("다음".equals(nextMove)) {
                    break;
                }
            }
        }

        //while문을 이용해 맵 전체로 묶고, 숫자를 통해 해당맵에 이동하는 방식으로 하자.
        //차 후에 맵 이동 후 스텟 및 구현을 하고, 나아가 항상 구현 할 수 있게 하자 <- 서버가 필요할듯?.
        //for문 2개를 이용해서 전투방식을 구현해보자.
        //승리시, 사망시 보상을 구현해보자.

        System.out.println(userName + "님이 입장했습니다.");


        //모든 맵 입장.
        AllMap:
        while(true){

            //듀톨 입장해라. 차 후에는 로딩해서 이동.
            tutorial_1:
            while(true){
                System.out.println("듀토리얼1 맵으로 입장되었습니다.");
                System.out.println("현재 맵은 '듀토리얼 맵2'로 이동이 가능합니다.");
                System.out.println("'2'을 입력해 이동하세요. >>");
                String mapmove1 = scan.nextLine();
                if("2".equals(mapmove1)){
                    break;
                }
            }
            tutorial_2:
            while(true) {
                System.out.println("듀토리얼2 맵에 입장했습니다.");
                System.out.println("'lv1 : 달팽이'(이)가 출현했습니다.");
                System.out.println("'전투' or '도망'(을)를 입력하시오 >> ");
                String mapmove2 = scan.nextLine();

                if("전투".equals(mapmove2)) {
                    System.out.printf("전투를 시작합니다.");

                    //전투 시작
                    for (; playerHP > 0; playerHP = playerHP ) {
                        for (; monster1HP > 0; monster1HP = monster1HP) {
                            String playerBattleStack
                                    = ("'전투'합니다. 현재 당신의 능력치 \n HP: " + playerHP + "\n MP: " + playerMP);

                            System.out.println(playerBattleStack);
                            System.out.println(monster1 + " 체력: " + monster1HP);
                            System.out.println("'공격', '스킬' 선택하시오 >> ");
                            String playChoice = scan.nextLine();

                            if ("스킬".equals(playChoice)) {
                                System.out.println("미구현입니다. 그냥 공격합니다.");
                            } else if("공격".equals(playChoice)){
                                playerHP -= monster1Damge;
                                monster1HP -= playDamge;
                            }
                            if(playerHP <= 0) {
                                System.out.println("사망하였습니다. 종료합니다.");
                                break AllMap;
                            }
                        }
                        break;
                    }

                    // 사망 코멘트
                    if(playerHP <= 0) {
                        System.out.println("사망하였습니다. 종료합니다.");
                        break AllMap;
                    }

                    // 승리 코멘트
                    System.out.println("승리하였습니다.스텟을 획득합니다.");
                    System.out.println("STR +1");
                    STR++;

                    do {
                        System.out.println("현재 맵은 '듀토리얼 맵3'로 이동이 가능합니다.");
                        System.out.println("'3'을 입력해 이동하세요. >>");
                        mapVictory = scan.nextInt();
                    } while(mapVictory != 3);
                    break tutorial_2;

                } else if ("도망".equals(mapmove2)) {
                    System.out.println("쫄지마세요. 다시 달팽이한테 갑니다.");
                }

            }// 맵나가기



            break;
        }// AllMap




    } // ps
} // end
