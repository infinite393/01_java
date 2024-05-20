package main.java.com.ohgiraffers.understand.answer.auth;


import main.java.com.ohgiraffers.understand.answer.dto.MemberDTO;

public class NaverAuth implements SnsAuth{

    MemberDTO memberDTO1 = new MemberDTO("naver","naver");

    @Override
    public boolean login(MemberDTO memberDTO) {
        if(memberDTO1.getId().equals(memberDTO.getId())&&memberDTO1.getPw().equals(memberDTO.getPw())){
            return true;
        } else {
            return false;
        }
    }
}
