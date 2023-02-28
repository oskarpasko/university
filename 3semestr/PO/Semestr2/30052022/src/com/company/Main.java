package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println("----- Zadanie 1 -----");
//
//        Zadanie1 zad1 = new Zadanie1(1, "Franek", 18);
//        Zadanie1 zad2 = new Zadanie1(2, "Janek", 16);
//        Zadanie1 zad3 = new Zadanie1(3, "Ania", 28);
//
//        zad1.podajDane();
//        zad2.podajDane();
//        zad3.podajDane();
//
//        List<Object> users = new ArrayList<Object>();
//
//        users.add(zad1);
//        users.add(zad2);
//        users.add(zad3);
//
//
//        Iterator<Object> usersIterator = users.iterator();
//
//        while(usersIterator.hasNext()){
//            System.out.println(usersIterator.next());
//        }
//
//        System.out.println(zad1.equals(zad2));
//        System.out.println("zad1 hash: "+zad1.hashCode());
//        System.out.println("zad2 hash: "+zad2.hashCode());
//        System.out.println("zad3 hash: "+zad3.hashCode());

//        System.out.println("----- Zadanie 2 -----");
//
//        Zadanie2 zad21 = new Zadanie2(1);
//        Zadanie2 zad22 = new Zadanie2(2);
//        Zadanie2 zad23 = new Zadanie2(2);
//
//        List<Object> numbers = new ArrayList<Object>();
//        numbers.add(zad21);
//        numbers.add(zad22);
//        numbers.add(zad23);

        System.out.println("----- Zadanie 3 -----");

        List<Integer> list1 = new ArrayList<Integer>();

        List<Integer> list2 = new ArrayList<Integer>();

        for(int i = 0;i<10;i++){
            list1.add(i);
        }

        Iterator<Integer> nrIterator = list1.iterator();

        while(nrIterator.hasNext()){
            list2.add(nrIterator.next());
        }

        System.out.println("Lista 1: " + list1);

        System.out.println("Lista 2: " + list2);

    }
}
