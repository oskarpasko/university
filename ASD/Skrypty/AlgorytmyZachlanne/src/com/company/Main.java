package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException
    {
        monety_zachlanne();
    }

    public static void monety_zachlanne() throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int[] l = {1, 2, 0, 7, 2, 2, 5, 2, 10};
        int[] m = new int[M.length];
        int zl, gr, r, i = 0;

        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);

        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");

        r = zl * 100 + gr;

        boolean brak = false;
        while (r > 0) {

            if (i > M.length - 1) {
                brak = true;
                break;
            }

            if (r >= M[i] && l[i] > 0) {
                System.out.print(M[i] / 100.0 + " ");
                m[i]++;
                l[i]--;
                r = r - M[i];
            } else i++;
        }
        System.out.println();

        System.out.println("Wydane moenty: ");
        for (i = 0; i < m.length; i++) {
            System.out.println(M[i] / 100.0 + " ilość monet: " + m[i]);
        }
        if (brak == true) System.out.println("Zabrakło " + r/100.0 + " PLN");
    }
}
