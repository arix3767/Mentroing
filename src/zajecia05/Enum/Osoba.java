package zajecia05.Enum;

import java.util.ArrayList;
import java.util.List;

public class Osoba {

    private String imie;
    private String nazwisko;
    private KolorWlosow kolorWlosow;
    private KolorOczu kolorOczu;

    public Osoba(String imie, String nazwisko, KolorWlosow kolorWlosow, KolorOczu kolorOczu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kolorWlosow = kolorWlosow;
        this.kolorOczu = kolorOczu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public KolorWlosow getKolorWlosow() {
        return kolorWlosow;
    }

    public KolorOczu getKolorOczu() {
        return kolorOczu;
    }
}
