package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        //얕은복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다

        String[] names = {"hello","world","good"};

        System.out.println("names의 hashcode : " + names.hashCode());

        // 메소드
        print(names);

        // 배열             //메소드
       String[] animals = getAnimals();

       System.out.println("------------");

       print(animals);

       String[] citys = {"newyork","london","seoul"};
       print(citys);


    }

    public static void print(String[] names) {

        System.out.println("hashcode : " + names.hashCode());

    }

    public static String[] getAnimals(){

        String[] animals = {"낙타","호랑이","돼지"};


        return animals;
    }
}
