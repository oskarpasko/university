package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her

        Zadanie1 zad1 = new Zadanie1(8, 2);

        System.out.println("----- Zadanie 1 -----");
        System.out.println("Pole: "+ Zadanie1.pole());
        System.out.println("Obwod: "+ Zadanie1.obwod());

        System.out.println("----- Zadanie 2 -----");

        Zadanie2 zad2 = new Zadanie2("Rzeszow", 2, 2000);
        zad2.description();

        System.out.println("----- Zadanie 3 -----");
        Zadanie3 zadanie3 = new Zadanie3("ciekawa nazwa", "ciekawy opis", 32, 12);
        zadanie3.klon();

    }
}
