package com.company;

import java.util.Scanner;

public class Zadanie1 {


    private static Scanner in = new Scanner(System.in);
    private static double avg, sum;
    private static int N;

    public static void oblicz() {

        System.out.println("Ile liczb?");
        N = in.nextInt();

        double[] data = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Podaj " + (i + 1) + ". liczbę:");
            data[i] = in.nextDouble();
            sum += data[i];
        }

        avg = sum / N;

        System.out.println("Suma: "+sum);
        System.out.println("Średnia: "+avg);
    }}
