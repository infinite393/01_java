package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;

    private int speed;

    public void startUp() {

        if(isOn) {
            System.out.println("이미 시동이 걸려 있습니다");
        } else {
            this.isOn = true;
            System.out.println("시동이 걸렸습니다");
        }

    }

    public void go(){
        if(isOn) {
            if (speed == 0) {
                System.out.println("자동차가 출발합니다");
            }
            speed += 10;
            System.out.println("자동차는 시속");
        }



    }
}
