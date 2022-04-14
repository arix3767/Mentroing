package zajecia04;

class Flecista extends Muzyk {

    public Flecista(String imie, double czasWystąienia) {
        super(imie, czasWystąienia);
    }

    @Override
    public String instrument() {
        return "flet";
    }

    @Override
    public double stawkaGodzinowa() {
        return 300;
    }

}
