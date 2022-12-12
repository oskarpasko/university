package com.company.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Plecak_DZ {
    final static int MAX_V = 10;
    final static int przedmioty = 6;

    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};

    public static int plecak(int przedmiot, int objetosc)
    {
        int w1, w2;

        if(przedmiot == 0 && V[0] > objetosc) return 0;
        if(przedmiot == 0 && V[0] <= objetosc) return W[0];

        w1 = plecak(przedmiot - 1, objetosc);
        if(przedmiot > 0 && V[przedmiot] > objetosc) return w1;

        w2 = W[przedmiot] + plecak(przedmiot-1, objetosc - V[przedmiot]);
        if(w2>w1) return w2;
        else return w1;
    }

    public static void main(String[] args) {
        System.out.println("Wartość: " + plecak(przedmioty-1, MAX_V));
    }
}
