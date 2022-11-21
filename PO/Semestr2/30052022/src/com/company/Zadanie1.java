package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Zadanie1 {

    int ID;
    String imie;
    int wiek;

    public Zadanie1(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public void podajDane(){
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj imie");
        imie = in.nextLine();
        System.out.println("Podaj wiek");
        wiek = in.nextInt();
        if(wiek < 18) System.out.println("Nie możesz brać udziału w tej imprezie");
    }

    @Override
    public String toString() {
        return "Zadanie1{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zadanie1 zadanie1 = (Zadanie1) o;
        return ID == zadanie1.ID && wiek == zadanie1.wiek && Objects.equals(imie, zadanie1.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }
}
