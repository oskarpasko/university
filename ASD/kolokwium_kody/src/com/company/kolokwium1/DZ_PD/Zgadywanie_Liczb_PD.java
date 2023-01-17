package com.company.kolokwium1.DZ_PD;

import java.util.Random;

public class Zgadywanie_Liczb_PD {
    public static void main(String[] args) {
        // write your code here
        Random random = new Random();

        //deklaracja zmiennych: poczatek przedziłu, koniec przedziału, połowa przedziąłu
        int min_num = 0, max_num = 1000, half = 0;
        //losowanie liczby od 0 do 1000
        int random_num = random.nextInt(1001);

        System.out.println("Liczba do zgadnięcia: " + random_num);

        while(true)
        {
            //wzrór zwracający zawsze połowe przedziału
            half = ((max_num - min_num)/2)+min_num;

            if(half > random_num)
            {
                System.out.println("Liczba " +half+" jest za duża!");
                max_num = half-1;
            }else if(half < random_num)
            {
                System.out.println("Liczba " +half+ " jest za mała!");
                min_num = half+1;
            }else{
                System.out.println("Zgadłeś, to liczba: " + half);
                break;
            }
        }
    }
}
