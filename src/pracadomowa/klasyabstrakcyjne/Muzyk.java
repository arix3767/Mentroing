package pracadomowa.klasyabstrakcyjne;

abstract class Muzyk {
    private String imie;
    private double czasWystąienia;

    public Muzyk(String imie, double czasWystąienia) {
        this.imie = imie;
        this.czasWystąienia = czasWystąienia; // bez polskich znakow!
    }

    public abstract void instrument(); //nazwa metody -> czasownik! -> getInstrument()! pobierz/zobacz....

    public abstract void stawkaGodzinowa();


    public String getImie() {
        return imie;
    }

    public double getCzasWystąienia() {
        return czasWystąienia;
    }


}
