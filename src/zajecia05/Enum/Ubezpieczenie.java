package zajecia05.Enum;

public enum Ubezpieczenie {
    MINI(true,false,false),
    MEDIUM(true,true,false),
    MAXI(true,true,true);

    private boolean ubezpieczenieTelefonu;
    private boolean ubezpieczenieSamochodu;
    private boolean ubezpieczenieDomu;

    Ubezpieczenie(boolean ubezpieczenieTelefonu, boolean ubezpieczenieSamochodu, boolean ubezpieczenieDomu) {
        this.ubezpieczenieTelefonu = ubezpieczenieTelefonu;
        this.ubezpieczenieSamochodu = ubezpieczenieSamochodu;
        this.ubezpieczenieDomu = ubezpieczenieDomu;
    }

    public static void wypiszInformacje() {
        Ubezpieczenie[] values = Ubezpieczenie.values(); // do zapamietania! //metoda zwraca wszystkie wartosci danego enuma
        for (int i = 0; i < values.length; i++) {
            System.out.println("NAZWA PAKIETU - " + values[i]);
            System.out.println("Co zawiera");
            System.out.println("Telefon - " + values[i].ubezpieczenieTelefonu);
            System.out.println("Samochod - " + values[i].ubezpieczenieSamochodu);
            System.out.println("Dom - " + values[i].ubezpieczenieDomu);
        }

    }

    /*
    MINI
    ubezpiecniee telefonu - true
     */
}
