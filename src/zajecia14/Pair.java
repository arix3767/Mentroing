package zajecia14;

public class Pair<T,K> {

    T pole1;
    K pole2;

    public Pair(T pole1, K pole2) {
        this.pole1 = pole1;
        this.pole2 = pole2;
    }

    public static <T> void wypisz(T t){
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "pole1=" + pole1 +
                ", pole2=" + pole2 +
                '}';
    }
}
