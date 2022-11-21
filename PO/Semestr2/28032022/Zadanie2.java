package com.company;

public class Zadanie2 {

    private static boolean[]data = new boolean[20];

    public static void oblicz(){
        for(int i = 0 ; i<20 ; i++) {
            if (i % 2 == 0) {
                data[i] = true;
                System.out.println(data[i]);
            } else{
                data[i] = false;
                System.out.println(data[i]);
            }
        }
    }

}
