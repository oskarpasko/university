package com.company;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnosc, ilosc;

    SamochodOsobowy(){
        System.out.println("Podaj wage");
        waga = in.nextDouble();
        System.out.println("Podaj pojemnosc");
        pojemnosc = in.nextDouble();
        System.out.println("Podaj ilosc osob");
        ilosc = in.nextDouble();
    }

    SamochodOsobowy(String marka, String model, String nadwozie, String kolor, String rok, double przebieg, double waga, double pojemnosc, double ilosc){
        super(marka, model, nadwozie, kolor, rok, przebieg);
        this.waga = waga;
        this.pojemnosc = pojemnosc;
        this.ilosc = ilosc;
    }

    void check(){
        if((this.waga<2) || (this.waga > 4.5)){
            System.out.println("Podaj poprawna wage");
            this.waga = in.nextInt();
        }
        if(this.pojemnosc<0.8 || (this.pojemnosc>3.0)){
            System.out.println("Podaj poprawna pojemnosc");
            this.pojemnosc = in.nextInt();
        }
    }

    void des(){
        super.des();

        check();
        System.out.println("Waga: "+this.waga);
        System.out.println("Pojemnosc: "+this.pojemnosc);
        System.out.println("Ilosc: "+this.ilosc);
    }
}
