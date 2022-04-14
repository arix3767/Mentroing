package zajecia10;

import java.util.ArrayList;
import java.util.List;

public class Liczby<T extends Number> {

    protected List<T> liczby = new ArrayList<>();

    public void dodajDoListy(T dowolnaLiczba) {
        liczby.add(dowolnaLiczba);
    }

    public void wyswietl() {
        System.out.println(liczby);
    }
}

class Mainv2 {
    public static void main(String[] args) {

        Liczby<Integer> liczba = new Liczby<>();

        liczba.dodajDoListy(24);
        liczba.dodajDoListy(10);

        liczba.wyswietl();

    }
}