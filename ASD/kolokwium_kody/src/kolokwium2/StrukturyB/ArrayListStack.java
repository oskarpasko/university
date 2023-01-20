package kolokwium2.StrukturyB;
import java.util.ArrayList;

//Implementacja stosu liczb calkowitych za pomoca tablicy dynamicznej ArrayList przez OSADZANIE

public class ArrayListStack
{
    private ArrayList<Integer> intStack;

    public ArrayListStack() {intStack = new ArrayList<Integer>();}
    public void push(Integer elem) {intStack.add(elem);}
    public Integer pop() {return intStack.remove(intStack.size()-1);}
    public Integer peek() {return intStack.get(intStack.size()-1);}
    public boolean isEmpty() {return intStack.isEmpty();}

    public static void main(String[] args)
    {
        ArrayListStack theStack = new ArrayListStack();  // tworzymy nowy stos o rozmiarze 10 (z relokacja)
        theStack.push(new Integer(10));     // odkładamy elementy na stosie
        theStack.push(new Integer(40));
        theStack.push(new Integer(60));
        theStack.push(new Integer(80));
        theStack.push(new Integer(81));

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            int value = theStack.pop();
            System.out.println(value+" ");      // wypisanie elementu
        }
        System.out.println("");
    }
}

