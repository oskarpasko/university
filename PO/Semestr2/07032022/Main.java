package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random losowa = new Random();

        /* Zadania */
        System.out.println("----- Zadanie 1 -----");
        zadanie1();

        System.out.println("----- Zadanie 2 -----");
        System.out.println("Podaj x");
        float x = in.nextFloat();
        System.out.println("Podaj y");
        float y = in.nextFloat();
        zadanie2(x, y);

        System.out.println("----- Zadanie 3 -----");
        System.out.println("Podaj liczbe");
        int l = in.nextInt();
        System.out.println(zadanie3(l));
        System.out.println("----- Zadanie 4 -----");
        System.out.println("Podaj liczbe");
        int li = in.nextInt();
        System.out.println(zadanie4(li));;

        System.out.println("----- Zadanie 5 -----");
        System.out.println("Podaj liczbe");
        float pot = in.nextFloat();
        System.out.println(zadanie5(pot));;

        System.out.println("----- Zadanie 6 -----");
        System.out.println("Podaj liczbe");
        float pier = in.nextFloat();
        System.out.println(zadanie6(pier));;

        System.out.println("----- Zadanie 7 -----");
        System.out.println("Podaj xa");
        int xa = in.nextInt();
        System.out.println("Podaj ya");
        int ya = in.nextInt();

        int aa = losowa.nextInt(xa, ya);
        int bb = losowa.nextInt(xa, ya);
        int cc = losowa.nextInt(xa, ya);
        System.out.println(zadanie7(aa, bb, cc));;


    }

    public static void zadanie1() {
        System.out.println("Jestem Oskar, mam 21 lat!");
    }

    public static void zadanie2(float a, float b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Iloczyn: " + (a * b));
        System.out.println("Iloraz: " + (a / b));
    }

    public static boolean zadanie3(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        } else return false;
    }

    public static boolean zadanie4(int licz) {
        if (licz % 3 == 0 && licz % 5 == 0) {
            return true;
        } else return false;
    }

    public static float zadanie5(float w) {

        return w = w * w * w;

    }

    public static double zadanie6(double pierwiastek) {
        pierwiastek = sqrt(pierwiastek);
        return pierwiastek;
    }

    public static boolean zadanie7(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            return true;
        } else return false;
    }


}
