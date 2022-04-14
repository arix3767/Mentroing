package zajecia04;

class Skrzypek extends Muzyk {

    public Skrzypek(String imie, double czasWystapienia) {
        super(imie, czasWystapienia);
    }

    @Override
    public String instrument() {
        return "skrzypce";
    }

    @Override
    public double stawkaGodzinowa() {
        return 200;
    }
}
