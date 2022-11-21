package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);

        System.out.println("----- Zadanie 3 -----");
        CheckAdres checkadres = new CheckAdres();

        System.out.println("Podaj ulice");
        String ulica = in.nextLine();
        System.out.println("Podaj nr domu");
        int nr_domu = in.nextInt();

        Adres adres = new Adres(checkadres.ulicaException(ulica),
                checkadres.nrDomuException(nr_domu));

        adres.adres();

        System.out.println("----- Zadanie 1 -----");

        System.out.println("Podaj liczbe");
        int liczba = in.nextInt();

        if(liczba < 0){
            throw new IllegalArgumentException("Liczba musi byc wieksza od 0" + liczba);
        }else {
            double wynik = Math.sqrt(liczba);
            System.out.println("Wynik= "+wynik);
        }

        System.out.println("----- Zadanie 2 -----");

        Checked check = new Checked();

        System.out.println("Podaj liczbe");
        int liczba2 = in.nextInt();
        int wynik=1;

        if(check.BlednaWartoscDlaSilniException(liczba2) == true){
            for(int i = 1; i<=liczba2 ;i++){
                wynik = wynik * i;
            }
            System.out.println(liczba2+"! = "+wynik);
        }
    }
}
