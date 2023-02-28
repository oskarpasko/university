package kolokwium2.StrukturyB;

//Implementacja kolejki liczb calkowitych za pomoca klasy LinkedList przez OSADZANIE

import java.util.LinkedList;

public class LinkedListQueue
{

    private LinkedList<Integer> intQueue;

    public LinkedListQueue() {intQueue = new LinkedList<Integer>();}
    public void insert(Integer elem) {intQueue.addLast(elem);}
    public int remove() {return intQueue.removeFirst();}
    public int peek() {return intQueue.peekFirst().intValue();}
    public boolean isEmpty() {return intQueue.isEmpty();}
    public int size() {return intQueue.size();}

    public static void main(String[] args)
    {
        LinkedListQueue theQueue = new LinkedListQueue();  // kolejka

        theQueue.insert(new Integer(10));
        theQueue.insert(new Integer(20));
        theQueue.insert(new Integer(30));
        theQueue.insert(new Integer(40));


        int elem = theQueue.remove();              // usuwamy 3 elementy
        System.out.println(elem);
        System.out.println(theQueue.remove());
        System.out.println(theQueue.remove());

        theQueue.insert(new Integer(50));
        theQueue.insert(new Integer(60));
        theQueue.insert(new Integer(70));
        theQueue.insert(new Integer(80));


        while (!theQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+theQueue.remove());
        }
        System.out.println("");
    }
}
