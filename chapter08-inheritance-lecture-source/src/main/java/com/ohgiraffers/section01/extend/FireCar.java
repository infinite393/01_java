package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        super();
    }

    @Override
    public void soundMorn() {
        if(isRunnig()){
            System.out.println("빠앙 빠아앙~~~~");
        }else {
            System.out.println("소방차가 주행중이 아닙니다");
        }
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void sprayWater(){
        if(isRunnig()){
            System.out.println("주행중일 때는 물을 뿌릴 수 없습니다");

        }else {
            System.out.println("불난 곳을 발견합니다. 물을 뿌립니다");
        }
    }
}
