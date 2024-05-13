package main.java.com.ohgiraffers.section02.looping;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class C_dowhile {

    public void testSimpleDoWhileStatement() {

        /*
        * [do-while 표현식]
        * 초기식;
        * do {
        *   1회차에는 무조건 실행, 이후에는 조건식을 확인하여 만족하는 경우에만 실행할 구문
        *
        * 증감식;
        * } while (조건식) ;
        *
        */

        do {
            System.out.println("최초 한 번 동작");
        }while (false);

        System.out.println("반복문 종료 확인");


    }

    public void testDoWhile() {

        //문자열을 입력 받아 반복적으로 출력
        //단, exit가 입력되면 반복문을 종료한다

        Scanner sc = new Scanner(System.in);

        String line = "";

        do {
            System.out.println("문자열을 입력하세요 : ");
            line = sc.nextLine();
            System.out.println(line);
        } while(!line.equals("exit"));

        System.out.println("종료");

    }
}
