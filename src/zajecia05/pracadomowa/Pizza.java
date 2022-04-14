package zajecia05.pracadomowa;

public enum Pizza {
    MARGHERITA(true,true,false,false),
    CAPRICIOSA(true,true,true,false),
    PROSCIUTTO(true,true,false,true);

    protected boolean sosPomidorowy;
    protected boolean ser;
    protected boolean pieczarki;
    protected boolean szynka;

    Pizza(boolean sosPomidorowy, boolean ser, boolean pieczarki, boolean szynka) {
        this.sosPomidorowy = sosPomidorowy;
        this.ser = ser;
        this.pieczarki = pieczarki;
        this.szynka = szynka;
    }

    public void wyswietlInformacje() {
        System.out.println("Co zawiera");
        System.out.println("sos pomidorowy - " + this.sosPomidorowy);
        System.out.println("ser - " + this.ser);
        System.out.println("pieczarki - " + this.pieczarki);
        System.out.println("szynka - " + this.szynka);
    }

}
