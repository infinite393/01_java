package main.java.com.ohgiraffers.section03.math;

public class QuestionTest {

    public static void main(String[] args) {

        System.out.println(randomInt());

    }

    public static int randomInt() {

        return (int) (Math.random()*200)+(-100);

    }
}
