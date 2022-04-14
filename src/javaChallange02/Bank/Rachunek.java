package javaChallange02.Bank;


public class Rachunek {

    protected double stanRachunku;
    protected String wlasciciel;

    public Rachunek(String wlasciciel, double stanRachunku) {
        this.wlasciciel = wlasciciel;
        this.stanRachunku = stanRachunku;
    }


    public boolean wplata(double iloscPieniedzyDoWplaty) {
        if (iloscPieniedzyDoWplaty > 0) {
            stanRachunku += iloscPieniedzyDoWplaty;
            return true;
        } else {
            return false;
        }
    }

    public boolean wyplata(double iloscPieniedzyDoWyplaty) {
        if (iloscPieniedzyDoWyplaty >= 0 && stanRachunku >= iloscPieniedzyDoWyplaty) {
            stanRachunku -= iloscPieniedzyDoWyplaty;
            return true;
        } else {
            return false;
        }
    }

    public boolean przelew(Rachunek rachunekDocelowy, double iloscPieniedzyDoPrzelewu) {
//        if (iloscPieniedzyDoPrzelewu <= stanRachunku) {
//            stanRachunku -= iloscPieniedzyDoPrzelewu;
//            rachunekDocelowy.stanRachunku += iloscPieniedzyDoPrzelewu;
//            return true;
//        } else {
//            return false;
//        }
        boolean stanOperacji = wyplata(iloscPieniedzyDoPrzelewu);
        if (stanOperacji) {
            rachunekDocelowy.wplata(iloscPieniedzyDoPrzelewu);
        }
        return stanOperacji;
    }

    public void aktualizacja() {
        System.out.println("Rachunek podstawowy");
    }

    @Override
    public String toString() {
        return "Rachunek{" +
                "stanRachunku=" + stanRachunku +
                ", wlasciciel='" + wlasciciel + '\'' +
                '}';
    }
}
