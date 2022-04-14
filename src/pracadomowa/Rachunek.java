package pracadomowa;

import zajecia01.Osoba;

public class Rachunek {

    protected Osoba wlasciciel;
    protected double stanRachunku;

    public Rachunek(Osoba wlasciciel, double stanRachunku) {
        this.wlasciciel = wlasciciel;
        this.stanRachunku = stanRachunku;
    }

    boolean wplata(double iloscPieniedzydoWplaty) {
        if (iloscPieniedzydoWplaty > 0) {
            stanRachunku += iloscPieniedzydoWplaty;
            return true;
        } else {
            return false;
        }

    }

    boolean wyplata(double iloscPieniedzydoWyplaty) {
        if (stanRachunku < iloscPieniedzydoWyplaty) {
            return false;
        } else {
            stanRachunku -= iloscPieniedzydoWyplaty;
            return true;
        }
    }

    boolean przelew(double iloscPieniedzydoPrzelewu, Rachunek rachunekDoprzelewu) {
        if (iloscPieniedzydoPrzelewu <= stanRachunku) {
            stanRachunku -= iloscPieniedzydoPrzelewu;
            rachunekDoprzelewu.stanRachunku += iloscPieniedzydoPrzelewu;
            return true;
        } else {
            return false;
        }
    }

    void aktualizacja() {
        System.out.println("Rachunek podstawowy");
    }

    @Override
    public String toString() {
        return "Rachunek{" +
                "osoba='" + wlasciciel + '\'' +
                ", stanRachunku=" + stanRachunku +
                '}';
    }


}
