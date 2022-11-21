package com.company;

public class Main {
    //Funkcja Newtona (nk) (n nad k)
    public static void main(String[] args)
    {
        final int N = 10; // n-ty wyraz ciągu
        final int K = 5;
        System.out.println(fibo(N, K));
    }

    static int fibo(int n, int k)
    {
        if (k == 0 || k == n)
            return 1;
        else
            return fibo(n-1, k-1) + fibo(n-1, k);
    }
}
