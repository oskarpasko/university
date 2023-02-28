package kolokwium2.StrukturyA.Zadanie2;

class Person implements Comparable<Person>
{
    private String imie, nazwisko;
    private int wiek;

    public Person()
    {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }

    public Person(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + '}';
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public int compareTo(Person p) {
        // kolejnosc kryteriow:
        // wiek (od najmlodszej osoby)
        // nazwisko (alfabetycznie od A do Z)
        // imie (alfabetycznie od A do Z)

        //osoba.compareTo(osoba2)

        if(this.getWiek() < p.getWiek()) return -1;
        if(this.getWiek() > p.getWiek()) return 1;
        if(this.getWiek() == p.getWiek() && this.getNazwisko().compareTo(p.getNazwisko()) != 0) // ten sam wiek, rozne nazwiska
            return this.getNazwisko().compareTo(p.getNazwisko());
        if(this.getWiek() == p.getWiek() && this.getNazwisko().compareTo(p.getNazwisko()) == 0) // ten sam wiek, takie same nazwiska
            return this.getImie().compareTo(p.getImie());
        return 0;
    }
}
