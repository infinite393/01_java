package main.java.com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {


        /*
        * time 패키지는 jdk 1.8 버전에서 추가된 기능이다
        * Date, Calendar 가 가지고 있는 단점을 해소하기 위해 탄생되었다
        *
        * time 패키지의 하위 패키지
        *   java.time
        *       .chrono : ISO-8601(국제표준) 에 정의된 달력 시스템을 위한 클래스들을 제공한다
        *       .format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
        *       .temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
        *       .zone : 시간대에 관련된 기능 제공
        *
        * 자주 쓰는 클래스
        * LocalTime, LocalDate, LocalDateTime, ZoneDateTime 등이 있다
        */

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime timeOf = LocalTime.of(23, 59, 59);
        System.out.println(timeOf);

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate dateOf = LocalDate.of(2009,1,1);
        System.out.println(dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        LocalDateTime dateTimeOf = LocalDateTime.of(2009,1,1,2,59);
        System.out.println(dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);

        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTimeOf);

    }
}
