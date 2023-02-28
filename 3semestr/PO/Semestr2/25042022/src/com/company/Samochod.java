package com.company;

import java.util.Scanner;

public class Samochod {
    public String marka, model, nadwozie, kolor, rok;
    public double przebieg;

    public Scanner in = new Scanner(System.in);

    Samochod(){
        System.out.println("Podaj marke");
        marka = in.nextLine();
        System.out.println("Podaj model");
        model = in.nextLine();
        System.out.println("Podaj nadwozie");
        nadwozie = in.nextLine();
        System.out.println("Podaj kolor");
        kolor = in.nextLine();
        System.out.println("Podaj rok");
        rok = in.nextLine();
        System.out.println("Podaj przebieg");
        przebieg = in.nextDouble();
    }

    Samochod(String marka, String model, String nadwozie, String kolor, String rok, double przebieg){
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rok = rok;
        this.przebieg = przebieg;
    }

    void check(){
        if(this.przebieg < 0){
            System.out.println("Wpisz poprawny przebieg");
            this.przebieg = in.nextDouble();
        }
    }

    void des(){

        check();

        System.out.println("Marka: "+this.marka);
        System.out.println("Model: "+this.model);
        System.out.println("Nazdwozie: "+this.nadwozie);
        System.out.println("Kolor: "+this.kolor);
        System.out.println("Rok: "+this.rok);
        System.out.println("Przebieg: "+this.przebieg);
    }
}
