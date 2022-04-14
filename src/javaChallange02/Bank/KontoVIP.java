package javaChallange02.Bank;


public class KontoVIP extends Konto {

    protected static double indywidualneOprocentowanie;
    protected double limitDebetu;

    public KontoVIP(String wlasciciel, double stanRachunku, double indywidualneOprocentowanie, double limitDebetu) {
        super(wlasciciel, stanRachunku);
        this.indywidualneOprocentowanie = indywidualneOprocentowanie;
        this.limitDebetu = limitDebetu;

    }


    @Override
    public boolean wyplata(double iloscPieniedzyDoWyplaty) {
        if (iloscPieniedzyDoWyplaty <= stanRachunku + limitDebetu) {
            stanRachunku -= iloscPieniedzyDoWyplaty;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void aktualizacja() {
        System.out.println("KontoVIP");
        stanRachunku += (indywidualneOprocentowanie * stanRachunku) / 100;
    }


    @Override
    public boolean przelew(Rachunek rachunekDocelowy, double iloscPieniedzyDoPrzelewu) {
        if (iloscPieniedzyDoPrzelewu <= stanRachunku + limitDebetu) {
            stanRachunku -= iloscPieniedzyDoPrzelewu;
            rachunekDocelowy.stanRachunku += iloscPieniedzyDoPrzelewu;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "KontoVIP{" +
                "limitDebetu=" + limitDebetu +
                ", stanRachunku=" + stanRachunku +
                ", wlasciciel=" + wlasciciel +
                '}';
    }


}
