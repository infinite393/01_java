package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
        * 실습
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곲한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 메소드
        *
        * 반환받아서 메인 메소드에 System.out println 을 이용해 출력
         */

        Application07 test1 = new Application07();

            test1.plus(4,6);
            test1.minus(15,4);
            test1.multiply(4,6);
            test1.divide(8,4);

            int plus1 = test1.plus(4,6);
            int minus1 = test1.minus(15,4);
            int multiply1 = test1.multiply(4,6);
            int divide1 = test1.divide(8,4);

        System.out.println("4 + 6 = " + plus1 + " & 15 - 4 = " + minus1 + " & 4 * 6 = " + multiply1 + " & 8 / 4 = " + divide1);

    }

    public int plus(int a, int b) {

        return a + b;
    }

    public int minus(int a, int b) {

        return a - b;
    }

    public int multiply(int a, int b) {

        return a * b;

    }

    public int divide(int a, int b) {

        return a / b;
    }

}
