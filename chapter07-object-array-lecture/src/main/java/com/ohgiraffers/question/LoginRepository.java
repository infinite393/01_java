package main.java.com.ohgiraffers.question;

public class LoginRepository {


    LoginService login = new LoginService();

    private static User[] users = new User[1];

    private static int count;

    public static boolean store(User[] newUsers) {
        for (int i = 0; i < newUsers.length; i++) {

            if (count != 10) {
                users = newUsers;
            } else {
                System.out.println("정원 초과");
                return false;
            }

        }
        return true;
    }

    public static User[] findAllUsers() {

        return users;
    }


}


