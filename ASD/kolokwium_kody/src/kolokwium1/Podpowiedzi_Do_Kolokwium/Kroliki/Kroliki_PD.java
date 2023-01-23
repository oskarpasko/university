package kolokwium1.Podpowiedzi_Do_Kolokwium.Kroliki;

public class Kroliki_PD {

    // zmienne odpowiadające za wypisywanie poszczególnych miesięcy
    static boolean sto, tysiac, diesiectys, milion;

    public static void main(String[] args) {

        // n-ta liczba ciągu
        final int N = 40;
        // deklaracja pustej tablicy
        int[] tab = new int[N];

        // wpisanie do 1 i 2 indexu wartości 1
        tab[1] = 1;
        tab[2] = 1;

        // pętla wpisująca w tablice następne liczby ciągy
        for(int i=3;i<tab.length;i++) {

            // ogólny wzór ciągu n(i) = n(i-1) + n(i-2)
            tab[i] = tab[i-1] + tab[i-2];

            // jesli liczba (populacja) bedzie wyzsza od 100, 1000, 10 000, 1 000 000
            // ORAZ wczesniej nie wypisalismy wartości to:
            if (tab[i] > 100 && !sto) {
                //wypisz 'i'(index/miesiac) na którym liczba jest wyższa od warunku
                System.out.println("Sto: " + i);
                // zmien wartość na true, żebby w następnych iteracjach nadmiarowo nie wypisywać
                sto = true;
            }

            // dalsze ify to powtórka poprzedniego tylko dla innych wartości

            if (tab[i] > 1000  && !tysiac) {
                System.out.println("Tysiac: " + i);
                tysiac=true;
            }

            if (tab[i] > 10000  && !diesiectys) {
                System.out.println("Dziesiec tysiecy: " + i);
                diesiectys=true;
            }

            if (tab[i] > 1000000  && !milion) {
                System.out.println("Milion: " + i);
                milion=true;
            }
        }
    }
}
