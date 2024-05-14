package main.java.com.ohgiraffers.section02.encapsulation.problem01;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        // 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다

        // 1번 몬스터 생성
        Monster monster1 = new Monster();

        //이름과 체력 변경
        monster1.name = "두치";
        monster1.hp = 200;
        monster1.nickname = "chichi";

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        // 2번 몬스터 생성
        Monster monster2 = new Monster();

        //이름과 체력 변경
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        monster2.nickname = "gguggu";

        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        System.out.println("monster2.nickname = " + monster2.nickname);

        //3번 몬스터 생성
        Monster monster3 = new Monster();

        //이름과 체력 닉네임 변경
        monster3.name = "쿠앙";
        System.out.println("monster3 = " + monster3.name);

        monster3.nickname = "kuku";
        System.out.println("monster3 = " + monster3.nickname);

        monster3.setHP(-100);
        System.out.println("monster3 = " + monster3.hp);

        // 4번 몬스터 생성
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.nickname = "shushu";
        Scanner sc2 = new Scanner(System.in);
        System.out.println("hp를 입력하세요");
        int hp2 = sc2.nextInt();
        monster4.setHP(hp2);
        System.out.println(monster4.name+"("+monster4.nickname+")" +"의 hp는 " + monster4.hp);

        Scanner sc = new Scanner(System.in);
        System.out.println("몬스터의 이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("몬스터의 닉네임을 입력하세요");
        String nickname = sc.nextLine();
        System.out.println("몬스터의 hp를 입력하세요");
        int hp = sc.nextInt();
        monster3.setHP(hp);
        System.out.println(name+"("+nickname+")" +"의 hp는 " + monster3.hp);



    }

}
