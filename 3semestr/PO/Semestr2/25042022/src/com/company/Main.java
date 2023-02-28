package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Punkt p1 = new Punkt("Pk1", 1, 2);
        Punkt p2 = new Punkt("Pk2", 4, 6);
        Punkt p3 = new Punkt("Pk3", -1, -5);

        p1.opis();
        p1.zeruj();
        p1.opis();

        Okrag o1 = new Okrag("Pk4", 1, 6, "O1", 5);
        o1.opis();
        System.out.println("Okrag ma powierzchnie "+o1.getPowierzchnia());
        System.out.println("Okrag ma srednice "+o1.getSrednica());

        o1.setPromien(7);
        o1.opis();
        System.out.println("Okrag ma powierzchnie "+o1.getPowierzchnia());
        System.out.println("Okrag ma srednice "+o1.getSrednica());

        //Check second task, 2nd task is to fix, try in not classes, try that anoter 'thing'
//        Prostokat pros1 = new Prostokat(1, 2, "czorny");
//        System.out.println("Powierzchnia prostokąta: "+pros1.getPowierzchnia());
//        pros1.przesun(3,5);

        Samochod car = new Samochod();
        car.des();
        SamochodOsobowy caro = new SamochodOsobowy();
        caro.des();


    }
}
