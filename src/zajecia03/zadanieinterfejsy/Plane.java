package zajecia03.zadanieinterfejsy;

public class Plane implements Flyable, Speakable{
    @Override
    public String drive() {
        return "silnik";
    }

    @Override
    public double distance() {
        return 100;
    }

    @Override
    public String speak() {
        return "wrrr";
    }
}
