package name.java.com.ohgiraffers.section06.temary;

public class test {
    public static void main(String[] args) {

        /*
        * 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점, 4번 학생은 88점을 맞았다
        * 90-100 점 사이에 있는 학생은 합격, 아니라면 불합격을 출력
        */

        int student1 = 90;
        int student2 = 95;
        int student3 = 81;
        int student4 = 88;

        String result1 = (student1 >= 90)? "합격" : "불합격";
        String result2 = (student2 >= 90)? "합격" : "불합격";
        String result3 = (student3 >= 90)? "합격" : "불합격";
        String result4 = (student4 >= 90)? "합격" : "불합격";

        System.out.println("1번 학생 : " + result1);
        System.out.println("2번 학생 : " + result2);
        System.out.println("3번 학생 : " + result3);
        System.out.println("4번 학생 : " + result4);

        System.out.println("---------------------");


    }
}
