package main.java.com.ohgiraffers.section02.encapsulation.problem01;

public class Monster {

    String name;

    int hp;

    String nickname;

    public  void setHP(int hp) {

        if (hp > 0) {

            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다");
            this.hp = hp;

        } else {

            System.out.println("음수값이 입력되어 몬스터의 체력을 0 으로 변경합니다");
            this.hp = 0;

        }

    }

}
