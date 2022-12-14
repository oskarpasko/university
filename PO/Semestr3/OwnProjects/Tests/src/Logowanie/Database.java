//package Logowanie;
//
//public class Database {
//    private Person [] table;  //Referencja do tablicy
//    private int nElems;  //Aktualna liczba elementow w tablicy
//
//    public Database(int maxSize)  // Konstruktor
//    {
//        table = new Person[maxSize]; // Tworzymy tablice
//        nElems = 0;               // Na razie brak elementow w tablicy
//    }
//
//    public void add(Person value)    	// Wstawienie elementu do tablicy
//    {
//        if (nElems >= table.length)
//        {
//            Person [] locTable = new Person[table.length*2];
//            for (int i=0; i<table.length; i++)
//                locTable[i]=table[i];
//            table = locTable;
//        }
//        int j;
//        for (j = 0; j < nElems; j++)   // Znajdujemy miejsce dla elementu
//            if (table[j].compareTo(value) > 0)
//                break;
//
//        for (int k = nElems; k > j; k--)    // Przesuwamy większe elementy
//            table[k] = table[k - 1];
//
//        table[j] = value;       	// Wstawiamy element
//        nElems++;
//    }
//    public Person get(int index) // Pozyskanie elementu o danym indeksie
//    {
//        return table[index];
//    }
//
//    public int size() // Aktualna liczba elementow w tablicy
//    {
//        return nElems;
//    }
//    public int find(Person searchElem) // Szukanie okreslonego elementu
//    {
//        for (int j = 0; j < nElems; j++)
//        {
//            if (table[j].getPassword().equals(searchElem.getPassword()))
//                return j; //Element znaleziono
//        }
//        return -1; // Elementu nie znaleziono
//    }
//    public void print()
//    {
//        for (int i = 0; i < nElems; i++)
//            System.out.print(get(i).toString() + "\n");
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int max = 10;
//        Database array = new Database(max);
//
//        array.add(new Person("admin", "ladmin", "ad", "test"));
//        array.add(new Person("test", "ltest", "tst", "admin"));
//
//        array.print();
//        System.out.println(array.find());
//    }
//}
