package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    
    int test = 10; //전역변수 (필드)
    
    public static void main(String[] args) {

        /*
        * 변수의 종류
        * 1. 지역 변수
        *   main method 안에서 선언 된 변수
        * 2. 매개 변수
        * 3. 전역 변수 (필드)
        * 4. 클래스(static) 변수
        */


        Application03 old = new Application03();
        old.testMethod(33);
//        old.testMethod(22,33); 전달 인자 갯수가 다르면 에러 발생
//        old.testMethod("33");  전달 인자 자료형이 다르면 에러 발생
//        old.testMethod(); 전달 인자를 넣지 않으면 에러 발생

        /* 변수에 저장한 값 전달 테스트 */
        int age = 20;
        old.testMethod(age);

        /* 자동 형 변환을 이용한 값 전달 테스트 */
        byte byteAge = 21;
        old.testMethod(byteAge);


        /* 강제 형 변환을 이용한 값 전달 테스트 */
        long longAge = 30;
        old.testMethod((int)longAge);

        /* 연산 결과를 이용한 값 전달 테스트 */
        old.testMethod(byteAge*2);


    }
                        // 매개변수
    public void testMethod(int age) {


        System.out.println("당신의 나이는 " + age + "세 입니다");
        
    }

}



