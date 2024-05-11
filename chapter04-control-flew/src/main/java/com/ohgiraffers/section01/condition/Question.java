package main.java.com.ohgiraffers.section01.condition;

import java.util.Scanner;

public class Question {

    int result;

    /*
    * a,b,c, 세 과목의 점수를 스캐너로 입력 받고 세 과목의 점수를
    * 만든 메소드의 매개변수로 전달해 평균을 계산, 평균을 이용하여 합격/불합격 처리를 하는 기능을 구현하세요
    * (합격조건: 세 과목의 점수가 각각 40점을 넘어야하고, 평균은 60을 넘어야 합니다)
    * 합격 했을 경우 그 학생의 평균 점수와 "합격입니다!"를 출력하고,
    * 불합격인 경우에는 "불합격입니다!"를 출력해주세요.
    */

    public void Question1() {


        System.out.println("이름을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("점수를 입력하세요");
        System.out.println("과목 a:");
        int scoresA = sc.nextInt();
        System.out.println("과목 b:");
        int scoresB = sc.nextInt();
        System.out.println("과목 c:");
        int scoresC = sc.nextInt();

        int result = (scoresA+scoresB+scoresC)/3;
        System.out.println(result);




    }

//    public void scores () {
//
//        Question1(int scoresA, int scoresB, int scoresC, int result);
//
//    }

//    public void Question2() {
//
//
//        Question1();
//
//        int result = Question1();
//
//        if(result >= 60){
//            if(scoresA >= 40 && scoresB >= 40 && scoresC >= 40){
//                System.out.println(name+"님 세과목 평균점수 " +  result + "으로 합격입니다!");
//                System.out.println("축하드립니다!");
//            } else {
//
//                System.out.println(name+"님 세과목 평균점수 " +  result + "이지만 과목당 점수 미달로 불합격입니다!");
//                System.out.println("다음에 또 만나요!");
//            }
//
//        } else {
//            System.out.println(name+"님 세과목 평균점수 " + result + "으로 불합격입니다!");
//            System.out.println("다음에 또 만나요!");
//        }
//
//        System.out.println("GoodBye:D");
//
//    }


}
