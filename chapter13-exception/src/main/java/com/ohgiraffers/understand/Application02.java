package main.java.com.ohgiraffers.understand;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application02 {

    public static void main(String[] args) {

        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(((int) (Math.random() * 45)) + 1);
        }

        System.out.println(lotto);

        Set<Integer> mylotto = new TreeSet<>();

        while (mylotto.size() < 6) {
            mylotto.add(((int) (Math.random() * 45)) + 1);
        }

        System.out.println(mylotto);

        if (lotto == mylotto) {
            System.out.println("당첨");
        } else {
            System.out.println("다음 기회에...");
        }

    }

}
