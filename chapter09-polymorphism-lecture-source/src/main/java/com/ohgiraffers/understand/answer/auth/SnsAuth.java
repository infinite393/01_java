package main.java.com.ohgiraffers.understand.answer.auth;

import main.java.com.ohgiraffers.understand.answer.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);
}
