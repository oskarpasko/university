package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);

        System.out.println("----- Zadanie 1 -----");
        System.out.println("Podaj a");
        double aa = in.nextInt();
        System.out.println("Podaj b");
        double bb = in.nextInt();
        System.out.println("Podaj c");
        double cc = in.nextInt();
        zadanie1(aa, bb, cc);

        System.out.println("----- Zadanie 2 -----");
        System.out.println("Podaj x");
        double x2 = in.nextDouble();
        zadanie2(x2);

          System.out.println("----- Zadanie 3 -----");
          System.out.println("Podaj x");
          int x3 = in.nextInt();
          System.out.println("Podaj y");
          int y3 = in.nextInt();
          System.out.println("Podaj z");
          int z3 = in.nextInt();
          zadanie3(x3, y3, z3);

          System.out.println("----- Zadanie 4 -----");
          System.out.println("Czy pada deszcz?");
          boolean deszcz = in.nextBoolean();
          System.out.println("Czy jest autobus?");
          boolean autobus = in.nextBoolean();
          zadanie4(deszcz, autobus);

            System.out.println("----- Zadanie 5 -----");
            System.out.println("Czy masz znizke?");
            boolean znizka = in.nextBoolean();
            System.out.println("Czy dostales premie?");
            boolean premia = in.nextBoolean();
            zadanie5(znizka, premia);

        System.out.println("----- Zadanie 6 -----");
        System.out.println("Poodaj x");
        int x6 = in.nextInt();
        System.out.println("Poodaj y");
        int y6 = in.nextInt();

        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Reszta z dzielenia");

        int wybor = in.nextInt();

        zadanie6(wybor, x6, y6);
    }

    public static void zadanie1(double a, double b, double c){

        double delta = (b*b) - (4 * a * c);
        double x1, x2;

        if(delta > 0){
            System.out.println("Funkcja ma 2 miejsca zerowe");
            x1 = (-1 * b - sqrt(delta))/(2*a);
            x2 = (-1 * b + sqrt(delta))/(2*a);
            System.out.println("Miejsca zerowe: " + x1+", "+ x2);
        }else if (delta < 0){
            System.out.println("Funkcja nie ma miejsc zerowych");
        }else{
            System.out.println("Funkcja ma jedno miejsce zerowe");
            x1 = (-1 * b - sqrt(delta))/(2*a);
            System.out.println("Miejsca zerowe: " + x1);
        }

    }
    public static void zadanie2(double a2){

        double x2;

        if(a2 > 0){
            x2 = a2 * 2;
        }else if(a2 == 0){
            x2 = 0;
        }else{
            x2 = -3 * a2;
        }

        System.out.println("W funkcji a(x) x wynosi: " + a2);

        if(a2 >= 1) {
            x2 = a2 * a2;
        }else x2 = a2;

        System.out.println("W funkcji b(x) x wynosi: " + x2);

        if(a2 > 2){
            x2 =2 + a2;
        }else if( a2 == 2){
            x2 = 8;
        }else x2 = a2 - 4;

        System.out.println("W funkcji c(x) x wynosi: " + x2);

    }
    public static void zadanie3(int a3, int b3, int c3){

    int[] num = {0,0,0};

    if(a3 > b3 && a3 > c3){
        num[0] = a3;
        if(b3 > c3){
            num[1] = b3;
            num[2] = c3;
        }else{ num[1] = c3; num[2] = b3;}
    }else if(b3 > a3 && b3 > c3){
        num[0] = b3;
        if(a3 > c3){
            num[1] = a3;
            num[2] = c3;
        }else{ num[1] = c3; num[2] = a3;}
    }else {
        num[0] = c3;
        if(a3 > b3){
            num[1] = a3;
            num[2] = b3;
        }else {num[1] = b3; num[2] = a3;}
    }

        System.out.println(num[2]+", "+num[1]+", "+num[0]);
    }
    public static void zadanie4(boolean desz, boolean aut){

        if(desz == true && aut == true){
            System.out.println("Weż parasol, Dostaneisz się na uczelnie");
        }else if(desz == true && aut == false){
            System.out.println("Nie dostaniesz się na uczelnie");
        }else if(desz == false && aut == true){
            System.out.println("Dostaneisz się na uczelnie, miłego dnia i pięknej pogody");
        }

    }
    public static void zadanie5(boolean z, boolean p){

        if(z == false || p == true){
            System.out.println("Możęsz kupić samochód, żniżki nie ma na samochód");
        }else if(z == false || p == false){
            System.out.println("Zakup samochód trzeba dłożyć na później...");
        }else if(z == true || p == true){
            System.out.println("Możesz kupić samochód!");
        }

    }
    public static void zadanie6(int wyb, int a6, int b6){

        switch(wyb){
            case 1:
                System.out.println(a6 + b6);
                break;
            case 2:
                System.out.println(a6 = b6);
                break;
            case 3:
                System.out.println(a6*b6);
                break;
            case 4:
                System.out.println(a6%b6);
                break;
            default:
                System.out.println("Zły wybór!");
        }

    }
}
