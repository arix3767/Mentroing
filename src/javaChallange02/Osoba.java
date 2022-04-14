package javaChallange02;

public class Osoba {

    protected String imie;
    protected int rokUrodzenia;
    static final int aktualnyRok = 2022;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie) {
        this(imie, 1990);
    }

    public java.lang.String zwrocImie() {
        return imie;
    }

    public int zwrocWiek() {
        return aktualnyRok - rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba osoba1, Osoba osoba2) {
        if (osoba1.zwrocWiek() > osoba2.zwrocWiek()) {
            return osoba1;
        } else {
            return osoba2;
        }
    }

    public static java.lang.String zwrocNajstarszaOsobe(Osoba[] osoby) {
        Osoba najstarszaOsoba = osoby[0];
        for (int i = 0; i < osoby.length; i++) {
            if (najstarszaOsoba.zwrocWiek() < osoby[i].zwrocWiek()) {
                najstarszaOsoba = osoby[i];
            }
        }
        return najstarszaOsoba.imie;
    }

    @Override
    public java.lang.String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
