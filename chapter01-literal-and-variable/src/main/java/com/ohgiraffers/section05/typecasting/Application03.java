package main.java.com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이요한 다른 자료형끼리의 연산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리한다
        */

        int inum = 10;
        long lnum = 10l;

        int isnum = inum + (int)lnum;
        isnum = (int)(inum + lnum);

        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 4;

        // 작은 자료형은 자동으로 자료형 변환(큰 자료형은 강제 형변환)
        int result1 = bnum + snum;
        int result2 = snum2 + bnum;
        int result3 = bnum + result1;

        System.out.println(result3);

    }
}
