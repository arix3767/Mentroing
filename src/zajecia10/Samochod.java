package zajecia10;

public class Samochod {

    public enum Marka {
        MAZDA,
        SKODA,
        BMW,
        VOLVO;
    }

    protected String numerRejestracyjny;
    protected Marka marka;

    Samochod(String numerRejestracyjny, Marka marka) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return marka + " " + numerRejestracyjny;
    }
}
