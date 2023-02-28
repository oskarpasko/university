package com.company;

public class Zadanie3 {

    private static String nazwa, opis;
    private static int n, x;

    public Zadanie3(String nazwa, String opis, int n, int x){
        this.nazwa = nazwa;
        this.opis = opis;
        this.n = n;
        this.x = x;

        System.out.println("("+nazwa+" + "+opis+")");
        System.out.println("Liczba chromosomow n: "+n);
        System.out.println("Liczba x: "+x);
    }

    public Zadanie3 klon(){
        Zadanie3 klon = new Zadanie3("Nowa nazwa", "Nowy opis", 0, 0);
        klon.nazwa = nazwa;
        klon.opis = opis;
        klon.n = n;
        klon.x = x;
        return klon;
    }

}
