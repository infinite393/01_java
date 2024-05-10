package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

import main.java.com.ohgiraffers.section03.math.Randomtest;

public class LottoScannerTest {

    public static void main(String[] args) {

        Scanner play = new Scanner(System.in);

        System.out.println("이름을 입력해 주세요: ");

        String name = play.nextLine();

        System.out.println("나이를 입력해 주세요: ");

        int age = play.nextInt();

        System.out.println(name + "(" + age + "세) 님 환영합니다!");

        String newresult = Randomtest.lotto1();

        System.out.println("오늘의 번호는 " + newresult + " 입니다.");



    }
}
