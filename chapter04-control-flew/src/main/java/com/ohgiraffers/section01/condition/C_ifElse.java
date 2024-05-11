package main.java.com.ohgiraffers.section01.condition;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C_ifElse {
    public void testSimpleIfElseIfStatement() {

        /*
        * [if-else-if 조건식]
        * if(조건식1){
        *       조건식1이 true일 때 실행할 명령문
        *   }else if(조건식2){
        *       조건식1이 false 이고 조건식2가 true일 때 실행할 명령문
        *   }else{
        *       위의 조건 2개가 모두 false일 경우 실행할 명령문
        *   }
        */


        // 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오 코드를 만들어보자

        System.out.println("너의 도끼가 어느 도끼냐? '금도끼' '은도끼' '쇠도끼' 중 선택");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if(line.equals("금도끼")){

            System.out.println("거짓말쟁이! 너에게는 아무런 도끼도 줄 수 없다");
            System.out.println("그렇게 산신령은 다시 연못속으로 사라졌다...");
            System.out.println("나무꾼은 잃어버린 쇠도끼도 찾을 수 없어 더이상 나무를 벨 수 없었다");

        }else if(line.equals("은도끼")){
            System.out.println("욕심이 과하지는 않지만 그래도 거짓말을 하고있구나");
            System.out.println("산신령이 쇠도끼를 연못 밖으로 던졌다");
            System.out.println("그렇게 산신령은 다시 연못속으로 사라졌다...");

        }else if(line.equals("쇠도끼")){

            System.out.println("장하구나 금도끼,은도끼,쇠도끼 다 가져가거라");
            System.out.println("나무꾼은 도끼를 팔아 부자가 됐다");

        }else {
            System.out.println("꺼지거라");
            System.out.println("그렇게 산신령은 다시 연못속으로 사라졌다...");
        }


        System.out.println("The End");

    }

    public void testNestedIfElseIfStatement() {


        /*
        * ohgiraffers 대학의 xx교수님은 학생들의 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있다
        * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
        * 60점 미만인 경우에는 'F'를 학점 등급으로 하는 기준이다
        * 추가로 각 등급의 중감점수(95,85,75,65)를 넘는 경우는 '*'를 붙여서 세분화 하다보니 신경쓸게 이만저만이 아니다
        * 그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다
        */

        System.out.println("이름을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("성적을 입력하세요");
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println(name+"학생의 학점은 " + "A" +" 입니다.");
            if(score >= 95) {
                System.out.println(name+"학생의 학점은 " + "A+" +" 입니다.");
                System.out.println("열심히 공부하셨네요. 축하합니다.");
            }
        }else if(score >= 80){
            System.out.println(name+"학생의 학점은 " + "B" +" 입니다.");
            if(score >= 85) {
                System.out.println(name+"학생의 학점은 " + "B+" +" 입니다.");
                System.out.println("축하합니다. 조금만 더 노력해보야요.");
            }
        }else if(score >= 70){
            System.out.println(name+"학생의 학점은 " + "C" +" 입니다.");
            if(score >= 75) {
                System.out.println(name+"학생의 학점은 " + "C+" +" 입니다.");
                System.out.println("더 열심히 공부합시다!");
            }
        }else if(score >= 60){
            System.out.println(name+"학생의 학점은 " + "D" +" 입니다.");
            if(score >= 65) {
                System.out.println(name+"학생의 학점은 " + "D+" +" 입니다.");
                System.out.println("아쉽네요.. 다음기회에..");
            }
        }else{
            System.out.println("F");
            System.out.println("재수강 확정!");
        }

        System.out.println("학점을 학생정보시스템에 등록해주세요");
        System.out.println("수고하셨습니다! 다음 학기에... :D");

    }
}
