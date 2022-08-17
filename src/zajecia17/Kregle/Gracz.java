package zajecia17.Kregle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gracz {

    private String imie;
    private String nazwisko;
    private int numerTelefonu;

    private static final int LICZBA_USTAWIONYCH_PINOW = 10;

    public static final List<Gracz> LISTA_GRACZY = new ArrayList<Gracz>();

    public Gracz(String imie, String nazwisko, int numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
        LISTA_GRACZY.add(this);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public static void dodajGracza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj swoj numer telefonu: ");
        Scanner scanner1 = new Scanner(System.in);
        int numerTel = scanner1.nextInt();
        new Gracz(imie, nazwisko, numerTel);
    }

    public static void zagrajJednaRunde() {
        int maksymalnaLiczbaRzutowWRundzie = 2;
        int liczbaPozostalychPinow = 10;
        int liczbaZbitychPinow;
        int liczbaPunktowPierwszyRzut = 0;
        int liczbaPunktowDrugiRzut = 0;
        do {
            liczbaZbitychPinow = (int) (Math.random() * 10);
           //liczbaPozostalychPinow = LICZBA_USTAWIONYCH_PINOW - liczbaZbitychPinow;
             liczbaPozostalychPinow -= liczbaZbitychPinow;
            if (maksymalnaLiczbaRzutowWRundzie < 2) {
                liczbaPunktowDrugiRzut += liczbaZbitychPinow;
            } else {
                liczbaPunktowPierwszyRzut += liczbaPozostalychPinow;
            }
            maksymalnaLiczbaRzutowWRundzie--;
            System.out.println("Pierwszy rzut: " + liczbaPunktowPierwszyRzut + " Drugi rzut: " + liczbaPunktowDrugiRzut);
        } while (liczbaPozostalychPinow > 0 || maksymalnaLiczbaRzutowWRundzie > 0);

    }
}
