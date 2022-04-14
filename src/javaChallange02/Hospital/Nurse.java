package javaChallange02.Hospital;

public class Nurse extends Person {

    protected double overtime;

    public Nurse(String imie, String nazwisko, double wysokoscWyplaty, double overtime) {
        super(imie, nazwisko, wysokoscWyplaty);
        this.overtime = overtime;

    }
}
