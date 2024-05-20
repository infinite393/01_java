package main.java.com.ohgiraffers.understand.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        MemberDTO member = new MemberDTO();
        MemberService member2 = new MemberService();


        Scanner sc = new Scanner(System.in);

        System.out.println("인증 방식을 고르시오");
        System.out.println("1. googleAuth");
        System.out.println("2. kakaoAuth");
        System.out.println("3. naverAuth");
        System.out.println("9. 나가기");

        while(true){
            System.out.println("입력 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    member2.googleAuth(member); return;
                case 2 :
                    System.out.println("kakao 로그인 화면으로 이동합니다");
                    return;
                case 3 :
                    System.out.println("naver 로그인 화면으로 이동합니다");
                    return;
                case 9 :
                    System.out.println("프로그램이 종료되었습니다");
                    return;

            }

        }



    }
}
