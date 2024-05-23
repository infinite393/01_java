package main.java.com.ohgiraffers.section03.uses;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            if(num < 0 || num > 100) {
                System.out.println("Invalid number");
            }else {
                System.out.println(num);
            }


        }
    }
}
