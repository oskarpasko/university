package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4{
    private static int n, suma, l;
    static Scanner in = new Scanner(System.in);
    static Random liczba = new Random();

    public static int suma(){
        System.out.println("Podaj n");
        n = in.nextInt();

        if(n<0){
            System.out.println("Podaj doatnie n");
        }else{
            while(n>0){
                l = liczba.nextInt(-11, 45);
                if(n % 2 == 0){
                    suma += n;
                }
                n--;
            }
        }

        return suma;
    }
}
