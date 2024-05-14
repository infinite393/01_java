package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사 해놓은 것이다
        * 서로 다른 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다
        */

        /*
        * 깊은 복사를 하는 방법은 4가지가 있다
        * 1. for문을 이용한 동일 인덱스 복사
        * 2. object의 clone을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Array의 copy()를 이용한 복사
        *
        * 이 중 가장 높은 성능은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이다
        * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copy() 메소드이다
        * clone()의 경우 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 갖는다
        */


        System.out.println("---------------");
        String[] ok  = new String[]{"hello", "world",":D"};
        print(ok);

        // 1. for 문을 이용한 동일한 인덱스 값 복사

        System.out.println("------[for]-------");
        String[] coppyArr1 = new String[10];
        for (int i = 0; i < ok.length; i++ ) {
            coppyArr1[i] = ok[i];
        }

        print(coppyArr1);

        //clone() 이용한 복사
        System.out.println("------[clone]-----");
        String[] coppyArr2 = ok.clone();
        print(coppyArr2);

        //arrayCopy()를 이용한 복사
        System.out.println("------[arraycopy]------");
        String[] coppyArr3 = new String[10];
        System.arraycopy(ok, 0, coppyArr3, 0, 3);

        print(coppyArr3);

        //copyOf()를 이용한 복사
        System.out.println("------[copyOf]---------");
        String[] coppyArr4 = Arrays.copyOf(ok,ok.length);
        print(coppyArr4);




    }

    public  static  void print(String[] iarr) {
        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        System.out.println("-------print실행-------");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

}
