package main.java.com.ohgiraffers.section01.practice.run;

import main.java.com.ohgiraffers.section01.practice.comparator.AscendingReserveDate;
import main.java.com.ohgiraffers.section01.practice.dto.ReservationDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application01 {
    public static void main(String[] args) {

        List<ReservationDTO> reservelist = new ArrayList<>();

        reservelist.add(new ReservationDTO(1,"jhone","UK/london",240512, new Date()));
        reservelist.add(new ReservationDTO(2,"jessica","HK/hongkong",240515,new Date()));
        reservelist.add(new ReservationDTO(3,"heejin","KOREA/soeul",240615,new Date()));
        reservelist.add(new ReservationDTO(4,"keiko","JAPAN/tokyo",240315,new Date()));

        for (ReservationDTO rsvDTO : reservelist) {
            System.out.println(rsvDTO);
        }

        System.out.println();

        System.out.println("reserveDate 기준으로 오름차순");


        reservelist.sort(new AscendingReserveDate());

        for (ReservationDTO reservationDTO : reservelist) {
            System.out.println(reservationDTO);
        }

    }
}
