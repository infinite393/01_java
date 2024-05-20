package main.java.com.ohgiraffers.understand.answer;

import main.java.com.ohgiraffers.understand.answer.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.answer.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("로그인 프로그램");
            System.out.println("1. google 로그인");
            System.out.println("2. kakao 로그인");
            System.out.println("3. naver 로그인");
            System.out.println("4. 프로그램 종료");
            System.out.println("선택 : ");
            int no = sc.nextInt();

            if (no == 4) {
                System.out.println("프로그램을 종료합니다");
                return;
            }

            sc.nextLine();

            System.out.println("아이디를 입력해주세요");
            String id = sc.nextLine();
            System.out.println("패스워드를 입력해주세요");
            String pw = sc.nextLine();
            MemberDTO memberDTO = new MemberDTO(id,pw);

            switch (no) {
                case 1:
                    memberService.findMember("google", memberDTO);
                    return;
                case 2:
                    memberService.findMember("kakao", memberDTO);
                    return;
                case 3:
                    memberService.findMember("naver", memberDTO);
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다");
                    break;
            }
        }

    }
}
