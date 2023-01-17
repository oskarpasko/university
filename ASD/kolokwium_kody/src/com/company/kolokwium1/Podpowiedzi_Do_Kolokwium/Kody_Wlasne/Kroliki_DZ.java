package com.company.kolokwium1.Podpowiedzi_Do_Kolokwium.Kody_Wlasne;

public class Kroliki_DZ {
    static boolean sto, tysiac, dziesiectys, stotys, milion;
    final static int N = 40;

    public static int kroliki(int n)
    {
        if(n==1 || n==2) return 1;
        int kroliki = kroliki(n-1) + kroliki(n-2);

        if(kroliki > 100 && !sto)
        {
            System.out.println("Sto królików w "+ n +" dni!");
            sto = true;
        }
        if(kroliki > 1000 && !tysiac)
        {
            System.out.println("Tysiac królików w "+ n +" dni!");
            tysiac = true;
        }
        if(kroliki > 10000 && !dziesiectys)
        {
            System.out.println("10 000 królików w "+ n +" dni!");
            dziesiectys = true;
        }
        if(kroliki > 100000 && !stotys)
        {
            System.out.println("100 000 królików w "+ n +" dni!");
            stotys = true;
        }
        if(kroliki > 1000000 && !milion)
        {
            System.out.println("Milion królików w "+ n +" dni!");
            milion = true;
        }

        return kroliki;
    }

    public static void main(String[] args) {
        kroliki(N);
    }
}
