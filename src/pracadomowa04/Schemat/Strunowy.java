package pracadomowa04.Schemat;

abstract class Strunowy extends Instrument {

    int liczbaStrun;

    public Strunowy(String nazwa, double waga, double skala, int liczbaStrun) {
        super(nazwa, waga, skala);
        this.liczbaStrun = liczbaStrun;
    }

    @Override
    public String toString() {
        return "Strunowy{" +
                "liczbaStrun=" + liczbaStrun +
                '}';
    }
}
