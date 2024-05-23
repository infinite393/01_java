package main.java.com.ohgiraffers.section02.Test;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NegativeException, NotEnoughMoneyException {

        System.out.println("가지고 있는 돈은 " +  money + " 원 입니다");

        if ( price < 0 ) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if ( money < 0) {

            throw new MoneyNegativeException("가직 있는 돈은 음수일 수 없습니다.");
        }

        if( money < price) {
            throw new NotEnoughMoneyException("가진 돈 : " + money + " 상품 가격 : " + price);
        }

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요");
    }
}
