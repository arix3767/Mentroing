package javaChallange02.Hospital;

public class Doctor extends Person {

    protected double bonus;

    public Doctor(String imie, String nazwisko, double wysokoscWyplaty,double bonus) {
        super(imie, nazwisko, wysokoscWyplaty);
        this.bonus = bonus;
    }
}
