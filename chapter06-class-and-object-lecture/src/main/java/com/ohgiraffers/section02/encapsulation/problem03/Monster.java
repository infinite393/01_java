package main.java.com.ohgiraffers.section02.encapsulation.problem03;

public class Monster {


    String kinds;

    String name;

    int hp;


    public void setInfo(String info) {

        this.kinds = info;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int hp) {

        if(hp>0) {
            System.out.println("정상적으로 체력이 입력 되었습니다.");
            this.hp = hp;
        } else {
            System.out.println("체력은 0보다 작거나 같을 수 없습니다");
            System.out.println("체력이 초기화되었습니다");
            this.hp = 0;
        }


    }

    public String getInfo(){

        return name + "의 종류는 " + kinds +" 이고, 체력은 " + hp + "입니다.";

    }



}
