package main.java.com.ohgiraffers.polymorphism.section01;

public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 갈려갑니다. 깡총 깡총");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다");
    }

    public void jumb(){
        System.out.println("토끼가 점프를 합니다");
    }
}
