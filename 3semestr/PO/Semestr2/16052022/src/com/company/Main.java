package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(" ----- Zadanie 1 ----- ");
        Statek statek = new Statek();
        statek.setRodzaj("Statek pasażerski");
        statek.Plyn();

        Samolot plane = new Samolot();
        plane.setRodzaj("Dwupłatowiec");
        plane.Lec();

        System.out.println(" ----- Zadanie 2 ----- ");
        Wieloryb rybka = new Wieloryb();
        rybka.setGatunek("Wieloryb oceaniczny");
        rybka.jedz();
        rybka.Plyn();
        rybka.wydalaj();
        rybka.Wynurz();
        rybka.Zanurz();

        System.out.println(" ----- Zadanie 3 ----- ");
        Garfield kot = new Garfield();
        kot.Nazwij();
        kot.Jedz();
        kot.Przytyj();
    }
}
