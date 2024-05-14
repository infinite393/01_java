package main.java.com.ohgiraffers.section04.sort;

import java.util.Scanner;

public class testCity {
    public static void main(String[] args) {

    methodCity cityNames = new methodCity();

    Scanner sc = new Scanner(System.in);
    System.out.println("도시 이름을 입력해주세요");
    String city = sc.nextLine();
    String city2 = sc.nextLine();
    String city3 = sc.nextLine();

    String[] cityNew = {city, city2, city3};

    cityNames.cityNames(cityNew);

    }
}
