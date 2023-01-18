package kolokwium2.StrukturyB;

import java.util.LinkedList;

public class LinkedListList
{

    private LinkedList<Object> oList;

    public LinkedListList() {oList = new LinkedList<Object>();}
    public boolean isEmpty() {return oList.isEmpty();}
    public void insertFirst(Object elem) {oList.addFirst(elem);}
    public void insertLast(Object elem) {oList.addLast(elem);}
    public Object deleteFirst() {return oList.removeFirst();}
    public Object deleteLast() {return oList.removeLast();}
    public Object getFirst() {return oList.getFirst();}
    public Object getLast() {return oList.getLast();}
    public int size() {return oList.size();}
    public void print()
    {
        for (int i = 0; i < oList.size(); i++)
        {
            System.out.print(oList.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedListList theList = new LinkedListList();

        theList.insertFirst(22);       // wstawiamy na poczatek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();         // wypisujemy zawartosc listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

        theList.deleteLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie
    }

}

