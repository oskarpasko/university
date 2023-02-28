package kolokwium2.StrukturyA.Zadanie2;

//Implementacja uporzadkowanej tablicy dynamicznej zlozonych obiektow Person

public class OrdDynArrayPerson
{
    private Person [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public OrdDynArrayPerson(int maxSize)  // Konstruktor
    {
        table = new Person[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(Person value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length)
        {
            Person [] locTable = new Person[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            table = locTable;
        }

        int j;
        for (j = 0; j < nElems; j++)   // Znajdujemy miejsce dla elementu
            if (table[j].compareTo(value) > 0) break;

        for (int k = nElems; k > j; k--)    // Przesuwamy większe elementy
            table[k] = table[k - 1];

        table[j] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public Person get(int index) {return table[index];}
    public int size() {return nElems;}

    public boolean remove(int index) 	// Usuniecie elementu o danym indeksie
    {
        if (nElems==0 || index>=nElems || index<0) return false;

        for (int j = index; j < nElems - 1; j++) table[j] = table[j + 1];
        nElems--;                   		// Zmniejszamy licznik elementow
        return true;
    }
    
    public int find2(Person searchElem) // Szukanie okreslonego elementu
    {
        for (int j = 0; j < nElems; j++)
            if (table[j].compareTo(searchElem) == 0) return j; //Element znaleziono
        return -1; // Elementu nie znaleziono
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++) System.out.print(get(i).toString() + "\n");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 3;
        OrdDynArrayPerson array = new OrdDynArrayPerson(maxSize);
        
        array.add(new Person("Ola", "Ząb", 58)); // 15
        array.add(new Person("Ola", "Olczyk", 58)); // 14
        array.add(new Person("Ala", "Olczyk", 58)); // 13
        array.add(new Person("Ola", "Ząb", 18)); // 5
        array.add(new Person("Ola", "Olczyk", 18)); // 4
        array.add(new Person("Ala", "Olczyk", 18)); // 3
        array.add(new Person("Olek", "Olczyk", 19)); // 9
        array.add(new Person("Alex", "Olczyk", 19)); // 7
        array.add(new Person("Igor", "Olczyk", 19)); // 8
        array.add(new Person("Ala", "Alowska", 18)); // 2
        array.add(new Person("Ala", "Alowiak", 18)); // 1
        array.add(new Person("Ola", "Ząbek", 28)); // 11
        array.add(new Person("Olek", "Olczykiewicz", 19)); // 10
        array.add(new Person("Olek", "Alowski", 19)); // 6
        array.add(new Person("Zygfryd", "Ząb", 32)); // 12
        array.print();
        
        array.remove(1);
        array.print();

        array.add(new Person("Lolek", "Las", 18));
        Person p2 = new Person("Ala", "Alowska", 44);
        array.add(p2);
        Person p3 = new Person("Ala", "Alowiak", 44);
        array.add(p3);
        array.print();
        
        int findx = array.find2(p2);
        System.out.println(""+findx);
        
        int find2x = array.find2(new Person("Ula", "Alowska", 44));
        System.out.println(""+find2x);
        
        int find3x = array.find2(new Person("Lolek", "Las", 18));
        System.out.println(""+find3x);

    }
}
