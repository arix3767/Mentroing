package zajecia03.zadanieinterfejsy;

public class Bird implements Flyable, Speakable {

    @Override
    public String drive() {
        return "skrzydła";
    }

    @Override
    public double distance() {
        return 10;
    }

    @Override
    public String speak() {
        return "cwir cwir";
    }
}
