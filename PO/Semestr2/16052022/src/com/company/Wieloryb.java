package com.company;

public class Wieloryb extends Zwierze{

    public String gatunek;

    public void setGatunek(String gatunek){
        this.gatunek = gatunek;
    }

    public String getGatunek(){
        return gatunek;
    }

    @Override
    public void Plyn() {
        System.out.println(gatunek+" plynie pod woda");
    }

    @Override
    public void Wynurz() {
        System.out.println(gatunek+" wynurza sie raz dziennie");
    }

    @Override
    public void Zanurz() {
        System.out.println(gatunek+" zanurza sie 30 min");
    }

    @Override
    void jedz() {
        System.out.println(gatunek+" je mniejsze ryby");
    }

    @Override
    void wydalaj() {
        System.out.println(gatunek+" wydala jedzenie co 3 dni");
    }

    @Override
    public void Lec() {
        System.out.println("");
    }

    @Override
    public void Wyladuj() {
        System.out.println("");
    }
}
