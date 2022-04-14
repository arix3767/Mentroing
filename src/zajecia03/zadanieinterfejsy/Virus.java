package zajecia03.zadanieinterfejsy;

public class Virus implements Speakable, Flyable {
    @Override
    public String drive() {
        return "air";
    }

    @Override
    public double distance() {
        return 1;
    }

    @Override
    public String speak() {
        return "whwhw";
    }

    @Override
    public String toString() {
        return "To jest obiekt klasy Virus";
    }
}
