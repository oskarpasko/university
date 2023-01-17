package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

import java.util.Random;

public class Lody_MC {
    final static int[][] koszty = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    public static void main(String[] args) {
        Random rand = new Random();

        int minSum = Integer.MAX_VALUE;
        String bestRozw = "";
        int start = -1;

        for(int i=0;i<100;i++)
        {
            int suma = 0;
            String rozw = "";
             int wiersz = rand.nextInt(koszty.length);
             int globalWiersz = wiersz;
             rozw += wiersz+1 +" ";
             boolean[] zrobione = new boolean[koszty.length];
             zrobione[wiersz] = true;

             while(true)
             {
                 int smak = rand.nextInt(zrobione.length);
                 if(!zrobione[smak] && koszty[wiersz][smak]>0)
                 {
                     suma+=koszty[wiersz][smak];
                     zrobione[smak] = true;
                     wiersz=smak;
                     rozw+=smak+1+" ";

                     boolean all = true;

                     for(int j=0;j< zrobione.length;j++) if(!zrobione[j])all=false;

                     if(all)
                     {
                         if(suma<minSum)
                         {
                             minSum = suma + koszty[wiersz][globalWiersz];
                             bestRozw=rozw;
                             start=globalWiersz;
                         }
                         break;
                     }
                 }
             }
        }
        System.out.println("Roz"+bestRozw+(start+1));
        System.out.println("KOszty"+minSum);
    }
}
