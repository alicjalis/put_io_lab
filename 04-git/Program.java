public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    // konstruktor
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
// zmiana nr 2
    public void wyswietlInformacje() {
        System.out.println("Imie " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
    }

    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 30);

        osoba1.wyswietlInformacje();
    }
}
