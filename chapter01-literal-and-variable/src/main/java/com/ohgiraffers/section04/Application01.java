package main.java.com.ohgiraffers.section04;

public class Application01 {
    public static void main(String[] args) {

        /*
        * overflow란?
        * 자료형 별 최대 범위를 벗어나는 경우
        * = 변수 저장 가능 범위를 벗어나는 경우
        */


        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;
        System.out.println(num1);

        /*
        * 언더플로우
        * 오버플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상
        */

        byte num2 = -128;
        System.out.println(num2);
        num2--;
        System.out.println(num2);

        int firstNum = 1000000;
        int secondNum = 7000000;
        int multi = firstNum * secondNum;
        System.out.println(multi);

        // 오버프롤우를 해결하려면?
        long multi2 = (long)firstNum*secondNum;
        System.out.println(multi2);




    }
}
