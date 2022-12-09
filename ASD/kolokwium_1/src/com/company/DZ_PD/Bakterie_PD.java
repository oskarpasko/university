package com.company.DZ_PD;

public class Bakterie_PD {

    public static void main(String[] args) {
        int[] bakterie = new int[30];
        bakterie[1] = 1;
        int licznik = 1;

        int test = 1000;

        for(int i = 2 ; i< bakterie.length ; i++)
        {
            licznik++;
            bakterie[i] = 2 * bakterie[i - 1];
            if(bakterie[i] >= 1000000)
            {
                System.out.println("1mln razy wiecej w " + licznik*2 +" minut.");
                break;
            }else if(bakterie[i] >= 100000 && bakterie[i] < 200000)
            {
                System.out.println("100 000 razy wiecej w " + licznik*2 +" minut.");
            }else if(bakterie[i] > 10000 && bakterie[i] < 20000)
            {
                System.out.println("10 000 razy wiecej w " + licznik*2 +" minut.");
            }else if(bakterie[i] >= 1000 && bakterie[i] < 2000)
            {
                System.out.println("1000 razy wiecej w " + licznik*2 +" minut.");
            }
        }
    }

}
