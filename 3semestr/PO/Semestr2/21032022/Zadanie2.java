package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadanie2 {
    private static int iledot=0, ileuj=0, sumdot=0, sumuj=0, i;
    static int[] tab = new int[10];
    static Scanner in = new Scanner(System.in);

    public static void wypisz(){
        System.out.println("Podaj 10 dowolnych liczb całkowitych");

        for(i = 0; i<10 ;i++){
            System.out.println("Podaj "+(i+1)+" liczbe");
            tab[i] = in.nextInt();

            if(tab[i] >= 0){
                iledot++;
                sumdot += tab[i];
            }else{
                ileuj++;
                sumuj += tab[i];
            }
        }

        System.out.println("Ilość liczb dodatnich: "+iledot);
        System.out.println("Suma liczb dodatnich: "+sumdot);
        System.out.println("Ilość liczb ujemnych: "+ileuj);
        System.out.println("Suma liczb ujemnych: "+sumuj);

    }

}
