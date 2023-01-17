package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Kroliki_PD {
    final static int[] kroliki = new int[40];
    static boolean sto, tysiac, dziesiectys, stotys, milion;

    public static void main(String[] args) {
        kroliki[1] = 1;
        kroliki[2] = 1;

        for(int i=3 ; i< kroliki.length ; i++)
        {
            kroliki[i] = kroliki[i-1] + kroliki[i-2];

            if(kroliki[i] > 100 && !sto)
            {
                System.out.println("Sto królików w "+ i +" dni!");
                sto = true;
            }
            if(kroliki[i] > 1000 && !tysiac)
            {
                System.out.println("Tysiac królików w "+ i +" dni!");
                tysiac = true;
            }
            if(kroliki[i] > 10000 && !dziesiectys)
            {
                System.out.println("10 000 królików w "+ i +" dni!");
                dziesiectys = true;
            }
            if(kroliki[i] > 100000 && !stotys)
            {
                System.out.println("100 000 królików w "+ i +" dni!");
                stotys = true;
            }
            if(kroliki[i] > 1000000 && !milion)
            {
                System.out.println("Milion królików w "+ i +" dni!");
                milion = true;
            }
        }
    }
}
