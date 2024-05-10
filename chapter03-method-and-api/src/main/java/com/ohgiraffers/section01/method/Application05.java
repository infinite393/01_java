package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
        * return ?
        * 모든 메소드 내부에는 return; 이 존재한다
        * void 메소드의 경우 return 을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가해준다
        * return 은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다
        */

        System.out.println("main() 메소드를 시작함...");

        Application05 test = new Application05();
        test.testMethod();

        System.out.println("main() 메소드를 종료한...");

    }


    public void testMethod() {

        System.out.println("testMethod() 동작 확인");

        return; // void 자료형은 return;을 알아서 작성해주기 때문에 생략 가능함

//        System.out.println("test"); return;을 쓰면 동작이 종료되기 때문에 return; 뒤에 추가로 쓸 수 없음

    }

}
