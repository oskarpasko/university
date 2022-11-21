package com.company;

public class Adres {
    private String ulica;
    private int numer_domu;

    public Adres(String ulica, int numer_domu) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
    }

    public void adres(){
        System.out.println("ul."+this.ulica+ " "+this.numer_domu);
    }
}
