package main.java.com.ohgiraffers.section02.question;

import java.util.Scanner;

public class Question {


    public void question1() {

    /*
    * 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성해본다
    * 사용자로부터 시작 숫자와 끝 숫자를 입력받는다. 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력한다.
    * 소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
    */

    Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력: ");
    int num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력: ");
    int num2 = sc.nextInt();

        System.out.println(num1 + "부터 " + num2 + "까지의 숫자:");

        for (double i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }

    }

    public void question2() {

        /*
         * 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성해본다
         * 사용자로부터 시작 숫자와 끝 숫자를 입력받는다. 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력한다.
         * 소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수: ");
        int num1 = sc.nextInt();
        System.out.println("두번째 수: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + "부터 " + num2 + "까지의 모든 소수:");


        for (int i = num1; i < num2; i++) {
            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    isTrue = false;
                    break;

                }


            }

            if(isTrue == true) {
                System.out.println(i + "");
            }
        }

    }
}
