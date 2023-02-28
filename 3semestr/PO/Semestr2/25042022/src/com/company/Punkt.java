package com.company;

public class Punkt{
    public String name;
    public double x, y;

    public Punkt(){
        name= "Punkt";
        x = 0;
        y = 0;
    }

    public Punkt(String name, double x, double y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        this.x = 0;
        this.y = 0;
    }

    public void opis(){
        System.out.println(this.name + " ma wspolrzedne ("+this.x+", "+this.y+").");
    }

    public void przesun(double a, double b){
        this.x = x+a;
        this.y = y+b;
    }
}
