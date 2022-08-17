package zajecia14;

public class Main {
    public static void main(String[] args) {
        //napisac klasę
        Pair<String, Integer> para = new Pair<String, Integer>("Janek", 19);
        Pair<Double, Integer> para2 = new Pair<Double, Integer>(1.d, 19);
        Pair<String, String> para3 = new Pair<String, String>("Hello", "World");

        Pair.<Integer>wypisz(1);
        Pair.<String>wypisz("lala");

    }
}
