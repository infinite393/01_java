package main.java.com.ohgiraffers.understand.answer.service;


import main.java.com.ohgiraffers.understand.answer.auth.GoogleAuth;
import main.java.com.ohgiraffers.understand.answer.auth.KakaoAuth;
import main.java.com.ohgiraffers.understand.answer.auth.NaverAuth;
import main.java.com.ohgiraffers.understand.answer.dto.MemberDTO;

public class MemberService{

    public void findMember(String authType, MemberDTO memberDTO) {

        switch (authType) {
            case "google" :
                GoogleAuth googleAuth = new GoogleAuth();
                boolean result = googleAuth.login(memberDTO);
                if (result) {
                    System.out.println("Login successful : " + memberDTO.getId());
                }else {
                    System.out.println("Login failed");
                }
                break;
            case "naver" :
                NaverAuth naverAuth = new NaverAuth();
                boolean result1 = naverAuth.login(memberDTO);
                if (result1) {
                    System.out.println("Login successful : " + memberDTO.getId());
                }else {
                    System.out.println("Login failed");
                }
                break;
            case "kakao" :
                KakaoAuth kakaoAuth = new KakaoAuth();
                boolean result2 = kakaoAuth.login(memberDTO);
                if (result2) {
                    System.out.println("Login successful : " + memberDTO.getId());
                }else {
                    System.out.println("Login failed");
                }
                break;
            default:
                System.out.println("Invalid Auth Type");
                break;
        }

    }

}
