package com.green.day18;

public class ExamTest {
    public static void main(String[] args) {
        int rVal = Exam.getRandomValue(1, 101); // 1~100 랜덤값 리턴
        int rVal2 = Exam.getRandomValue(1, 101); // 1~100 랜덤값 리턴

        Exam.printOddEven(rVal); //?는 짝수입니다//?는 홀수입니다.

        for(int i = 100 ; i < 104 ; i++){
            System.out.println(200-i);
        }

//        System.out.println("-------------");
//        System.out.println("rval: " + rVal + " rval2: " + rVal2);
//        Exam.test(rVal , rVal2);
//        //val1이 짝수일때 (val2도 짝수면 val2 - va1 값을 출력 , 홀수면 val1 출력)
//        //val1이 홀수일때 (val2이 짝수면 val2 - 5 값을 출력 , 홀수면 그대로 출력)

        System.out.println("--------------------");

        //n1~n2 숫자를 세로로 출력
        Exam.printNumToNum(4 , 22 ); // a ~ b 숫자로 출력
        int score = Exam.getRandomValue(-100 , 200);
        System.out.println("score: " + score);
        String grade = Exam.getGrade(score);
        System.out.println("grad: "+ grade);

        System.out.println("================");

        int sum = Exam.getSumFromTo(8 , 20 );//8~20까지 모두 더한값을 리턴
        System.out.println("sum: " + sum);
        //score값이 0~100사이의 값이 아니면 "점수가 잘못되었습니다." 리턴

//10의 자리 숫자가
// 10, 9 > A
// 8 > B
// 7 > C
// 6 > F

//1의 자리 숫자가
//0~2 -
//3~6 0
//7~9 +

//예를 들어
//100 > A+
//99 > A+
//82 > B-
//75 > C0

//단, F는 +-0가 없음 무조건 "F", A~C만 +-0가 있음, 100점은 A+

    }
}

class Exam {
    public static int getRandomValue(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }

    public static void printOddEven(int rVal) {
        System.out.printf("%d은 %s입니다\n", rVal, rVal % 2 == 0 ? "짝" : "홀");
    }

    public static void test(int rval, int rval2) {
        if (rval % 2 == 0) {
            System.out.println(rval2 %2 ==0 ? rval2 - rval : rval);
        }
        System.out.println(rval2 %2 == 0 ? rval2 -5 : rval2);
    }

    public static void printNumToNum(int a , int b){
        for (  ; a <= b ; a++){
            System.out.println(a);
        }
    }

    public static String getGrade(int score){
        if ( score < 0 || score > 100) {
            return "점수가 잘못되었습니다.";
        }

        if(score == 100) {
            return "A+";
        }

        if(score < 70) {
            return "F";
        }

        String grade = switch (score / 10 ) {
            case 9  -> "A";
            case 8  -> "B";
            default -> "C";
        };

            grade+= switch (score % 10) {
            case 0, 1, 2    -> "-";
            case 3, 4, 5, 6 -> "0";
            default         -> "+";
        };

        return grade;
    }

    public static int getSumFromTo(int sNum , int eNum){
        int sum = 0;
        for( ; sNum <= eNum ; sNum++){
            sum+=sNum;
        }
        return sum;
    }
}

//            if (rval2 % 2 == 0) {
//                System.out.println(rval2 - rval);
//            } else {
//                System.out.println(rval);
//            }
//        } else {
//            if (rval2 % 2 == 0) {
//                System.out.println(rval2 - 5);
//            } else {
//                System.out.println(rval);
//            }
