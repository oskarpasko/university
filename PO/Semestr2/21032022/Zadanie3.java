package com.company;

import java.util.Scanner;

public class Zadanie3 {
    private static int n, suma;
    static Scanner in = new Scanner(System.in);


    public static int suma(){
        System.out.println("Podaj n");
        n = in.nextInt();

        if(n<0){
            System.out.println("Podaj doatnie n");
        }else{
            while(n>0){
                if(n % 2 == 0){
                    suma += n;
                }
                n--;
            }
        }

        return suma;
    }
}
