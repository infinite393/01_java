package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        // 배열의 최솟값, 최댓값 찾기
        // 배열의 길이는 스캐너로 입력받아서 요소마다 정수를 넣어줌
        // 해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들어주세요

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");

        int num1 = sc.nextInt();

        int[] array = new int[num1];

        System.out.println("배열의 길이는 " + array.length);

        for (int i = 0; i < array.length; i++) {

            array[i] = i+1;

            System.out.println(array[i]);

        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("----최솟값----");
        System.out.println(min);
        System.out.println("----최댓값----");
        System.out.println(max);


    }
}
