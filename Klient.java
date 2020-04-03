package pl.zawierucha.project2;
import static pl.zawierucha.project2.Start.wprowadzenie;
import static pl.zawierucha.project2.Start.klientbase;

public class Klient extends Klientbase{

    public Klient(){



}
    public Klient(String imie, String nazwisko, String adres, int wiek, String datazapisu, int wartosckary, boolean mozliwoscwypozyczenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        this.datazapisu = datazapisu;
        this.wartosckary = wartosckary;
        this.mozliwoscwypozyczenia = mozliwoscwypozyczenia;

    }

    public String toString(){
        return "\nImie: " + imie + "\nNazwisko:" + nazwisko + "\n Adres" + adres +
                "\n Wiek:" + wiek + "\nNaliczone kary:" + wartosckary + "\nMoze wypozyczac? " + mozliwoscwypozyczenia + "\n";
    }
    public static void dodajKlienta(){
        String imie;
        String nazwisko;
        String adres;
        int wiek;
        String datazapisu;
        int wartosckary = 0;
        boolean mozliwoscwypozyczenia = true;
        int czywypozyczyl;
        int dniwypozyczenia;
        System.out.println("\n Podaj imie klienta");
        imie = wprowadzenie.next();
        System.out.println("\n Podaj nazwisko klienta");
        nazwisko = wprowadzenie.next();
        System.out.println("\n Podaj adres klienta");
        adres = wprowadzenie.next();
        System.out.println("\n Podaj wiek klienta");
        wiek = wprowadzenie.nextInt();
        System.out.println("\n Podaj date zapisu klienta");
        datazapisu = wprowadzenie.next();
        System.out.println("\n Czy klient coś wypożyczył? 1-tak 0- nie");
        czywypozyczyl = wprowadzenie.nextInt();
        if (czywypozyczyl == 1){
            System.out.println("\n Ile dni temu wypożyczył?");
            dniwypozyczenia = wprowadzenie.nextInt();
            if (dniwypozyczenia > 14) {
                wartosckary = dniwypozyczenia * 2;
                mozliwoscwypozyczenia = false;
                System.out.println("\n**Naliczono opłate i zablokowano**\n");
            }

        }




        Klient klient = new Klient(imie, nazwisko, adres, wiek, datazapisu, wartosckary, mozliwoscwypozyczenia);
        klientbase.dodajKlienta(klient);
    }
}

