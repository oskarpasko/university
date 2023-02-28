package kolokwium2.Sortowanie;

import java.util.Random;

public class IntArrayWithSort
{
    private static int[] table;
    private static int nElems = 10;

    public static void bubbleSort()
    {
        for (int i = nElems - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (table[j] > table[j + 1]){
                    int temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                }
            }
        }
    }

    public static void print()
    {
        for (int i = 0; i < nElems; i++) System.out.print(table[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        table = new int[nElems];

        Random rand = new Random();
        for (int i=0; i<nElems; i++) table[i]=rand.nextInt(100);

        System.out.println("Przed sortowaniem:");
        print();

        bubbleSort();  // sortowanie babelkowe

        System.out.println("Po sortowaniu:");
        print();
    }
}
