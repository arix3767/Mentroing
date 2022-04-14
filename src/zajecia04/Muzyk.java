package zajecia04;

abstract class Muzyk {
    private String imie;
    private double czasWystapienia;

    public Muzyk(String imie, double czasWystąienia) {
        this.imie = imie;
        this.czasWystapienia = czasWystąienia; // bez polskich znakow!
    }

    //TODO czy to na pewno powinen byc void?!
    public abstract String instrument(); //nazwa metody -> czasownik! -> getInstrument()! pobierz/zobacz....

    public abstract double stawkaGodzinowa();

    public String getImie() {
        return imie;
    }

    public double getCzasWystapienia() {
        return czasWystapienia;
    }

    public static Muzyk maxHonorarium(Muzyk[] muzycy) {
        Muzyk zarobilNajwiecej = muzycy[0];
        for (int i = 0; i < muzycy.length; i++) {
            if (obliczZarobki(zarobilNajwiecej) < obliczZarobki(muzycy[i])){
                zarobilNajwiecej = muzycy[i];
            }
        }
        return zarobilNajwiecej;
    }

    private static double obliczZarobki(Muzyk muzyk) {
        return muzyk.stawkaGodzinowa() * muzyk.getCzasWystapienia();
    }

    @Override
    public String toString() {
        return "Muzyk{" +
                "imie='" + imie + '\'' +
                ", czasWystapienia=" + czasWystapienia +
                "stawka " + stawkaGodzinowa()  + '}';
    }
}
