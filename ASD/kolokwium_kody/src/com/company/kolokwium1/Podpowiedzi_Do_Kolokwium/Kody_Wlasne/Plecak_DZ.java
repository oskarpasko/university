package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Plecak_DZ {
    final static int MAX_V = 10;
    final static int N = 6;

    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};

    public static int plecak(int przedmiot, int objetosc)
    {
        if(przedmiot == 0 && objetosc < V[0]) return 0;
        if(przedmiot == 0 && objetosc >= V[0]) return W[0];

        int w1 = plecak(przedmiot-1, objetosc);
        if(przedmiot > 0 && objetosc < V[przedmiot]) return w1;

        int w2 = W[przedmiot] + plecak(przedmiot - 1, objetosc - V[przedmiot]);
        if(w2>w1) return w2;
        else return w1;
    }

    public static void main(String[] args) {
        System.out.println("Wartosc: "+plecak(N-1, MAX_V));
    }

}
