package main.java.com.ohgiraffers.section01.understand.seller;

import main.java.com.ohgiraffers.section01.understand.Car.Car;
import main.java.com.ohgiraffers.section01.understand.Car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.Car.OldCar;

public class Seller {

    private String name;

    private double result;

    public Seller(String name) {
        this.name = name;
    }

    public void sale(Car[] cars){

        for(Car car : cars){
            if (car instanceof ElectricCar){
                ElectricCar electricCar = (ElectricCar) car;
                System.out.println(electricCar.getBrand() + "사의 " + electricCar.getName() + "을 판매하였습니다");
                result += electricCar.getPrice();
            }else{
                OldCar oldCar = (OldCar) car;
                System.out.println(oldCar.getBrand() + "사의 " + oldCar.getName() + "을 판매하였습니다");
                result += oldCar.getPrice();
            }
        }

    }

    @Override
    public String toString() {

        return name + " 사원의 총 수수료는 " + result + "원 입니다";
    }
}
