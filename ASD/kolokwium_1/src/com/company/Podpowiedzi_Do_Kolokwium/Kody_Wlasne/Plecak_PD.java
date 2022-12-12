package com.company.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Plecak_PD {
    final static int MAX_V = 10;
    final static int N = 6;

    final static int[] V = {6,2,3,2,3,1};
    final static int[] W = {6,4,5,7,10,2};
    final static int[] result = new int[100];

    public static void main(String[] args) {
        for(int i=0 ; i<N ;i++)
        {
            int w1, w2;

            if(N == 0 && V[0] > MAX_V) result[0] = 0;
            if(N == 0 && V[0] <= MAX_V) result[0] = W[0];

        }
    }
}
