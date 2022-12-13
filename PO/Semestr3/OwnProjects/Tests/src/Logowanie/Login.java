package Logowanie;

import java.util.Scanner;

public class Login {
    final public static String password = "test";
    public static String password_attempt = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj hasło!");

        password_attempt = in.next();

        if(password.equals(password_attempt)) MainPage.main(args);
        else System.out.println("Błędne hasło!");
    }
}
