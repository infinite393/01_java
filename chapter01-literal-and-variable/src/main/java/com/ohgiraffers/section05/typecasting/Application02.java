package main.java.com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args) {

        /*
        *  강제 형 변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형 변환 한다
        */

        /*
        * 강제 형 변환 규칙
        * 1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
        * 2. 실수를 정수로 변경 시 강제 형 변환 필요
        * 3. 문자형을  int 미만의 크기로 변수에 저장할 때 강제 형변환 필요
        * 4. 논리형은 제외
        */

        // 정수간의 강제 형 변환
        long lnum = 8l;
        int inum = (int) lnum; // ()안에 int 자료형을 넣어서 강제 형 변환

        short snum = (short) lnum;
        byte bnum = (byte) snum;

        System.out.println(bnum);

        // 실수간의 강제 형 변환
        double dnum = 8.0;
        float fnum = (float) dnum;
        System.out.println(fnum);

        // 실수를 정수로 변경 시 강제 형 변환
        float fnum2 = 4.0f;
        long lnum2 = (long) fnum2;

        // 문자형을 int 미만의 정수에 저장할 때
        char ch = 'a';
        int inum2 = ch;
        short snum2 = (short) inum2;
        byte bnum2 = (byte) snum2;

        System.out.println(snum2);

        // 정수를 문자에 대입 시 강제 형 변환
        char ch3;
        int inum3 = 98;
        ch3 = (char) inum3;

        System.out.println(ch3);

        /* 참고. boolean 타입의 경우 형 변환 규칙에서 제외됨 */



    }
}
