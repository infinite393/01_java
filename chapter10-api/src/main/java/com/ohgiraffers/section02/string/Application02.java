package main.java.com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일안 값을 가지는 인스턴스를 단인 인스턴스로 관리한다 (singleton)
        * new String("문자열") :  매번 새로운 인스턴스를 생성한다
        */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        // 주소 공간 확인
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        System.out.println("str1 : " + str1.hashCode());
        System.out.println("str2 : " + str2.hashCode());
        System.out.println("str3 : " + str3.hashCode());
        System.out.println("str4 : " + str4.hashCode());

        str2 += "oracle"; //공간 자체자 바뀜
        System.out.println("str1 == str2 : " + (str1 == str2));

        /*
        * equals() : String 클래스의 equals 메소드는 인스턴스 비교가 아닌 문자열값을 비교하여
        * 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false 를 반환하도록
        * Object 의 equals() 메소드를 재정의 해 두었다
        * 따라서 문자열 인스턴스 생성 방식은 상관없이 동일한 문자열인지 비교하기 위해 == 대신
        * equals() 메소드를 사용해야 한다
        */

        System.out.println("str1.equals(str3) : " + str1.equals(str3));



    }
}
