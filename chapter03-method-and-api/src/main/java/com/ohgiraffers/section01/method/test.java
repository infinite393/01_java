package main.java.com.ohgiraffers.section01.method;

public class test {
    public static void main(String[] args) {


        test profile = new test();

        System.out.println("Profile: ");
        profile.Name("Narae Lee");
        profile.Age(33);
        profile.Address("Souel");
        System.out.println("Accessed");

    }

    public String Name (String name) {

        System.out.println(name);

        return name;

    }

    public int Age (int age) {

        System.out.println(age);

        return age;
    }

    public static String Address (String address) {

        System.out.println(address);

        return address;
    }

}
