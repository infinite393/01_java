package main.java.com.ohgiraffers.section04.user2;

public class Application {
    public static void main(String[] args) {

        Dicer dicer = new Dicer();

        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());


    }
}
