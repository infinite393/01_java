package main.java.com.ohgiraffers.section05.typecasting;

public class test {
    public static void main(String[] args) {

        /*
        * 5명의 학생이 있으며 학생의 키는 각각
        * 178.5 170.3 190.7 188.67 160.8 이다
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다 (소수자리는 절삭)
        * 화면에 보여지는 양식은 다음과 같다
        * 1반 학생 5명의 평균 키는 ()cm 이다
         */

        double a1 = 178.5;
        double a2 = 170.3;
        double a3 = 190.7;
        double a4 = 188.67;
        double a5 = 160.8;

        int A1 = (int) a1;
        int A2 = (int) a2;
        int A3 = (int) a3;
        int A4 = (int) a4;
        int A5 = (int) a5;

        int result = (A1+A2+A3+A4+A5)/5;

        System.out.println("1반 학생 5명의 평균 키는 " + result + "cm 이다.");

        double height = (178.5 + 170.3 + 190.7 + 188.67 + 160.8)/5;

        int result2 = (int) height;

        System.out.println("1반 학생 5명의 평균 키는 " +  result2 + "cm 이다.");

        double height2 = (178.5 + 170.3 + 190.7 + 188.67 + 160.8);

        int result3 = (int) height2 / 5;

        System.out.println("1반 학생 5명의 평균 키는 " +  result3 + "cm 이다.");


    }
}
