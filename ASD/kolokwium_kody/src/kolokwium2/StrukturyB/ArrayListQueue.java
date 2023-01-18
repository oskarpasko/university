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

        theQueue.insert(new Integer(10));
        theQueue.insert(new Integer(20));
        theQueue.insert(new Integer(40));
        theQueue.insert(new Integer(50));


        int elem = theQueue.remove();
        System.out.println(elem);
        System.out.println(theQueue.remove());
        System.out.println(theQueue.remove());

        theQueue.insert(new Integer(55));
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


