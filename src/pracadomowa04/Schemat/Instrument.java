package pracadomowa04.Schemat;

abstract class Instrument {
    protected String nazwa;
    protected double waga;
    protected double skala;

    public Instrument(String nazwa, double waga, double skala) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.skala = skala;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "nazwa='" + nazwa + '\'' +
                ", waga=" + waga +
                ", skala=" + skala +
                '}';
    }
}
