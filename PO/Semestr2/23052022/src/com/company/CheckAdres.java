package com.company;

public class CheckAdres {
    public String ulicaException(String ulica){
        if(ulica == null){
            throw new NullPointerException("Ulica nie moze byc pusta");
        }else if(ulica == ""){
            throw new IllegalArgumentException("Nazwa ulicy nie moze byc pusta");
        }else return ulica;
    }

    public int nrDomuException(int nr){
        if(nr < 0){
            throw new IllegalArgumentException("Nr domu nie moze byc ujemny");
        }else return nr;
    }
}
