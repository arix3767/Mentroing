package zajecia01;

public class Osoba {

    private static final int AKTUALNY_ROK = 2022;

    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie) {
        this(imie, 1990);
    }

    public String zwrocImie(String imie) {
        return imie;
    }

    public int zwrocWiek(int rokUrodzenia) {
        int wiek;
        wiek = AKTUALNY_ROK - rokUrodzenia;
        return wiek;
    }

    public static Osoba zwrocStarszaOsobe(Osoba osoba1, Osoba osoba2) {
        if (osoba1.rokUrodzenia > osoba2.rokUrodzenia) {
            return osoba2;
        } else {
            return osoba1;
        }
    }

    public static String zwrocNajstarszaOsobe(Osoba[] osobas) {
        Osoba najstarszaOsoba = osobas[0];
        for (int i = 0; i < osobas.length; i++) {
            if (osobas[i].rokUrodzenia < najstarszaOsoba.rokUrodzenia) { // 2000 < 1990
                najstarszaOsoba = osobas[i];
            }
        }


        return najstarszaOsoba.imie;

    }


}
