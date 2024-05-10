package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {

        System.out.println("main() 메소드 시작됨....");

        System.out.println("main() 메소드 종료됨....");

        System.out.println("------------follow me------------");

        Application02 call = new Application02();

        call.methodA();

        call.methodB();




    }

    public void methodA(){

        System.out.println("Hello World :D");

    }

    public void methodB(){

        System.out.println("Wellcome!");

    }

}
