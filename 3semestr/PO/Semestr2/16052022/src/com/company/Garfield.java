package com.company;

public class Garfield implements FatCat{
    @Override
    public void Nazwij() {
        System.out.println("Kot o imieniu Garfield");
    }

    @Override
    public void Jedz() {
        System.out.println("Codziennie je Lasagne");
    }

    @Override
    public void Przytyj() {
        System.out.println("Przez jedzenie tyje caly czas.");
    }
}
