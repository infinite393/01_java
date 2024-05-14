package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차 정렬

        // 초기 배열 설정

        int[] iarr = {1,2,3,4,5};

        for (int i = 1; i < iarr.length; i++) {

            for (int j = 0; j < i; j++) {

                if(iarr[i] < iarr[j]) {

                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;

                }
            }
        }

        System.out.println("-----출력-------");

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

    }
}
