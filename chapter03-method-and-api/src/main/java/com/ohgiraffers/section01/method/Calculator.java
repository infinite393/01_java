package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    // 정 수 두개를 받아서 둘 중 최솟값을 리턴

    public int minNumber(int first, int second) {

        return Math.min(first, second);
    }

    // 둘 중 최댓값을 리턴

    public static int maxNumber (int first, int second) {

        return (first > second)? first : second;

    }

}
