package kolokwium1.Podpowiedzi_Do_Kolokwium.Plecak.Plecak_MonteCarlo;
import java.util.Random;
public class Plecak_MC {
    static final int N = 6;                // liczba przedmiotow
    static final int MAX_V = 10;           // objetosc plecaka
    final static int[] V = {2,6,3,3,1,2};  // objetości przedmiotów
    final static int[] W = {4,6,5,10,2,7}; // wartości przedmiotów

    public static void main(String[] args)
    {
        Random los = new Random();
        String optRozw = new String();
        int optV = -1, optW = 0;

        for (int i = 0; i < 10; i++)
        {
            int[] ustaw = new int[N];
            for (int j = 0; j < N; j++) ustaw[j] = j;

            for (int j = 0; j < N; j++)
            {
                int rndIndex = los.nextInt(N);
                if (rndIndex != j)
                {
                    int pom = ustaw[j];
                    ustaw[j] = ustaw[rndIndex];
                    ustaw[rndIndex] = pom;
                }
            }

            String locRozw = new String();
            int sumV = 0, sumW = 0, j = 0;

            while ((j < N) && (sumV + V[ustaw[j]] <= MAX_V))
            {
                sumV += V[ustaw[j]];
                sumW += W[ustaw[j]];
                locRozw += " " + ustaw[j];
                j++;
            }

            if (sumW > optW)
            {
                optW = sumW;
                optV = sumV;
                optRozw = locRozw;
            }
        }

        System.out.println("Calkowita objetość: " + optV);
        System.out.println("Calkowita wartosc: " + optW);
        System.out.println("Konfiguracja: " + optRozw);
        System.out.println("Niewykorzystana objętość: " + (MAX_V - optV));
    }
}
