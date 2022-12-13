package Logowanie;

import java.util.Scanner;

public class Login {

    final static Person p1 = new Person("admin", "admin", "admin", "admin");

    public static String password = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj hasło!");
        password = in.next();

        if(password.equals(p1.getPassword())) MainPage.main(args);
        else System.out.println("Złe hasło!");
    }
}
