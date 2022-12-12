package com.company.Podpowiedzi_Do_Kolokwium.Plecak;

public class Plecak_DZ {
    final static int N = 6;                // liczba przedmiotow
    final static int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow

    static int plecak(int przedmiot, int objetosc)
    {
        int w1; // wartosc, gdy nie bierzemy i-tego przedmiotu
        int w2; // wartosc, gdy bierzemy i-ty przedmiot

// Jeżeli pakujemy tylko pierwszy przedmiot (z indexu [0]) i on:...

        // 1. nie miesci się w objętości plecaka
        // zwracamy maksymalną wartość plecaka jako 0
        // (poniewaz nic nie zapakowaliśmy)
        if (przedmiot == 0 && objetosc < V[0]) return 0;

        // 2. Jeśli mieści się w objętości plecaka
        // zwracamy wartość tego pierwszego przedmiotu
        if (przedmiot == 0 && objetosc >= V[0]) return W[0];

//Jeżeli pakujemy więcej niż jeden przedmiot czyli (przedmiot > 0)

        // obliczenie wartości przedmiotu (o jeden do tyłu w tabelce)
        w1 = plecak(przedmiot - 1, objetosc);

        // Jeżeli przedmiot nie z pierwszego indexu nie mieści się w plecaku
        // zwracamy wartość poprzedniego przedmiotu
        if (przedmiot > 0 && objetosc < V[przedmiot]) return w1;

        // obliczenie wartości aktualnego oraz poprzedniego przedmiotu
        w2 = W[przedmiot] + plecak(przedmiot - 1, objetosc - V[przedmiot]);

        // sprawdzenie która wartość przedmiotu jest wyższa
        // gdy i > 0 && v >= V[i]
        if (w2 > w1) return w2;
        else return w1;
    }

    public static void main(String[] args)
    {
        System.out.println("Wartosc przedmiotow: " + plecak(N - 1, MAX_V));
    }
}
