package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        // 배열의 최솟값, 최댓값 찾기
        // 배열의 길이는 스캐너로 입력받아서 요소마다 정수를 넣어줌
        // 해당 배열의 두번쨰 최솟값과 두번째 최댓값을 출력해주는 기능을 만들어주세요

        Scanner sc = new Scanner(System.in);

        System.out.println("배열 범위를 입력해주세요");

        int number = sc.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {

            System.out.println("숫자를 입력하세요");
            array[i] = sc.nextInt();
            System.out.println(array[i]);

        }

        int max = array[0];
        int min = array[0];
        int secondMax = array[1];
        int secondMin = array[1];

        // 반복문 안에 조건문을 넣어서 큰 값 혹은 작은 값만 남기기

        for(int i = 1; i < number ; i++) {
            if(array[i] < min ) {
                min = array[i];
            }

            if(array[i] > max) {
                secondMax = max;
                max = array[i];

            // array[i]가 max 보다 크지 않고 secondMax 보다 클 경우 secondMax에 넣어줌. second랑 max가 같을때도 실행
            }else if(array[i] > secondMax || secondMax == max) {
                secondMax = array[i];
            }
        }

        System.out.println("배열의 최솟값 : " + min);
        System.out.println("배열의 최댓값 : " + max);
        System.out.println("두번째로 큰 값 : " + secondMax);



//        System.out.println("max " + max );
//        System.out.println("secondmax " + secondMax);



//        for (int j = 0; j < array.length; j++) {
//            for (int k = 0; k < array.length; k++) {
//                if (array[j] > max) {
//                    max = array[j] ;
//
//                    if (secondMax < array[k]) {
//                        secondMax = array[k] ;
//                    }
//
//                } else if (array[j] < min) {
//                    min = array[j];
//                }
//            }


        }




    }

