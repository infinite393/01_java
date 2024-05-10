package main.java.com.ohgiraffers.section03.math;



public class Randomtest {
    public static void main(String[] args) {

        System.out.println(lotto1());

    }

    public static String lotto1 () {

        int randomNum1 = (int)(Math.random()*10)+1; //1~10
        int randomNum2 = (int)(Math.random()*10)+11; //11~20
        int randomNum3 = (int)(Math.random()*10)+21;//21~30
        int randomNum4 = (int)(Math.random()*10)+31;//31~40
        int randomNum5 = (int)(Math.random()*5)+41;//41~45

        return randomNum1 + "," + randomNum2 + "," +randomNum3 + "," + randomNum4 + "," + randomNum5;

    }


}
