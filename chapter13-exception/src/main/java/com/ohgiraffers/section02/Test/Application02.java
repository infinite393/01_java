package main.java.com.ohgiraffers.section02.Test;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        try {

            exceptionTest.checkEnoughMoney(1000,-5000);

        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        } catch (PriceNegativeException | MoneyNegativeException e) {
            e.printStackTrace();
        } catch (NegativeException e) {
            throw new RuntimeException(e);
        } finally {
            // 무조건 마지막에 동작
            System.out.println("hi :D");
        }

    }
}
