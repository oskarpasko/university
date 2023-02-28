package com.company;

import java.util.Date;

public class Zadanie2 {

    private static String nazwa;
    private static int pietra;
    private static int rok;

    public Zadanie2(String nazwa, int pietra, int rok) {
        this.nazwa = nazwa;
        this.pietra = pietra;
        this.rok = rok;
    }

    public static void description(){
        System.out.println("Nazwa: "+nazwa);
        System.out.println("Pietra: "+pietra);
        System.out.println("Lat: "+(2022-rok));
    }

}
