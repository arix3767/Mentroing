package pracadomowa04.Schemat;

abstract class Perkusyjny extends Instrument {

    public Perkusyjny(String nazwa, double waga, double skala) {
        super(nazwa, waga, skala);
    }

    public boolean czyOkreslonaWysDzwieku(double skala) throws Exception {
        if (skala < 100) {
            throw new Exception("zbyt niska wysokosc dzwieku");
        } else return true;

    }

    public abstract String uderz();

    @Override
    public String toString() {
        return super.toString();
    }
}
