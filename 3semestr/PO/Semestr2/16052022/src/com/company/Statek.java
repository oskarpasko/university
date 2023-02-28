package com.company;

public class Statek extends Pojazd implements Plywa{
    public String rodzaj;

    public void setRodzaj(String rodzaj){
        this.rodzaj = rodzaj;
    }

    public String getRodzaj(){
        return rodzaj;
    }

    @Override
    public void Plyn() {
        System.out.println(rodzaj+" plywa");
    }
}
