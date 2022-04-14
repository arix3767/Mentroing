package zajecia02;

public abstract class KlasaAbstrakcyjna { // 1. Slowko abstract!
    public KlasaAbstrakcyjna() {
        System.out.println("Konstruktor!");
    }

    public abstract void test(); //metoda abstrakcyjna to metoda, ktora nie ma ciala!
}
