package main.java.com.ohgiraffers.section01.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application05 {
    public static void main(String[] args) {

        // 랜덤한 트럼프카드 뽑기

        String[] shapes = {"SPACE", "CLOVER", "HEART", "DIAMOND"};
        String[] colors = {"RED", "BLUE", "GREEN", "YELLOW", "PURPLE"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "JACK", "QUEEN", "KING", "ACE"};

//        int shapesNumber = (int)(Math.random() * shapes.length);
//        int chNumber = (int)(Math.random() * numbers.length);
//        int colorNumber = (int)(Math.random() * colors.length);
//
//        System.out.println(shapes[shapesNumber]+" " + colors[colorNumber]+" " + numbers[chNumber]);

        System.out.println(Arrays.toString(shapes) + " " + Arrays.toString(numbers));

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

    }
}
