package kolokwium2.StrukturyB;

//Implementacja kolejki liczb calkowitych za pomoca klasy ArrayList przez OSADZANIE

import java.util.ArrayList;


public class ArrayListQueue
{
    private ArrayList<Integer> intQueue;

    public ArrayListQueue()
    {
        intQueue = new ArrayList<Integer>();
    }
    public void insert(Integer elem)
    {
        intQueue.add(elem);
    }
    public int remove()
    {
        return intQueue.remove(0);
    }
    public int peek()
    {
        return intQueue.get(0).intValue();
    }
    public boolean isEmpty()
    {
        return intQueue.isEmpty();
    }
    public int size()
    {
        return intQueue.size();
    }

    public static void main(String[] args)
    {
        ArrayListQueue theQueue = new ArrayListQueue();

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        int elem = theQueue.remove();
        System.out.println(elem);
        System.out.println(theQueue.remove());
        System.out.println(theQueue.remove());

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+theQueue.remove());
        }
        System.out.println("");
    }
}


