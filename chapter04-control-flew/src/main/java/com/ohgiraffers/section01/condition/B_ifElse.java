package main.java.com.ohgiraffers.section01.condition;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {

        /*
        * [if-else 조건식]
        * if(조건식){
        *  조건식이 true 일때 실행할 명령문;
        * } else {
        * 조건식이 false일 때 실행할 명령문;
        * }
        */

        /* 정루 한 개를 입력받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다"라고 출력하고
        * 홀수가 아니면 "입력하신 숫자는 짝수입니다"라고 출력
        * 단 조건과 상관없이 프로그램이 종료 될때 "프로그램종료"라고 입력
        */

        System.out.println("숫자를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();



        if(num % 2 == 0) {

            System.out.println("입력하신 숫자는 짝수입니다");

        } else {
            System.out.println("입력하신 숫자는 홀수입니다");
        }

        System.out.println("종료");
    }

    public void testNestedIfElseStatement() {

        //if-else 중첩

        /*
        * 숫자를 하나 입력 받아서 "입력하신 숫자는 양수입니다"
        * 음수이면 "입력하신 숫자는 음수입니다" 추력
        * 단,0이면 "0입니다"를 출력합니다
        * 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력되도록 한다
        */

        System.out.println("숫자를 입력하세요");

        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();


        if(num != 0) {
            if(num > 0) {

                System.out.println("입력하신 숫자는 양수입니다");
            }else {
                System.out.println("입력하신 숫자는 음수입니다");
            }

        }else{
            System.out.println("입력하신 숫자는 0입니다.");
        }

        System.out.println("bye :D");

    }

}
