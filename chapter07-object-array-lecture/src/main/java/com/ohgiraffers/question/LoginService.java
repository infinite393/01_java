package main.java.com.ohgiraffers.question;

import main.java.com.ohgiraffers.section02.uses.Member;

import java.util.Scanner;

public class LoginService {

    public void signUp(){



        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 입력하세요");

        System.out.println("id를 입력하세요:");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요:");
        String pwd = sc.nextLine();
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("비밀번호를 확인해주세요");
        String pwd1 = sc.nextLine();



        if(pwd.equals(pwd1)) {
            User users = new User(id,pwd,name);
            System.out.println(users.getInfo());

            System.out.println("회원가입이 완료되었습니다");

        } else {
            System.out.println("회원가입을 다시 진행해주세요.");
        }





//        users[1] = new User("june@gamil.com","pwd01","june");
//        users[2] = new User("july@gmail.com","pwd02","july");
//        users[3] = new User("jane@gmail.com","pwd03","jane");
//        users[4] = new User("john@naver.com","pwd04","john");
//        users[5] = new User("july01@gmial.com","pwd04","july");
//        users[6] = new User("jesica@naver.com","pwd05","jessica");
//        users[7] = new User("anne123@naver.com","pwd06","anne");
//        users[8] = new User("king@gmail.com","pwd07","bob");
//        users[9] = new User("kong@gmail.com","pwd08","rily");





    }

    public void login(){


     LoginService loginService = new LoginService();

        for (User users : loginService.findAllUsers()) {

            if (users != null) {
                System.out.println(users.getInfo());
                System.out.println("로그인이 완료되었습니다");
            } else {
                System.out.println("회원이 아닙니다. 회원가입 해주세요"); return;
            }

        }



    }

    public User[] findAllUsers() {

        return LoginRepository.findAllUsers();

    }


}
