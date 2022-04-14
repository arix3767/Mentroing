package zajecia01;

public class Owoc {

    String nazwa;
    double waga;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.waga = Math.random() * 0.3 + 0.5;
    }

    public void wyswietlOwoc() {
        System.out.println(nazwa);
        System.out.println(waga);
    }
}
