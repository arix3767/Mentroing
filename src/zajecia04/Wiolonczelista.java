package zajecia04;

class Wiolonczelista extends Muzyk {


    public Wiolonczelista(String imie, double czasWystąienia) {
        super(imie, czasWystąienia);
    }

    @Override
    public String instrument() {
        return "wiolonczela";
    }

    @Override
    public double stawkaGodzinowa() {
        return 250;
    }


}
