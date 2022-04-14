package pracadomowa;

import zajecia01.Osoba;

public class Konto extends Rachunek {

   protected static double oprocentowanie = 3;  // dane w procentach

    //TODO poprawic
    public Konto(Osoba wlasciciel, double stanRachunku) {
        super(wlasciciel, stanRachunku);
    }

    private static void zmienOprocentowanie(double oprocentowanie) {
        oprocentowanie++;
    }

    @Override
    void aktualizacja() {
        System.out.println("Konto");
        stanRachunku += (stanRachunku * oprocentowanie) / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
