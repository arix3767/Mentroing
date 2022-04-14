package zajecia09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Grupa {

    private List<Uczen> listaUczniow = new ArrayList<>();
    private HashSet<Przedmiot> listaPrzedmiotow = new HashSet();


    public void grupaDodajprzedmiot(Przedmiot nazwaPrzedmiotu) {
        System.out.println("Dodano Przedmiot: ");
        listaPrzedmiotow.add(nazwaPrzedmiotu);
    }
    public void grupaDodajUcznia(Uczen nazwaUcznia){
        System.out.println("Dodano Ucznia: ");
        listaUczniow.add(nazwaUcznia);

    }

    @Override
    public String toString() {
        return "Grupa{" +
                "listaUczniow=" + listaUczniow +
                ", listaPrzedmiotow=" + listaPrzedmiotow +
                '}';
    }
}
