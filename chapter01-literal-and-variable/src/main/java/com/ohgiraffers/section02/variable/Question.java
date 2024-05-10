package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 사원 10명의 월급을 입금해줘야 하는 날이다
        * 사원의 직책은 대리 과장 차장 부장이 있으며
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다
        * 보너스는 각 월급 *0.5 만큼을 더해서 주어야한다
        */

        //화면에 출력되는 형태는 다음과 같아야 한다
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.

        int salary1 = 100;
        int salary2 = 120;
        int salary3 = 130;
        int salary4 = 150;

        double bonus1 = salary1 * 0.5;
        double bonus2 = salary2 * 0.5;
        double bonus3 = salary3 * 0.5;
        double bonus4 = salary4 * 0.5;

        String bns1 = " 보너스는 ";
        String sum1 = "으로 총 ";
        String total1 = "만원 입금되었습니다.";


        System.out.println("김대리의 월급은 " + salary1 + bns1 + bonus1 + sum1 + (salary1 + bonus1) + total1);
        System.out.println("김과장의 월급은 " + salary2 + bns1 + bonus2 + sum1 + (salary2 + bonus2) + total1);
        System.out.println("김차장의 월급은 " + salary3 + bns1 + bonus3 + sum1 + (salary3 + bonus3) + total1);
        System.out.println("김부장의 월급은 " + salary4 + bns1 + bonus4 + sum1 + (salary4 + bonus4) + total1);


    }
}
