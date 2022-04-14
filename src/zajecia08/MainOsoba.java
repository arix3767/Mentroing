package zajecia08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOsoba {
    public static void main(String[] args) {
        Osoba osoba01 = new Osoba("Jan", 1990, "Kowalski", 134);
        Osoba osoba02 = new Osoba("Jan", 1990, "Kowalski", 222);
        Osoba osoba03 = new Osoba("Jan", 1990, "Kowalski", 420);
        Osoba osoba04 = new Osoba("Jan", 1990, "Kowalski", 997);
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(osoba01);
        osoby.add(osoba02);
        osoby.add(osoba03);
        osoby.add(osoba04);
        Collections.sort(osoby);
        System.out.println(osoby);
    }
}
