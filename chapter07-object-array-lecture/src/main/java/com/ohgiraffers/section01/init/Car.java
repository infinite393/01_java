package main.java.com.ohgiraffers.section01.init;

public class Car {

    private String modelName;

    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {

        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed(){
        System.out.println(modelName + "가 최고 시속 " + maxSpeed + "km/h으로 달립니다");
    }

}
