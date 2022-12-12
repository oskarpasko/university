package com.company.Podpowiedzi_Do_Kolokwium.Kroliki;

public class Kroliki_DZ {
    static boolean sto, tysiac, diesiectys, milion;

    public static int zliczaj(int n) {

        // zwracamy 1 jesli n bedzie rowne 1 lub 2
        if (n==1 || n==2) return 1;

        // jesli n > 2 to obliczamy wartosc dla danego n
        int kroliki = zliczaj(n-1) + zliczaj(n-2);

        // jesli liczba (populacja) bedzie wyzsza od 100, 1000, 10 000, 1 000 000
        // ORAZ wczesniej nie wypisalismy wartości to:
        if (kroliki > 100 && !sto) {
            //wypisz 'i'(index/miesiac) na którym liczba jest wyższa od warunku
            System.out.println("Sto: " + n);
            // zmien wartość na true, żebby w następnych iteracjach nadmiarowo nie wypisywać
            sto = true;
        }

        // dalsze ify to powtórka poprzedniego tylko dla innych wartości

        if (kroliki > 1000  && !tysiac) {
            System.out.println("Tysiac: " + n);
            tysiac=true;
        }

        if (kroliki > 10000  && !diesiectys) {
            System.out.println("Dziesiec tysiecy: " + n);
            diesiectys=true;
        }

        if (kroliki > 1000000  && !milion) {
            System.out.println("Milion: " + n);
            milion=true;
        }


        // zwracamy wartosc krolikow
        return kroliki;
    }

    public static void main(String[] args) {

        // n-ty wyraz ciagu
        final int N = 40;

        // wywolanie funkcji
        zliczaj(N);
    }
}
