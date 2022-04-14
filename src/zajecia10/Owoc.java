package zajecia10;

abstract class Owoc {

    protected String nazwa;
    protected String kolor;

    public Owoc(String nazwa, String kolor) {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
    void say() {
        System.out.println(nazwa);
    }

    @Override
    public String toString() {
        return "Owoc{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
