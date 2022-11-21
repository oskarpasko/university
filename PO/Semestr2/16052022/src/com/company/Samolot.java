package com.company;

public class Samolot extends Pojazd implements Lata{
    public String rodzaj;

    public void setRodzaj(String rodzaj){
        this.rodzaj = rodzaj;
    }

    public String getRodzaj(){
        return rodzaj;
    }

    @Override
    public void Lec() {
        System.out.println(rodzaj+" sobie leci i leci.");
    }
}
