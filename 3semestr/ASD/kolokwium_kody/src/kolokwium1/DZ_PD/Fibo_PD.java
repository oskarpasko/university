package kolokwium1.DZ_PD;

public class Fibo_PD {

    public static void main(String[] args) {
        final int N = 6;
        System.out.println(fibo(N));
    }

    public static int fibo(int n)
    {
        int [] tab = new int[n + 1];
        tab[1] = 1;
        tab[2] = 1;

        for(int i = 3 ; i< tab.length ; i++)
        {
            tab[i] = tab[i - 1] + tab[ i - 2];
        }

        return tab[n];
    }
}
