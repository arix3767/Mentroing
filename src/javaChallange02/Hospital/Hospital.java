package javaChallange02.Hospital;

public class Hospital extends Person {

    Person[] pracownicy = new Person[3];
    private int index = 0;

    public Hospital(String imie, String nazwisko, double wysokoscWyplaty) {
        super(imie, nazwisko, wysokoscWyplaty);
    }

    public boolean dodajPracownika(Person person) {
        if (index <= 2) {
            pracownicy[index++] = person;
            return true;            //TODO przetestowac metode
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wysokoscWyplaty=" + wysokoscWyplaty +
                '}';
    }
}
