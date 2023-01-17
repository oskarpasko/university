package com.company.kolokwium1.DZ_PD;

public class Newton_DZ {
    public static void main(String[] args) {
        final int N = 10;
        final int K = 5;
        System.out.println(newton(N, K));
    }

    public static int newton(int n, int k)
    {
        if(k == 0 || k == n) return 1;
        else return newton(n - 1, k - 1) + newton(n - 1, k);
    }

}
