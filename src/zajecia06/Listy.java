package zajecia06;

import java.util.ArrayList;

public class Listy {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(1);
        liczby.add(10);
        liczby.add(100);
        liczby.add(50);
        liczby.add(13);

        System.out.println(liczby.contains(100));
        System.out.println(liczby.isEmpty());
        //TODO https://programuj.pl/blog/java-listy

        // Jak wyswietlic wszytskie elemnty?
        for (int i = 0; i < liczby.size(); i++) {
            System.out.println(liczby.get(i)); // tablica[index]
        }

        // Jak wyswietlic lepiej?
        for (Integer zmienna : liczby) { // liczba -> liczba = tablica[i]
            System.out.println("Liczba z listy to " + zmienna);
        }

        for(Integer integery: liczby){
            if (integery > 10){
                System.out.println(integery);
            }
        }

    }
}
