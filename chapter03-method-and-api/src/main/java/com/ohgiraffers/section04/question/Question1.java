package main.java.com.ohgiraffers.section04.question;

import main.java.com.ohgiraffers.section03.math.QuestionTest;

public class Question1 {
    public static void main(String[] args) {


        // -100~100 사이의 난수를 발생시켜 x는 양수면서 짝수, 양수면서 홀수, 음수면서 짝수, 음면서 홀수 출력

        int testnum = QuestionTest.randomInt();

       String result = (testnum >= 0)? (testnum % 2 == 0)? "양수면서 짝수" : "양수면서 홀수" : (testnum % 2 == 0)? "음수면서 짝수" : "음수면서 홀수";

        System.out.println(testnum + "은 " + result);

    }


}
