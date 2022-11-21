package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Zadanie3 {

private static int ile_pom;
private static Scanner in = new Scanner(System.in);
private static double avg, sum, pow, result;
private static int N;

public static void oblicz(){

    System.out.println("Ile pomiarów wykonałeś?");
    N = in.nextInt();

    double[] data = new double[N];

    for(int i = 0 ; i < N ; i++){
        System.out.println("Podaj "+(i+1)+". pomiar:");
        data[i] = in.nextDouble();
        sum += data[i];
    }

    avg = sum / N;

    for(int x = 0 ; x < N ; x++){
        pow += pow((data[x] - avg) , 2);
    }

    System.out.println(pow);

    result = pow/(N-1);

    System.out.println("Wynik wariancji: "+result);
}

}
