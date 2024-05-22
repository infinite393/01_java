package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 와일드 카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 떄,
        * 그 객체의 타입 변수를 제한할 수 있다
        * <?> : 제한 없음
        * <? extends Type> : 와일드카드 상한 제한(Type 과 Type 의 후손을 이용해 생성한 인스턴스만 가능)
        * <? super Type> : 와일드카드 하한 제한 (Type 과 Type 의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
        */

        //객체 생성
        WildCarFarm wildCarFarm = new WildCarFarm();

        // 농장 생성 자체가 불가능한 경우 매개변수로 사용할 수 없다
//        wildCarFarm.anyType(new RabbitFarm<Mammal>());
//        wildCarFarm.anyType(new RabbitFarm(Reptile));

        wildCarFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCarFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCarFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // extends 타입

//        wildCarFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCarFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCarFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        //super
        wildCarFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCarFarm.superType(new RabbitFarm<>(new Bunny()));
//        wildCarFarm.superType(new RabbitFarm<>(new DrunkenBunny()));

    }
}
