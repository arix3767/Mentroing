package javaChallange02;

public class Employee {

    protected String imie;
    protected String nazwisko;
    protected int rokUrodzenia;
    protected double stazPracy;

    public Employee(String imie, String nazwisko, int rokUrodzenia, double stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.stazPracy = stazPracy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", stazPracy=" + stazPracy +
                '}';
    }
}
