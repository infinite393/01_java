package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
        * 사용자 로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향 적으로 구현해보자
        *
        * - 회원 가입은 10명까지만 가능
        * - 가입한 회원이 없는 상태에서 로그인을 시도하면 '가입한 회원이 없습니다' 출력
        * - 정상적으로 가입 후 로그인시 로그인 완료 출력된 후 프로그램 종료
        * - 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 비밀번호와 비밀번호 확인이 같을 시 가입 진행
        *
        * Application
        * - 스캐너로 로그인, 회원가입, 프로그램 종료 구현
        * LoginService
        * - 회원 가입, 로그인 메소드 연결
        * LoginRepository
        * - 회원 가입 처리, 로그인 처리
        * User
        * - 회원의 id, pwd, name을 받을 DTO
        *
        */

        Scanner sc = new Scanner(System.in);

        LoginService loginService = new LoginService();



        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("9. 프로그램 종료");


        while(true){

            System.out.println("원하는 기능을 입력하세요: ");
            int choice = sc.nextInt();



            switch(choice){

                case 1 :
                    loginService.login(); break;

                case 2 :

                    System.out.println("회원가입을 진행합니다");
                    loginService.signUp();break;

                case 9 :
                    System.out.println("프로그램을 종료합니다"); return;

                default :
                    System.out.println("없는 번호입니다"); break;

            }
        }


    }
}
