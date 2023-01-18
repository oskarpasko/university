package kolokwium2.StrukturyB;
import java.util.LinkedList;
//Implementacja stosu liczb calkowitych za pomoca listy powiazanej LinkedList przez OSADZANIE

public class LinkedListStack
{
    private LinkedList<Integer> intStack;

    public LinkedListStack() {intStack = new LinkedList<Integer>();}
    public void push(Integer elem) {intStack.push(elem);}
    public int pop() {return intStack.pop();}
    public int peek() {return intStack.peek();}
    public boolean isEmpty() {return intStack.isEmpty();}

    public static void main(String[] args)
    {
        LinkedListStack theStack = new LinkedListStack();
        theStack.push(new Integer(10));     // odkładamy elementy na stosie
        theStack.push(new Integer(20));
        theStack.push(new Integer(30));
        theStack.push(new Integer(40));

        while (!theStack.isEmpty())     // dopóki stos nie jest pusty...
        {                             // ...pobieramy z niego elementy
            long value = theStack.pop();
            System.out.print(value+"\n");      // wypisanie elementu
        }
        System.out.println("");
    }
}

