package com.company;

import java.util.Scanner;

public class Zadanie5 {
    private static String slowo;
    static Scanner in = new Scanner(System.in);
    private static int check = 1;
    private static int i, p = 0;
    static String[] array = {};

    public static void check() {
        System.out.println("Wpisz slowo");
        slowo = in.nextLine();

        char[] ch = new char[slowo.length()];

        //Przetworzenie stringu na tablice znaków
        for (i = 0; i < slowo.length(); i++) {
            ch[i] = slowo.charAt(i);
        }

        while(p < slowo.length()) {
            if (ch[p] == ch[slowo.length() - 1 - p]) {
                check = 1;
            }else{check = 0; break;}
            p++;
        }

        if(check == 1){
            System.out.println("Słowo jest palindromem");
        }else System.out.println("Słowo nie jest palindromem");

    }
}
