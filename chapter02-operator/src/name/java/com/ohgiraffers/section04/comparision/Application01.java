package name.java.com.ohgiraffers.section04.comparision;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 비교 연산자 (== , != , < , > )
        * 비교 연산자는 피 연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나, 조건문의 조건절에 많이 사용한다
        *
        * ! : 부정문을 의미
        */

        System.out.println(!true); // false
        System.out.println(!false); // true

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("--------------정수 값 비교----------------");

        // 비교 연산자는 일반 산술 연산자보다 순서가 낮아서 괄호가 꼭 필요함
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); //false
        System.out.println("inum1과 inum2가 같지 않은지 비교  : " + (inum1 != inum2)); //true
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2)); //false
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2)); //true
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2)); //false
        System.out.println("inum1이 inum2보다 작거나 같은지 비교: " + (inum1 <= inum2)); //true

        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("--------------문자 값 비교----------------");
        // 아스키코드

        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2)); //false
        System.out.println("ch1과 ch2가 다른지 비교 : " + (ch1 != ch2)); //true
        System.out.println("ch1과 ch2 보다 큰지 비교 : " + (ch1 > ch2)); //true
        System.out.println("ch1이 ch2 보다 크거나 같은지 비교 : " + (ch1 >= ch2)); //true
        System.out.println("ch1이 ch2 보다 작은지 비교 : " + (ch1 < ch2)); //false
        System.out.println("ch1이 ch2 보다 작거나 같은지 비교 : " + (ch1 <= ch2)); //false

        System.out.println("--------------논리 값 비교----------------");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 다른지 비교 : " + (bool1 != bool2));
//      System.out.println("bool1 > bool2 : " + (bool2 > bool2)); boolean은 같거나 틀린 것만 비교 가능

        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 != str2); //false

        //비교연산자를 이용해서 boolean에 직접 값 지정
        int x = 10;
        int y = 11;
        boolean reseult = x <= y ;
        System.out.println(reseult); //true






    }
}
