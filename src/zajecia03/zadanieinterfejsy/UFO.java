package zajecia03.zadanieinterfejsy;

public class UFO implements Speakable, Flyable {
    @Override
    public String drive() {
        return "silnik";
    }

    @Override
    public double distance() {
        return 1000;
    }

    @Override
    public String speak() {
        return "gehberg";
    }
}
