package main.java.com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /*
        * static 메소드 호출
        * 클래스명.메소드명();
        * 클래스명은 생략 가능함
        */

        System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10,20));
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));

    }

    public static int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
