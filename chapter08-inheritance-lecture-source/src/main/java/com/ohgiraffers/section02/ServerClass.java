package main.java.com.ohgiraffers.section02;

public class ServerClass extends SuperClass{

    /* overriding 성립요건 */

//    @Override 메소드 이름이 같으면 오류발생
//    public void method2(int num){}

//    @Override 리턴 타입이 다르면 오류발생
//    public int method(int num){}

//    @Override 시그니쳐가 다르면 오류발생
//    public void method(int num, int num2){}

    @Override
    public void method(int num) {
        super.method(num);
    }

//    @Override private은 자신만 접근할 수 있기 때문에 오류발생
//    public void privateMethode(){}

//    @Override
//    public final void finalMethod(){}

    @Override
    public void protectedMethod() {}

}
