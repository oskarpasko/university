package Logowanie;

public class MainPage {
    public static void main(String[] args) {

        Login log = new Login();

        System.out.println("Zalogowany!");
        System.out.println("Twoje hasło to: " + log.password);
    }
}
