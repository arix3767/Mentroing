package zajecia05.Enum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Jan", "Kowalczyk", KolorWlosow.BLOND, KolorOczu.NIEBIESKIE);
        Osoba osoba2 = new Osoba("Krzysiek", "Kochanowski", KolorWlosow.CZARNY, KolorOczu.ZIELONE);
        Osoba osoba3 = new Osoba("Julia", "Nowak", KolorWlosow.SIWY, KolorOczu.ZIELONE);
        Osoba osoba4 = new Osoba("Mateusz", "Olszak", KolorWlosow.RUDY, KolorOczu.PIWNE);
        Osoba osoba5 = new Osoba("Jeremi", "Kruszewski", KolorWlosow.CZARNY, KolorOczu.ZIELONE);

        Ubezpieczenie.wypiszInformacje();

        List<Osoba> wszystkieOsoby = new ArrayList<Osoba>();
        wszystkieOsoby.add(osoba1);
        wszystkieOsoby.add(osoba2);
        wszystkieOsoby.add(osoba3);
        wszystkieOsoby.add(osoba4);
        wszystkieOsoby.add(osoba5);
        //tODO dodaj wszystkie osoby do listy za pomoca metody addAll(...)

    }
}
