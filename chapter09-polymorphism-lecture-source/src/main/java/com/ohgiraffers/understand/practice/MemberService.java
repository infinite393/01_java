package main.java.com.ohgiraffers.understand.practice;

public class MemberService implements SnsAuth {

// memberDTO 클래스를 매개변수로 받고
// 기존에 있는 사용자와 같은지 확인
// login() signUp() 구현

    @Override
    public String googleAuth(MemberDTO email) {
        return email + "님 로그인 되었습니다";
    }

    @Override
    public String kakaoAuth(MemberDTO email) {
        return email + "님 로그인 되었습니다";
    }

    @Override
    public String naverAuth(MemberDTO email) {
        return email + "님 로그인 되었습니다";
    }
}
