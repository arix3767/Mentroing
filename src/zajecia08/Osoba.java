package zajecia08;

public class Osoba implements Comparable<Osoba> {

    protected String imie;
    protected int rokUrodzenia;
    protected String naziwsko;
    protected double wzrost;

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", naziwsko='" + naziwsko + '\'' +
                ", wzrost=" + wzrost +
                '}';
    }

    public Osoba(String imie, int rokUrodzenia, String naziwsko, double wzrost) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.naziwsko = naziwsko;
        this.wzrost = wzrost;
    }

    @Override
    public int compareTo(Osoba o) {
        return Double.compare(this.wzrost, o.wzrost);
    }
}
