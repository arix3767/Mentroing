package zajecia05.ForEach;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(10);
        liczby.add(1);
        liczby.add(434);
        liczby.add(565);
        liczby.add(123);
        liczby.add(12223454);
        liczby.add(242576);

        System.out.println("Fori");
        for (int i = 0; i < liczby.size(); i++) {
            System.out.println(liczby.get(i));
        }

        System.out.println("For-each");
        for (Integer wartosc : liczby) {
            wartosc = 100;
            // liczby.get(i) = 100
            // 10 = 100;
        }

        for (int i = 0; i < liczby.size(); i++) {
            System.out.println(liczby.get(i));
        }

    }
}
