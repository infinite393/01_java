package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공한다
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력 해주세요 : ");

        String name = sc.nextLine();

        System.out.println("나이를 입력하세요 : ");

        int age = sc.nextInt();

        System.out.println(name + "(" + age + "세)님 반갑습니다!" );

        System.out.println("원하는 금액을 입력 해주세요 : ");

        long lnum = sc.nextLong();
        System.out.println(lnum + "억 원");

        System.out.println("통장에 " + lnum + "억 원이 입금되었습니다.");

        System.out.println("추가 입금 금액을 실수로 입력하세요 : ");

        double number = sc.nextDouble();

        System.out.println("총" + (lnum + number) +"억 원이 입금되었습니다.");

        System.out.println("출금을 원하시면 true 기부를 원하시면 false를 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println((isTrue)? "출금 완료 되었습니다" : "기부 완료 되었습니다");

        sc.nextLine();

        System.out.println("메세지를 입력해주세요 : ");
        char cahrValue = sc.nextLine().charAt(9);
        System.out.println(cahrValue);




    }
}
