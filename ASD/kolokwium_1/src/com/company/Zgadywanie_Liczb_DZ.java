package com.company;

import java.util.Random;

public class Zgadywanie_Liczb_DZ {
    public static void main(String[] args) {
        Random random = new Random();

        //deklaracja zmiennych: poczatek przedziłu, koniec przedziału, połowa przedziąłu
        int min_num = 0, max_num = 1000;
        //losowanie liczby od 0 do 1000
        int random_num = random.nextInt(1001);

        System.out.println("Liczba do zgadniecia: " + random_num);

        System.out.println(zgadnij(min_num, max_num, random_num));
    }

    public static int zgadnij(int min, int max, int random)
    {
        int half = ((max - min)/2) + min;

        if(half > random) return zgadnij(min, half-1, random);
        if(half < random) return zgadnij(half+1, max, random);
        else return half;
    }
}
