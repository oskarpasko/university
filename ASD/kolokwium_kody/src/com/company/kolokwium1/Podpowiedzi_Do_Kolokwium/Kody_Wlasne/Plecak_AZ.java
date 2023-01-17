package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Plecak_AZ {
    final static int N = 6;                // liczba przedmiotów
    final static int MAX_V = 10;           // objetość plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetości przedmiotów
    final static int[] W = {6,4,5,7,10,2};

    public static void pakujMale(int ilosc, int objetosc)
    {
        int[] v = {1, 2, 2, 3, 3, 6};
        int[] w = {2, 7, 4, 10, 5, 6};

        int wartosc = 0;

        for(int i=0 ;i<ilosc; i++)
        {
            if(v[i] <= objetosc)
            {
                wartosc += w[i];
                objetosc -= v[i];
            }
        }

        System.out.println("Wartość(MALE): " + wartosc);
    }

    public static void pakujCenne(int ilosc, int objetosc)
    {
        int[] v = {3, 2, 6, 3, 2, 1};
        int[] w = {10, 7, 6, 5, 4, 2};

        int wartosc = 0;

        for(int i=0 ;i<ilosc; i++)
        {
            if(v[i] <= objetosc)
            {
                wartosc += w[i];
                objetosc -= v[i];
            }
        }

        System.out.println("Wartość(CENNE): " + wartosc);
    }

    public static void main(String[] args) {
        pakujMale(N, MAX_V);
        pakujCenne(N, MAX_V);
    }
}
