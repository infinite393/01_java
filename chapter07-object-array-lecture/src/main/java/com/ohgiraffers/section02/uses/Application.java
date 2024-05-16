package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { //프로그램 실행부
    public static void main(String[] args) {

        /*
        * 시스템의 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        *
        * 1. 회원등록, 2. 회원 전체 조회, 9. 프로그램 종료, 그외 값 - 잘못된 번호를 입력하셨습니다
        */


        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        System.out.println("=====회원 관리 프로그램=====");
        System.out.println("1.회원등록");
        System.out.println("2.회원 전체 조회");
        System.out.println("9.프로그램 종료");
        System.out.println("메뉴 선택 : ");

        while (true) {

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    memberService.signUpMembers(); break;
                case 2:
                    memberService.showAllMembers(); break;
                case 9:
                    System.out.println("프로그램 종료"); return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다"); break;
            }


        }

    }
}
