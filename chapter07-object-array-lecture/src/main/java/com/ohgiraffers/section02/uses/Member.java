package main.java.com.ohgiraffers.section02.uses;

public class Member { // 전달받을 멤버의 정보를 담을 클래스

    // 필드 작성

    private int num;

    private String id;

    private String pwd;

    private String name;

    private int age;

    private char gender;

    //alt+insert
    //constructor
    //select none
    //기본 생성자
    public Member() {
    }
    //alt+insert
    //constructor
    //shift(전체)
    //전체 필드 초기화 생성자
    public Member(int num, String id, String pwd, String name, int age, char gender) {

        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //alt+insert
    //getter and setter => select all
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo(){
        return "Member{"+"num: " + num + ", id = " + id + ". pwd = " + pwd + ", name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }

}
