package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class MemberService { // application 의 명령을 실행할 곳

    public void signUpMembers() {

        Member[] members = new Member[5];

        members[0] = new Member(1,"user01","pass01","이나래",33,'F');
        members[1] = new Member(2,"user02","pass02","Alice",16,'F');
        members[2] = new Member(3,"user03","pass03","Bob",48,'M');
        members[3] = new Member(4,"user04","pass04","Moo",10,'M');
        members[4] = new Member(5,"user05","pass05","Cherry",23,'F');

        MemberRegister memberRegister = new MemberRegister();

        memberRegister.regist(members);

    }

    public void showAllMembers() {

        MemberFinder finder = new MemberFinder();

        System.out.println("------가입된 회원 목록-------");

        for (Member member : finder.findAllMembers()) {

            if(member != null) {
                System.out.println(member.getInfo());
            } else {
                System.out.println("회원정보가 비어있습니다");
            }

        }
        System.out.println("-----회원 조회 완료-----");


    }

}
