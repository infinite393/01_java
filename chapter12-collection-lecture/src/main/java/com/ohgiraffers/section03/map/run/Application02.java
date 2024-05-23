package main.java.com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /*
         * Properties 란?
         * HashMap 으로 구현하여 사용 용법이 거의 유사하지만 key 와 value 모두 문자열만 사용할 수 있는 자료구조이다
         * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다
         */

        Properties pro = new Properties();

        pro.setProperty("driver","mysql.jdbc.driver.MysqlDriver");
        pro.setProperty("url","localHost");
        pro.setProperty("user","user");
        pro.setProperty("pass","pass");

        System.out.println(pro);

        System.out.println("==================================");

        try {
            pro.store(new FileOutputStream("driver.dat"),"jdbcDriver");
            pro.store(new FileWriter("driver.txt"),"jdbc Driver");
            pro.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        Properties pro2 = new Properties();

        try {
            pro2.load(new FileInputStream("driver.dat"));
            pro2.load(new FileReader("driver.txt"));
            pro2.loadFromXML(new FileInputStream("driver.xml"));
            pro2.list(System.out);

            System.out.println("===================");

            System.out.println(pro2.getProperty("driver"));
            System.out.println(pro2.getProperty("url"));
            System.out.println(pro2.getProperty("user"));
            System.out.println(pro2.getProperty("pass"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
