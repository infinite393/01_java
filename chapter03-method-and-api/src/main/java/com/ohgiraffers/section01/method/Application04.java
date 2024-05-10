package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        /* 여러개의 전달인자를 이용한 메소드 호출 테스트 */

        Application04 profile = new Application04();

        profile.testMethod("이나래",33,'여');
        //자료형을 지켜서 입력해야함 , 매개변수를 입력한 순서대로.

        System.out.println("--------------------------------");

        //변수에 저장된 값을 전달하여 호출할 수 있다.
        Application04 profile2 = new Application04();

        String name2 = "Anne";
        int age2 = 22;
        char gender2 = 'F';

        profile2.testMethod2(name2,age2,gender2);



    }

    /*
    * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공
    * @param name 출력할 이름을 전달 해주세요
    * @param age 출력할 나이를 전달 해주세요
    * @param gender 출력할 성별을 전달 해주세요. 성별은 변경되지 않습니다
     */

    public void testMethod(String name, int age, final char gender) {

        /* name = "이나래";
        age = 33;
        gender = 'f';
        final 붙은 변수는 재할당 불가
        */

        System.out.println("당신의 이름은 " + name + "이고, " + "나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");

    }

    public void testMethod2(String name1, int age1, final char gender1) {

        System.out.println("Your name is " + name1 + "," + age1 + "years old, gender is " + gender1);

    }

}
