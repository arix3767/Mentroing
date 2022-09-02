package zajecia21;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Consumer<String> wysietl = System.out::println;
        wysietl.accept("Czesc");

        Supplier<Double> pobierz = Math::random;
        System.out.println(pobierz.get());

        Predicate<Integer> sprawdz = liczba -> liczba % 3 == 0;
        System.out.println(sprawdz.test(3));

        Function<String, Integer> zwrocDlugosc = String::length;
        System.out.println(zwrocDlugosc.apply("lala"));

        //        Predicate<Integer> sprawdz = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 3 == 0;
//            }
//        };
    }

    public static void metoda1() {
        for (int liczba = 0; liczba <= 100; liczba++) {
            if (liczba % 3 == 0 && liczba % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (liczba % 3 == 0) {
                System.out.println("Fizz");
            } else if (liczba % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(liczba);
            }
        }
    }

    public static void metoda2() {
        List<Character> listaLiter = new LinkedList<>();
        for (char litera = 'A'; litera <= 'Z'; litera++) {
            listaLiter.add(litera);
        }
        Collections.reverse(listaLiter);
        System.out.println(listaLiter);
    }

    public static void metoda3() {
        List<String> imiona = new LinkedList<>();
        imiona.add("Zosia");
        imiona.add("Karolina");
        imiona.add("Faustynm");
        imiona.add("Beata");

        Collections.sort(imiona, new Komparator());
        Collections.sort(imiona, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.sort(imiona, (o1, o2) -> o2.compareTo(o1));
        Collections.sort(imiona, Comparator.reverseOrder());

        imiona.sort(Comparator.reverseOrder());
        System.out.println(imiona);
    }

    public static void metoda4() {
        List<Integer> listaLiczb = IntStream.rangeClosed(1, 100)
                .boxed()
                .toList();
        System.out.println(listaLiczb);
    }

}
