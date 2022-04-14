package pracadomowa;

import zajecia01.Osoba;

public class KontoVIP extends Konto {

    protected double indywidualneOprocentowanie;
    protected double limitDebetu;

    public KontoVIP(Osoba wlasciciel, double stanRachunku, double indywidualneOprocentowanie, double limitDebetu) {
        super(wlasciciel, stanRachunku);
        this.indywidualneOprocentowanie = indywidualneOprocentowanie;
        this.limitDebetu = limitDebetu;
    }

    @Override
    public boolean wyplata(double iloscPieniedzydoWyplaty) {
        if (iloscPieniedzydoWyplaty >= limitDebetu + stanRachunku) {
            stanRachunku -= iloscPieniedzydoWyplaty;            // nie działa
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean przelew(double iloscPieniedzydoPrzelewu, Rachunek rachunekDoprzelewu) {
        if (iloscPieniedzydoPrzelewu < stanRachunku + limitDebetu) { // 100zl -> rachunek -100 debet 200 !!!!!! 100 < 1000
            return false;
        } else {
            stanRachunku -= iloscPieniedzydoPrzelewu;
            rachunekDoprzelewu.stanRachunku += iloscPieniedzydoPrzelewu;
            return true;
        }
    }

    @Override
    void aktualizacja() {
        System.out.println("Konto");
        stanRachunku += (stanRachunku * indywidualneOprocentowanie) / 100;
    }

    @Override
    public String toString() {
        return "KontoVIP{" +
                "osoba='" + wlasciciel + '\'' +
                ", stanRachunku=" + stanRachunku +
                '}';
    }

}
