package main.java.com.ohgiraffers.section02.encapsulation.problem03;



public class Application01 {
    public static void main(String[] args) {

        // 몬스터 객체를 여러개 생성한다

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setName("chichi");
        monster1.setHP(100);

        System.out.println(monster1.getInfo());

    }

}
