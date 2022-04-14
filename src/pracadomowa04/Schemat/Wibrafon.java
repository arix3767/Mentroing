package pracadomowa04.Schemat;

public class Wibrafon extends Perkusyjny {


    public Wibrafon(String nazwa, double waga, double skala) {
        super(nazwa, waga, skala);
    }

    public boolean czyMaSilnicznek(){
        return false;
    }

    @Override
    public String uderz() {
        return "bum bum";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
