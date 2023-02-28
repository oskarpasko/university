package com.company;

public class Main {

    final static int N = 6;                // liczba przedmiotów
    final static int MAX_V = 10;           // objetość plecaka
    final static int[] V = {6,2,3,2,3,1};  // objetości przedmiotów
    final static int[] W = {6,4,5,7,10,2}; // wartości przedmiotów
    static int P(int i, int v)
    {
        int w2; // wartość, gdy bierzemy i-ty przedmiot if(i==0&&v<V[0]) return0;
        if (i == 0 && v >= V[0]) return W[0];
        // wartość, gdy nie bierzemy i-tego przedmiotu
        int w1 = P(i - 1, v);
        if (i > 0 && v < V[i]) return w1;
        w2 = W[i] + P(i-1,v-V[i]);
        if (w2 > w1) // gdy i > 0 && v >= V[i]
            return w2;
        else
            return w1; }
    public static void main(String[] args)
    {
        System.out.println("Wartosc przedmiotow: " + P(N-1,MAX_V));
    }
}
