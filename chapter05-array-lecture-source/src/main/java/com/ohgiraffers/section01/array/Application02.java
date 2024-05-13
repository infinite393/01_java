package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 배열의 선언
        * 자료형[] 변수명;
        *
        */

        int[] iarray;
        int array[];

        /*
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다
        * 발생한 주소를 레퍼런스 주소에 저장하여 이것을 사용하기 때문에 참조자료형(reference type)이라고 한다
        */

        // 배열을 할당할 시에는 반드시 크리르 지정해주어야 한다
        iarray = new int[5];
        array = new int[4];

        int[] iarr = new int[5];

        System.out.println(iarray);
        System.out.println(array);
        System.out.println(iarr);

        //hashCode() : 객체의 주소갚을 10진수로 반환
        System.out.println(iarray.hashCode());
        System.out.println(array.hashCode());
        System.out.println(iarr.hashCode());

        //스캐너를 통해 입력 받은 정수로 배열 길이를 지정

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");

        int size = sc.nextInt();
        int[] darr = new int[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 length : " + darr.length);

        // 새롭게 주소 만들어서 넣어줌. 다빈치 콜렉트
        darr = new int[50];

        System.out.println("바뀐 hashCode : " + darr.hashCode());
        System.out.println("바뀐 length : " + darr.length);

    }
}
