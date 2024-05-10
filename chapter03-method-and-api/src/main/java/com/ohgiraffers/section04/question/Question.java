package main.java.com.ohgiraffers.section04.question;

public class Question {
    public static void main(String[] args) {

        /*
        * -100에서 100 사이의 난수를 발생 시켜서 매개변수로 전달 하면
        * 매개변수가 양수면서 짝수이면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
        *          음수면서 짝수면  x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
        * 를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력해보자
        */

        main.java.com.ohgiraffers.section03.math.QuestionTest randomTest = new main.java.com.ohgiraffers.section03.math.QuestionTest();

        int newNum = randomTest.randomInt();


        String test1 = (newNum >= 0)? "양수입니다" : "음수입니다";
        String test2 = (newNum % 2 == 0)? "짝수입니다" : "홀수입니다";

        System.out.println(newNum + "은 " + test1);
        System.out.println(newNum + "은 " + test2);

        System.out.println("---------test3---------------");

        String test3 = (newNum >= 0)? (newNum % 2 == 0)? "양수면서 짝수입니다" : "양수면서 홀수입니다" : (newNum % 2 == 0)? "음수면서 짝수입니다" :
                "음수면서 홀수입니다";

        System.out.println(newNum + "은 " +  test3);

        System.out.println("--------test4------------");


    }
}
