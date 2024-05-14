package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다

        String city1 = "New York";
        String city2 = "London";

        String travel;

        travel = city1;
        city1 = city2;
        city2 = travel;

        System.out.println("city1 " + city1);
        System.out.println("city2 " + city2);

        // 배열의 인덱시에 있는 값도 서로 변경할 수 있다
        String[] world = {"UK", "Australia", "Canada"};

        String travel2;
        travel2 = world[0];
        world[0] = world[1];
        world[1] = travel2;

        for (int i = 0; i < world.length; i++) {
            System.out.print(world[i] + " ");
        }

        System.out.println();
        System.out.println("------주소값------");

        System.out.println(world.toString());

    }
}
