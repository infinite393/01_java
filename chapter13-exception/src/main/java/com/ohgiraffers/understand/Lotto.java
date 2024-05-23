package main.java.com.ohgiraffers.understand;

import java.util.Date;

public class Lotto {

    private int mynum;

    private int lottonum;

    private Date date;

    public Lotto() {
        this.mynum = mynum;
        this.lottonum = lottonum;
        this.date = date;
    }

    public int getMynum() {
        return mynum;
    }

    public void setMynum(int mynum) {
        this.mynum = mynum;
    }

    public int getLottonum() {
        return lottonum;
    }

    public void setLottonum(int lottonum) {
        this.lottonum = lottonum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Lotto 결과 {" +
                "내 번호 : " + mynum +
                ", 당첨 번호 : " + lottonum +
                ", 당첨일 : " + date +
                '}';
    }
}
