package main.java.com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Test02 {
    public static void main(String[] args) {

        Test02 newProfile = new Test02();

        newProfile.newName("Hello","World");
        newProfile.newAge(22,33);
        newProfile.newAddress("london","newyork");

        String test1 = newProfile.newName("Hello","World");
        System.out.println(test1);

        String test2 = newProfile.newAge(22,33);
        System.out.println(test2);

        String test3 = newProfile.newAddress("london","newyork");
        System.out.println(test3);


        newProfile.newMessage();


    }

    public String newName (String a, String b) {

        return a + " and " + b;
    }

    public String newAge (int a, int b) {

        return a + "☺\uFE0E /"+ b; // 더 큰자료형으로(int x)
    }

    public String newAddress (String a, String b) {

        return a + "or" + b;
    }

    public void newMessage () {

        System.out.println("Welcome! :D");
    }
}
