package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;

    // 생성자를 가질 수는 있지만 만들지 못함
    public Product() {
    }

    public void nonStaticMethod() {
        System.out.println("product 클래스의 nonstaticmethod를 호출");
    }

    public static void staticMethod() {
        System.out.println("product 클래스의 staticmethod 호출");
    }

    //몸체가 없음 - 자식 클래스에서 재정의 해줘야함
    public abstract void abstractMethod();


}
