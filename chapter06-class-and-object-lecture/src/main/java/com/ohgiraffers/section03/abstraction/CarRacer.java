package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    public void startUp() {

        /* this.car의 시동을 거는 메소드 */

        car.startUp();

    }

    public void stepAccelator(){

        /* this.car 를 앞으로 가게 하는 메소드 */

        car.go();

    }

    public void stepBreak() {

        /* this.car 를 멈추는 메소드 */

        car.stop();
    }

    public void turnOff() {

        /* this.car 시동을 끄는 메소드 */

        car.turnOff();

    }

}
