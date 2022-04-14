package zajecia03.zadanieinterfejsy;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Plane plane = new Plane();
        UFO ufo = new UFO();
        Virus virus = new Virus();

        Flyable [] flyables = {bird, plane, ufo, virus};
        Flyable shortestDistance = getShortestDistance(flyables);
        System.out.println(shortestDistance);
    }

    public static Flyable getShortestDistance(Flyable [] flyables) {
        Flyable shortest = flyables[0];
        for (int i = 0; i < flyables.length; i++) {
            if (flyables[i].distance() < shortest.distance()) {
                shortest = flyables[i];
            }
        }
        return shortest;
    }
}
