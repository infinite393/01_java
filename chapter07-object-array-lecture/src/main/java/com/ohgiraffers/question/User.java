package main.java.com.ohgiraffers.question;

public class User {

    private String id;

    private String pwd;

    private String name;


    public User() {
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
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

    public String getInfo() {

        return "ID: " + id + "\nPWD: " + pwd + "\nName: " + name;
    }


}
