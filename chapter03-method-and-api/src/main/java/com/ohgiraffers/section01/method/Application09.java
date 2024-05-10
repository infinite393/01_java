package main.java.com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args) {

        /* 다른 클래스에 작성한 메소드 호출 */

        // 최솟값, 최댇ㅅ값을 비교할 두 정수 선언

        int first = 100;
        int second = 50;

        // non-static 메소드의 경우
        Calculator calc = new Calculator(); //자체 클래스 생성 -> 훨씬 많은 메모리를 차지함
        int min = calc.minNumber(first,second);
        System.out.println(min);

        // static 메소드인 경우
        // 프로그램을 시작할 때 메모리 상에 적재함 (바로 가져다 쓸 수 있음)
        int max = Calculator.maxNumber(first,second);
        System.out.println(max);

//        int max2 = calc.maxNumber(first,second); 사용할수는 있지만 static 접근 방식 권장


    }

}
