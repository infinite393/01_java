package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository { // (원래)db 연결부 - (지금)데이터 수행(으로 사용할것)

    private final static Member[] members;

    private static int count;

    static {
        members = new Member[10];
    }

    //멤버 등록하기
    public static boolean store(Member[] newMembers){

        for(int i = 0; i < newMembers.length; i++){

            if(count != 6) {
                members[count++] = newMembers[i];
            } else {
                System.out.println("정원 초과");
                return false;
            }

        }
        return true;
    }


    public static Member[] findAllMembers() {

        return members;
    }
}
