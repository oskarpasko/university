package kolokwium1.Podpowiedzi_Do_Kolokwium.Plecak;

public class Plecak_DZ {
    final static int N = 6;                // liczba przedmiotow
    final static int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow

    static int plecak(int przedmiot, int objetosc)
    {
        int w1; // wartosc, gdy nie bierzemy i-tego przedmiotu
        int w2; // wartosc, gdy bierzemy i-ty przedmiot

        if (przedmiot == 0 && objetosc < V[0]) return 0;
        if (przedmiot == 0 && objetosc >= V[0]) return W[0];

        w1 = plecak(przedmiot - 1, objetosc);
        if (przedmiot > 0 && objetosc < V[przedmiot]) return w1;

        w2 = W[przedmiot] + plecak(przedmiot - 1, objetosc - V[przedmiot]);
        if (w2 > w1) return w2;
        else return w1;
    }

    public static void main(String[] args)
    {
        System.out.println("Wartosc przedmiotow: " + plecak(N - 1, MAX_V));
    }
}
