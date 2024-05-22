package main.java.com.ohgiraffers.section01.practice.comparator;

import main.java.com.ohgiraffers.section01.practice.dto.ReservationDTO;

import java.util.Comparator;

public class AscendingReserveDate implements Comparator<ReservationDTO> {

    @Override
    public int compare(ReservationDTO o1, ReservationDTO o2) {

        int result = 0;

        if(o1.getReserveDate() > o2.getReserveDate()) {

            result = 1;
        } else if (o1.getReserveDate() < o2.getReserveDate()) {

            result = -1;

        }else {
            result = 0;
        }

        return result;

    }
}
