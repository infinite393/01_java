package main.java.com.ohgiraffers.section01.practice.dto;

import java.util.Date;

public class ReservationDTO {

    private int num;

    private String name;

    private String country;

    private int reserveDate;

    private Date date;

    public ReservationDTO() {
    }

    public ReservationDTO(int num, String name, String country, int reserveDate, Date date) {
        this.num = num;
        this.name = name;
        this.country = country;
        this.reserveDate = reserveDate;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(int reserveDate) {
        this.reserveDate = reserveDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "[" + num + "]" +
                ", name : '" + name + '\'' +
                ", country :'" + country + '\'' +
                ", reserveDate :" + reserveDate +
                ", date : " + date +
                '}';
    }
}
