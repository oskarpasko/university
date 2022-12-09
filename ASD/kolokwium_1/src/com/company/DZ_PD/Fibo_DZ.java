package com.company.DZ_PD;

public class Fibo_DZ {

    public static void main(String[] args) {
        int N = 6;
        System.out.println(fibo(N));
    }

    public static int fibo(int n)
    {
        if(n == 1 || n ==2) return 1;
        else return fibo(n - 1) + fibo(n - 2);
    }
}
