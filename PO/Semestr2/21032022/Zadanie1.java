package com.company;

import java.util.Scanner;

public class Zadanie1 {
    private static int n, i, suma;
    private static double avg;

    public static double srednia(){
        System.out.println("Podaj liczbę studentów");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int tab[] = new int[n];

        while(i < n){
            System.out.println("Podaj liczbe pnk "+1+". studenta");
            tab[i] = in.nextInt();
            suma += tab[i];
            i++;
        }
        avg = suma / n;

        return avg;
    }
}
