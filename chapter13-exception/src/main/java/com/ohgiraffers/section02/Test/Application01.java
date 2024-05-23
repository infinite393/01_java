package main.java.com.ohgiraffers.section02.Test;

import main.java.com.ohgiraffers.section02.exception.NegativeException;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000,50000);
//            et.checkEnoughMoney(-5000,5000);
//            et.checkEnoughMoney(5000,-5000);
//            et.checkEnoughMoney(10000,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
