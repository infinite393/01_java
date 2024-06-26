package main.java.com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 객체지향 프로그래밍이란?
        * 현실세계의 모든 사건(event)는 객체와 객체의 상호작용에 의해 일어난다는 세계관을
        * 프로그램을 만들 때 이용하여 새로운 세계를 창조하는 방법론이다
        * 현실 세계와 닮아있지만 현실 세계와 다른 점은,
        * 객체간의 상호 작용을 한다는 사실은 현실 세계와 동일하지만, 의인화 기법이 적용되어
        * 현실세계에서 불가능한 무생물이나 개념같은 것들도 하나의 주제로
        * 본인의 상태를 스스로 제어하고 행동하도록 한다는 것이 현실 세계와 다른 점이다
        * 모든 객체는 책임을 가지고 자신의 역할을 수행해야 한다
        * 또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한 책임을 가지고 있어야 한다
        */

        /*
        * 추상화란?
        * 공통된 부분을 추출하고 공통되지 않은 부분을 제거한다는 의미를 가지며, 추상화의 목적은 유연성을 확보하는 것이다
        * 유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며, 즉 재사용성이 높아질 수 있게 한다는 의미이다
        * 객체의 재사용성이 증가하면 중복 작성되는 코드를 줄일 수 있으며, 오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다
        */

        /*
        * 객체와 객체의 상호작용이란?
        * 객체와 객체는 메세지를 통해 서로 상호작용한다.
        * 메세지(메소드 호출)를 보내는 쪽은 송신자라고 하고,
        * 메세지를 수신하는 쪽을 수신자라고 한다
        * 수신자는 메시지를 전달 받아 그 메시지에 해당하는 내용을 처리하는 방법을 스스로 결정하고,
        * 그 결정한 방법대로 처리할 명령어들을 순차적으로 기술한 것을 메소드라고 한다
        * 상호작용에 중요한 것은 메시지를 송수신하고 그 방법을 기술하여 메세지에 응답하는 상호작용을 설계하는 것이다
        * 따라서 객체를 설계할 때는 속성은 부가적이며 적절한 책임을 가진 객체들간의 주고 받는 메세지를 이용해
        * 상호작용하는 것을 설계하는 것을 의미한다
        * 즉, 필드보다는 메소드를 중점적으로 추상화기법을 적용하여 객체를 설계하고,
        * 그 객체를 구현하는 방법으로 설계한 대로 클래스를 작성하는 것이다.
        * 이것을 추상화라고 부른다.
         */


        /*
        * 프로그램 개요
        * 카레이서가 자동차를 운전하는 프로그램
        *
        * 시스템 요구사항
        * 1. 카레이서는 시동 걸기, 엑셀 밟기, 브레이크 밟기, 시동 끄기를 할 수 있다
        * 2. 자동차는 시동 걸기, 앞으로 가기, 멈추기, 시동 끄기를 할 수 있다
        * 3. 자동차는 처음에는 멈춘 상태로 대기하고 있는다
        * 4. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 있다
        * 5. 카레이서가 엑셀을 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h 씩 증가하며 앞으로 나간다
        * 6. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다
        * 7. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다
        * 8. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않느다
        * 9. 자동차가 달리는 중이라면 시동을 끌 수 없다
        */


        /*
        * 프로그램 설계하기
        * 1. 필요한 객체를 도출
        *   - 플레이어(사용자), 카레이서, 자동차
        *
        * 2. 객체간 상호작용
        *   - 카레이서가 수신할 수 있는 메세지 (카레이서가 해야 하는 일)
        *       1. 시동을 걸어라
        *       2. 엑셀을 밟아라
        *       3. 브레이크를 밟아라
        *       4. 시동을 꺼라
        *
        *   - 자동차가 수신할 수 있는 메세지 (자동차가 해야 하는 일)\
        *       1. 시동을 걸어라
        *       2. 앞으로 가라
        *       3. 멈춰라
        *       4. 시동을 꺼라
        *
        * 3. 커뮤니케이션 다이어그램
        *   1. 시동 걸기
        *       [사용자] ------> 시동을 걸어라 -------> [카레이서] ------> 시동을 걸어라 ------> [자동차]
        *                   <-------------                      <--------------
        *   2. 가속 하기
        *       [사용자] ------> 엑셀을 밟아라 -------> [카레이서] ------> 앞으로 가라 ------> [자동차]
        *                   <-------------                      <--------------
        *   3. 정지하기
        *       [사용자] ------> 브레이크를 밟아라 -------> [카레이서] ------> 멈춰라 ------> [자동차]
        *                   <-------------                      <--------------
        *   4. 시동끄기
        *       [사용자] ------> 시동을 꺼라 -------> [카레이서] ------> 시동을 꺼라 ------> [자동차]
        *                   <-------------                      <--------------
        *
        * 4. 클래스 설계하기
        *   1. 카레이서 클래스
        *       - 속성 : 자동차
        *       - 행워 : 시동을 걸어라, 엑셀을 밟아라, 브레이크를 밟아라, 시동을 꺼라
        *   2. 자동차 클래스
        *       - 속성 : 시동 상태
        *       - 행위 : 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
        *
        *
        *
        */

        CarRacer carRacer1 = new CarRacer();

        Scanner sc = new Scanner(System.in);
        System.out.println("--카레이싱 프로그램 ----");
        System.out.println("1. 시동걸기");
        System.out.println("2. 전진");
        System.out.println("3. 정지");
        System.out.println("4. 시동끄기");
        System.out.println("9. 프로그램 종료");

        while (true) {


            System.out.println("메뉴 선택 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    carRacer1.startUp(); break;
                case 2:
                    carRacer1.stepAccelator(); break;
                case 3:
                    carRacer1.stepBreak(); break;
                case 4:
                    carRacer1.turnOff(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다"); break;
            }

            if(num == 9) {
                break;
            }

        }



    }

}
