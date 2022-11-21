package com.company;

import java.util.Scanner;

public class Zadanie1 {

    private static int dlugosc, szerokosc;
    private static double pole, obwod, przekatna;

    public Zadanie1(int dlugosc, int szerokosc){
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public static double pole(){
        pole = dlugosc * szerokosc;

        return pole;
    }

    public static double obwod(){
        obwod = (2*dlugosc) + (2* szerokosc);

        return obwod;
    }


}
