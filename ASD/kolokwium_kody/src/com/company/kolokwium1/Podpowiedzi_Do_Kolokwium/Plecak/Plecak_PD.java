package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Plecak;

public class Plecak_PD {
    final static int N = 6;                // liczba przedmiotów
    final static int MAX_V = 10;           // objetość plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetości przedmiotów
    final static int[] W = {6,4,5,7,10,2}; // wartości przedmiotów

    public static void main(String[] args)
    {
        int [][] tab = new int[N][MAX_V+1];

        for (int v=0; v<=MAX_V; v++) //Wypelnianie pierwszego wiersza
        {
            if (v < V[0]) tab[0][v] = 0;
            else          tab[0][v] = W[0];
        }

        for (int i=1; i<N; i++) //Wypelnianie pozostalych wierszy
        {
            for (int v=0; v<=MAX_V; v++) //Po wszystkich objetosciach (kolumnach)
            {
                if (v < V[i]) tab[i][v] = tab[i-1][v];
                else
                {
                    int p1 = tab[i-1][v];// v, i = 5, p1 = 17
                    int p2 = W[i] + tab[i-1][v-V[i]];// v, i = 5 , p2 = 12
                    if (p1>p2) tab[i][v] = p1;// [5][5] = 17
                    else tab[i][v] = p2;
                }
            }
        }

        System.out.println("Wartosc: " + tab[N-1][MAX_V]);
        System.out.println("/*################################################################*/");

        //Wypisanie tablicy z rozwiazaniami
        System.out.println("v =\t    0    1    2    3    4    5    6    7    8    9   10");
        System.out.println("-----------------------------------------------------------");

        for (int i=0; i<N; i++)
        {
            System.out.print("i = " + i + "|");

            for (int j=0; j<=MAX_V; j++)
            {
                int val = tab[i][j];
                if (val<100) System.out.print(" ");
                if (val<10) System.out.print(" ");
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}
