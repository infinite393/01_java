package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 메소드(method)란?
        * 어떤 특정 작업을 수행하기 위한 명령문의 집합
         */

        System.out.println("main() 메소드 시작됨...");

        //methodA() 호출하기
        Application01 app = new Application01(); //초기화
        //class(제목) = 자료형

        app.methodA();


        System.out.println("main() 메소드 종료됨...");



    }
    //public = 접근제어자
    //void = 반환타입(void: 반환하지 않겠다)
    public void methodA() {

        System.out.println("methodA() 호출");



        System.out.println("methodA() 종료");

        System.out.println("-----------------------");

        methodB();

    }

    public void methodB() {

        System.out.println("methodB() 호출");

        System.out.println("methodB() 종료");

    }
}
