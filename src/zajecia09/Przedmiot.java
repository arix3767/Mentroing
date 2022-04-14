package zajecia09;

public class Przedmiot {
    private String nazwaprzedmiotu;

    public String getNazwaprzedmiotu() {
        return nazwaprzedmiotu;
    }

    public Przedmiot(String nazwaprzedmiotu) {
        this.nazwaprzedmiotu = nazwaprzedmiotu;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwaprzedmiotu='" + nazwaprzedmiotu + '\'' +
                '}';
    }
}
