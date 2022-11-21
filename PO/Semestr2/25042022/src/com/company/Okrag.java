package com.company;

public class Okrag extends Punkt{
    String nazwa;
    double promien;

    public Okrag(){
        promien = 0;
    }

    public Okrag(String name, double x, double y, String nazwa, double promien){
        super(name, x, y);
        this.nazwa = nazwa;
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return 3.14 * this.promien * this.promien;
    }

    public double getSrednica(){
        return 2 * 3.14 * this.promien;
    }

    public void setPromien(double p) {
        this.promien = p;
    }

    public double getPromien() {
        return promien;
    }

    public void opis(){
        super.opis();
        System.out.println("r="+this.promien);
    }
}
