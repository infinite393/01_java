package main.java.com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct {
    public static final int MAX_NUM = 100;

    int MIN_NUM = 10;

    void abstractMethod();

    //public 생략가능
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 static method 호출");
    }

    default void defaultMethod(){
        System.out.println("InterProduct 클래스의 default 메소드 호출");
    }
}
