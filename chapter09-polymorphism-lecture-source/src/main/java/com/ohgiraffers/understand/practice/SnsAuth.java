package main.java.com.ohgiraffers.understand.practice;

public interface SnsAuth {


    String googleAuth(MemberDTO email);

    String kakaoAuth(MemberDTO email);

    String naverAuth(MemberDTO email);
}
