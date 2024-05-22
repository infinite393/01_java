package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        List<BookDTO> booklist = new ArrayList<>();

        booklist.add(new BookDTO(1,"홍김동전","허균",50000));
        booklist.add(new BookDTO(2,"목민심서","정약용",30000));
        booklist.add(new BookDTO(3,"동의보감","허준",40000));
        booklist.add(new BookDTO(4,"삼국사기","김부식",45000));
        booklist.add(new BookDTO(5,"삼국유사","일연",20000));

//        Collections.sort(booklist);

        for (BookDTO bookDTO:booklist) {
            System.out.println(bookDTO);
        }

        System.out.println();
        System.out.println("====가격 오름차순 정렬=========");

        booklist.sort(new AscendingPrice());

        for (BookDTO bookDTO : booklist) {
            System.out.println(bookDTO);
        }
        System.out.println();

        System.out.println("=====책 제목을 기준으로 오름차순 정렬======");

        booklist.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle()) ;

            }
        });

        // 내림차순
//        booklist.sort(new Comparator<BookDTO>() {
//            @Override
//            public int compare(BookDTO o1, BookDTO o2) {
//                return o1.getTitle().compareTo(o2.getTitle()) * -1;
//
//            }
//        });


        for(BookDTO bookDTO : booklist) {
            System.out.println(bookDTO);
        }

        System.out.println();
        System.out.println("====작가 기준으로 오름차순 내림차순===");

        booklist.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        for (BookDTO bookDTO : booklist) {
            System.out.println(bookDTO);
        }


    }

}
