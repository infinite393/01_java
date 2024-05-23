package main.java.com.ohgiraffers.section05;

public class Application {
    public static void main(String[] args) {

        Job[] joblist = new Job[5];

    try {
        joblist[0] = new Job(1, "Back-end Developer");
        joblist[1] = new Job(2, "Front-end Developer");
        joblist[2] = new Job(3, "DevOps Engineer");
        joblist[3] = new Job(4, "DBA");
        joblist[4] = new Job(5, "PM");

        joblist[5] = new Job(6,"PL");
        joblist[6] = new Job(7,"BogData");

    }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }


        for (Job j : joblist) {
            System.out.println(j);
        }
    }
}
