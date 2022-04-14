package javaChallange02.Bank;


public class Konto extends Rachunek {

    protected static double oprocentowanie = 3;

    public Konto(String wlasciciel, double stanRachunku) {
        super(wlasciciel, stanRachunku);
    }


    static void zmienOprocentowanie(double oprocentowanie) {
        oprocentowanie++;
    }

    @Override
    public void aktualizacja() {
        System.out.println("Konto");
        stanRachunku += (oprocentowanie * stanRachunku) / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
