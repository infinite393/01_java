package main.java.com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {

        /*
         * LinkedHashSet 클래스
         *  HashSet 이 가지는 기능을 모두 가지고 있음
         *  추가적으로 저장 순서를 유지하는 특징을 가지고 있다
         *  jdk 1.4 부터 제공하고 있다
         */


        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println(lhset);

        System.out.println(lhset.size());

        //오름차순 정렬

        TreeSet<String> test = new TreeSet<>(lhset);
        System.out.println(test);


    }
}
